package ecpay.payment.integration.verification;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ecpay.payment.integration.domain.InvoiceObj;
import ecpay.payment.integration.ecpayOperator.PaymentVerifyBase;
import ecpay.payment.integration.errorMsg.ErrorMessage;
import ecpay.payment.integration.exception.EcpayException;

public class VerifyAioCheckOut extends PaymentVerifyBase {

	public VerifyAioCheckOut(){
		super();
	}
	
	public String getAPIUrl(String mode) throws EcpayException{
		Element ele = (Element)doc.getElementsByTagName("AioCheckOut").item(0);
		String url = "";
		NodeList nodeList = ele.getElementsByTagName("url");
		for(int i = 0; i < nodeList.getLength(); i++){
			ele = (Element)nodeList.item(i);
			if(ele.getAttribute("type").equalsIgnoreCase(mode)){
				url = ele.getTextContent();
				System.out.println(url);
				break;
			}
		}
		if(url == ""){
			throw new EcpayException(ErrorMessage.OperatingMode_ERROR);
		}
		return url;
	}
	
	public void verifyParams(Object obj){
		Class<?> cls = obj.getClass();
		Method method;
		String objValue;
		List<String> fieldNames = new ArrayList<String>();
		for(Field field : cls.getDeclaredFields()){
			fieldNames.add(field.getName());
		}
		Element ele = (Element)doc.getElementsByTagName("AioCheckOut").item(0);
		NodeList nodeList = ele.getElementsByTagName("param");
		for(int i = 0; i < nodeList.getLength(); i++){
			Element tmpEle = (Element)nodeList.item(i);
			if(fieldNames.contains(tmpEle.getAttribute("name"))){
				try{
					method = cls.getMethod("get"+tmpEle.getAttribute("name"), null);
					objValue = method.invoke(obj, null).toString();
				} catch(Exception e){
					throw new EcpayException(ErrorMessage.OBJ_MISSING_FIELD);
				}
				if(!(obj instanceof InvoiceObj))
					requireCheck(tmpEle.getAttribute("name"), objValue, tmpEle.getAttribute("require").toString());
				valueCheck(tmpEle.getAttribute("type"), objValue, tmpEle);
			} else{
				continue;
			}
		}
	}
	
	public void verifyInvoice(InvoiceObj obj){
		// 1. 比對特殊欄位值相依需求
		// a. [CarruerType]為 1 => CustomerID 不能為空
		if(obj.getCarruerType().equals("1")){ 
			if(obj.getCustomerID().isEmpty())
				throw new EcpayException("CustomerID cannot be empty when CarruerType is 1.");
		} else if(!obj.getCustomerID().isEmpty()){ // [CustomerID]不為空 => CarruerType 不能為空
			if(obj.getCarruerType().isEmpty())
				throw new EcpayException("CarruerType cannot be empty when CustomerID is not empty.");
		}
		// b. 列印註記[Print]為1 => CustomerName, CustomerAddr
		if(obj.getPrint().equals("1")){
			if(obj.getCustomerName().isEmpty() || obj.getCustomerAddr().isEmpty())
				throw new EcpayException("CustomerName and CustomerAddr cannot be empty when Print is 1.");
			if(!obj.getCustomerID().isEmpty())
				throw new EcpayException("Print cannot be 1 when CustomerID is not empty.");
		}
		// c. CustomerPhone和CustomerEmail至少一個有值
		if(obj.getCustomerPhone().isEmpty() && obj.getCustomerEmail().isEmpty())
			throw new EcpayException("CustomerPhone and CustomerEmail cannot both be empty.");
		// d. [TaxType]為 2 => ClearanceMark = 1 or 2
		if(obj.getTaxType().equals("2"))
			if(!obj.getClearanceMark().equals("1") && !obj.getClearanceMark().equals("2"))
				throw new EcpayException("ClearanceMark has to be 1 or 2 when TaxType is 2.");
		// e. 統一編號[CustomerIdentifier]有值時 => CarruerType != 1 or 2, *Donation = 2, print = 1
		if(!obj.getCustomerIdentifier().isEmpty()){
			if(obj.getCarruerType().equals("1") || obj.getCarruerType().equals("2"))
				throw new EcpayException("CarruerType cannot be 1 or 2 when CustomerIdentifier is given");
			if(!obj.getDonation().equals("2") || !obj.getPrint().equals("1"))
				throw new EcpayException("Print must be 1 and Donation must be 2 when CustomerIdentifier is given.");
		}
		// f. CarruerType有值時=> Print = 0
		if(!obj.getCarruerType().isEmpty())
			if(obj.getPrint().equals("1"))
				throw new EcpayException("Print must be 0 when CarruerType is given.");
		// [CarruerType]為'' or 1 時 => CarruerNum = '', [CarruerType]為 2， CarruerNum = 固定長度為 16 且格式為 2 碼大小寫字母加上 14 碼數字。 [CarruerType]為 3 ，帶固定長度為 8 且格式為 1 碼斜線「/」加上由 7 碼數字及大小寫字母組成
		if(obj.getCarruerType().isEmpty() || obj.getCarruerType().equals("1")){
			if(!obj.getCarruerNum().isEmpty())
				throw new EcpayException("CarruerNum must be empty when CarruerType is empty or 1.");
		} else if(obj.getCarruerType().equals("2")){
			Pattern r = Pattern.compile("[A-Za-z]{2}[0-9]{14}");
			Matcher m = r.matcher(obj.getCarruerNum()); 
			if(!m.find())
				throw new EcpayException("CarruerNum must be 2 alphabets and 14 numbers when CarruerType is 2.");
		} else if(obj.getCarruerType().equals("3")){
			Pattern r = Pattern.compile("^\\/[A-Za-z0-9\\s+-]{7}$");
			Matcher m = r.matcher(obj.getCarruerNum());
			if(!m.find())
				throw new EcpayException("CarruerNum must start with / followed by 7 alphabet and number characters when CarruerType is 3.");
		} else
			throw new EcpayException("Unexpected Value in CarruerType");
		// Donation = 1 => LoveCode不能為空, print = 0
		if(obj.getDonation().equals("1")){
			if(obj.getLoveCode().isEmpty())
				throw new EcpayException("LoveCode cannot be empty when Donation is 1.");
			if(!obj.getPrint().equals("0"))
				throw new EcpayException("Print must be 0 when Donation is 1.");
		}
		// 2. 比對商品名稱，數量，單位，價格，tax項目數量是否一致
		if(obj.getInvoiceItemName().isEmpty())
			throw new EcpayException("InvoiceItemName cannot be empty.");
		else if(obj.getInvoiceItemCount().isEmpty())
			throw new EcpayException("InvoiceItemCount cannot be empty.");
		else if(obj.getInvoiceItemWord().isEmpty())
			throw new EcpayException("InvoiceItemWord cannot be empty.");
		else if(obj.getInvoiceItemPrice().isEmpty())
			throw new EcpayException("InvoiceItemPrice cannot be empty.");
		else if(obj.getInvoiceItemTaxType().isEmpty())
			throw new EcpayException("InvoiceItemTaxType cannot be empty.");
		// 商品名稱含有管線 => 認為是多樣商品 *InvoiceItemName， *InvoiceItemCount ，*InvoiceItemWord， *InvoiceItemPrice InvoiceItemTaxType逐一用管線分割，計算數量後與第一個比對
		if(obj.getInvoiceItemName().contains("|")){
			int itemCount = obj.getInvoiceItemName().split("|").length;
			int paramCount = 0;
			Pattern r = Pattern.compile("(\\|\\||^\\||\\|$)");
			Matcher invCount = r.matcher(obj.getInvoiceItemCount());
			Matcher invWord = r.matcher(obj.getInvoiceItemWord());
			Matcher invPrice = r.matcher(obj.getInvoiceItemPrice());
			Matcher invType = r.matcher(obj.getInvoiceItemTaxType());
			if(invCount.find()){
				throw new EcpayException("InvoiceItemCount contains empty value.");
			} else{
				paramCount = obj.getInvoiceItemCount().split("|").length;
				if(itemCount != paramCount)
					throw new EcpayException("Count of item info InvoiceItemCount(" + paramCount + ") not match item count from InvoiceItemName(" + itemCount + ")");
			}
			if(invWord.find()){
				throw new EcpayException("InvoiceItemWord contains empty value.");
			} else{
				paramCount = obj.getInvoiceItemWord().split("|").length;
				if(itemCount != paramCount)
					throw new EcpayException("Count of item info InvoiceItemWord(" + paramCount + ") not match item count from InvoiceItemName(" + itemCount + ")");
			}
			if(invPrice.find()){
				throw new EcpayException("InvoiceItemPrice contains empty value.");
			} else{
				paramCount = obj.getInvoiceItemPrice().split("|").length;
				if(itemCount != paramCount)
					throw new EcpayException("Count of item info InvoiceItemPrice(" + paramCount + ") not match item count from InvoiceItemName(" + itemCount + ")");
			}
			if(invType.find()){
				throw new EcpayException("InvoiceItemTaxType contains empty value.");
			} else{
				paramCount = obj.getInvoiceItemTaxType().split("|").length;
				if(itemCount != paramCount)
					throw new EcpayException("Count of item info InvoiceItemTaxType(" + paramCount + ") not match item count from InvoiceItemName(" + itemCount + ")");
			}
			// 課稅類別[TaxType] = 9 時 => InvoiceItemTaxType 能含有1,2 3(and at least contains one 1 and other)
			String[] itemTax = obj.getInvoiceItemTaxType().split("|");
			for(String tax : itemTax){
				if(tax.equals("1") || tax.equals("2") || tax.equals("3"))
					continue;
				else
					throw new EcpayException("Ilegal InvoiceItemTaxType: " + tax);
			}
			if(obj.getTaxType().equals("9")){
				if(!itemTax.toString().contains("1"))
					throw new EcpayException("InvoiceItemTaxType must contain at least one 1.");
				if(itemTax.toString().contains("2") && itemTax.toString().contains("3"))
					throw new EcpayException("InvoiceItemTaxType cannot contain 2 and 3 at the same time.");
			}
		} else{
			// 沒有管線 => 逐一檢查後4項有無管線
			if(obj.getInvoiceItemCount().contains("|"))
				throw new EcpayException("Item info InvoiceItemCount contains pipeline delimiter but there's only one item in param InvoiceItemName.");
			else if(obj.getInvoiceItemWord().contains("|"))
				throw new EcpayException("Item info InvoiceItemWord contains pipeline delimiter but there's only one item in param InvoiceItemName.");
			else if(obj.getInvoiceItemPrice().contains("|"))
				throw new EcpayException("Item info InvoiceItemPrice contains pipeline delimiter but there's only one item in param InvoiceItemName.");
			else if(obj.getInvoiceItemTaxType().contains("|"))
				throw new EcpayException("Item info InvoiceItemTaxType contains pipeline delimiter but there's only one item in param InvoiceItemName.");
		}
		// 4 比對所有欄位Pattern
		verifyParams(obj);
	}
}
