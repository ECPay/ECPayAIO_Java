package ecpay.payment.integration;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import ecpay.payment.integration.domain.ATMRequestObj;
import ecpay.payment.integration.domain.AioCheckOutALL;
import ecpay.payment.integration.domain.AioCheckOutATM;
import ecpay.payment.integration.domain.AioCheckOutBARCODE;
import ecpay.payment.integration.domain.AioCheckOutCVS;
import ecpay.payment.integration.domain.AioCheckOutDevide;
import ecpay.payment.integration.domain.AioCheckOutOneTime;
import ecpay.payment.integration.domain.AioCheckOutPeriod;
import ecpay.payment.integration.domain.AioCheckOutWebATM;
import ecpay.payment.integration.domain.CVSOrBARCODERequestObj;
import ecpay.payment.integration.domain.CreateServerOrderObj;
import ecpay.payment.integration.domain.DoActionObj;
import ecpay.payment.integration.domain.FundingReconDetailObj;
import ecpay.payment.integration.domain.InvoiceObj;
import ecpay.payment.integration.domain.QueryCreditCardPeriodInfoObj;
import ecpay.payment.integration.domain.QueryTradeInfoObj;
import ecpay.payment.integration.domain.QueryTradeObj;
import ecpay.payment.integration.domain.TradeNoAioObj;
import ecpay.payment.integration.ecpayOperator.EcpayFunction;
import ecpay.payment.integration.errorMsg.ErrorMessage;
import ecpay.payment.integration.exception.EcpayException;
import ecpay.payment.integration.verification.VerifyAioCheckOut;
import ecpay.payment.integration.verification.VerifyCreateServerOrder;
import ecpay.payment.integration.verification.VerifyDoAction;
import ecpay.payment.integration.verification.VerifyFundingReconDetail;
import ecpay.payment.integration.verification.VerifyQueryCreditTrade;
import ecpay.payment.integration.verification.VerifyQueryTrade;
import ecpay.payment.integration.verification.VerifyQueryTradeInfo;
import ecpay.payment.integration.verification.VerifyTradeNoAio;

/**
 * 全功能無履約保證類別
 * @author mark.chiu
 *
 */
public class AllInOne extends AllInOneBase{
	
	private final static Logger log = Logger.getLogger(AllInOne.class.getName());
	
	/**
	 * AllInOne Constructor
	 * 參數帶入log4j.properties的路徑，若帶入空字串則預設不產生log
	 * @param log4jPropertiesPath
	 */
	public AllInOne(String log4jPropertiesPath){
		super();
		if(log4jPropertiesPath != "" && log4jPropertiesPath != null){
			if(log4jPropertiesPath.substring(log4jPropertiesPath.length()-1) == "/")
				PropertyConfigurator.configure(log4jPropertiesPath + "log4j.properties");
			else
				PropertyConfigurator.configure(log4jPropertiesPath + "/log4j.properties");
		} else{
			Logger.getRootLogger().setLevel(Level.OFF);
		}
	}
	
	/**
	 * 檢查Hashtable中的檢查碼是否正確(確保資料未被竄改)
	 * @param Hashtable params
	 * @return boolean 
	 */
	public boolean compareCheckMacValue(Hashtable<String, String> params){
		String checkMacValue = "";
		if(!params.containsKey("CheckMacValue")){
			throw new EcpayException(ErrorMessage.HASHTABLE_WITHOUT_CHKMACVALUE);
		}
		try {
			checkMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, params);
		} catch (EcpayException e) {
			throw new EcpayException(ErrorMessage.GEN_CHECK_MAC_VALUE_FAIL);
		}
		if(checkMacValue.equals(params.get("CheckMacValue"))){
			return true;
		} else{
			return false;
		}
	}
	
	/**
	 * Apple Pay信用卡授權作業
	 * @param CreateServerOrderobj
	 * @return
	 */
	public String createServerOrder(CreateServerOrderObj obj){
		obj.setPlatformID(PlatformID);
		if(!PlatformID.isEmpty() && obj.getMerchantID().isEmpty()){
			obj.setMerchantID(MerchantID);
		} else if(!PlatformID.isEmpty() && !obj.getMerchantID().isEmpty()){
		} else {
			obj.setMerchantID(MerchantID);
		}
		log.info("createServerOrder params: " + obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			obj.setPaymentToken(EcpayFunction.AESEncode(HashKey, HashIV, obj.getPaymentToken()));
			VerifyCreateServerOrder verify = new VerifyCreateServerOrder();
			createServerOrderUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			CheckMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("createServerOrder generate CheckMacValue: " + CheckMacValue);
			String httpValue = EcpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("createServerOrder post String: " + httpValue);
			result = EcpayFunction.httpPost(createServerOrderUrl, httpValue, "UTF-8");
		} catch(EcpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new EcpayException(e.getNewExceptionMessage());
		} catch(Exception e){
			log.error(e.getMessage());
			throw new EcpayException(e.getMessage());
		}
		return result;
	}
	
	/**
	 * 下載信用卡撥款對帳資料檔的方法
	 * @param fundingReconDetailObj
	 * @return response string
	 */
	public String fundingReconDetail(FundingReconDetailObj fundingReconDetailObj){
		fundingReconDetailObj.setMerchantID(MerchantID);
		log.info("fundingReconDetail params: " + fundingReconDetailObj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyFundingReconDetail verify = new VerifyFundingReconDetail();
			fundingReconDetailUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(fundingReconDetailObj);
			CheckMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, fundingReconDetailObj);
			log.info("fundingReconDetail generate CheckMacValue: " + CheckMacValue);
			String httpValue = EcpayFunction.genHttpValue(fundingReconDetailObj, CheckMacValue);
			log.info("fundingReconDetail post String: " + httpValue);
			result = EcpayFunction.httpPost(fundingReconDetailUrl, httpValue, "BIG5");
			List<String> subRE = new ArrayList<String>();
			Pattern pattern = Pattern.compile("\\d{8}\\,\\d{6}\\,\\d{5}");
			Matcher matcher = pattern.matcher(result);
			while(matcher.find()){
				subRE.add(matcher.group());
			}
			pattern = Pattern.compile("\\,+\\u6bcf\\u65e5\\u5c0f\\u8a08");
			matcher = pattern.matcher(result);
			while(matcher.find()){
				subRE.add(matcher.group());
				break;
			}
			pattern = Pattern.compile("\\,+\\u5408\\u8a08");
			matcher = pattern.matcher(result);
			while(matcher.find()){
				subRE.add(matcher.group());
				break;
			}
			pattern = Pattern.compile("\\u6388\\u6b0a\\u55ae\\u865f");
			matcher = pattern.matcher(result);
			while(matcher.find()){
				subRE.add(matcher.group());
				break;
			}
			for(String tmp : subRE){
				result = result.replace(tmp, "\r\n"+tmp);
			}
			result = result.substring(2);
		} catch (EcpayException e2) {
			e2.ShowExceptionMessage();
			log.error(e2.getNewExceptionMessage());
			throw new EcpayException(e2.getNewExceptionMessage());
		}
		return result;
	}
	
	/**
	 * 查詢信用卡單筆明細記錄的方法
	 * @param queryTradeObj
	 * @return response string
	 */
	public String queryTrade(QueryTradeObj queryTradeObj){
		queryTradeObj.setMerchantID(MerchantID);
		log.info("queryTrade params: " + queryTradeObj.toString());
		String result = "";
		String CheckMacValue = "";
		try {
			VerifyQueryTrade verify = new VerifyQueryTrade();
			queryTradeUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(queryTradeObj);
			CheckMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, queryTradeObj);
			log.info("queryTrade generate CheckMacValue: " + CheckMacValue);
			String httpValue = EcpayFunction.genHttpValue(queryTradeObj, CheckMacValue);
			log.info("queryTrade post String: " + httpValue);
			result = EcpayFunction.httpPost(queryTradeUrl, httpValue, "UTF-8");
		} catch (EcpayException e2) {
			e2.ShowExceptionMessage();
			log.error(e2.getNewExceptionMessage());
			throw new EcpayException(e2.getNewExceptionMessage());
		}
		return result;
	}
	
	/**
	 * 下載會員對帳媒體檔的方法
	 * @param tradeNoAioObj
	 * @return response string
	 */
	public String tradeNoAio(TradeNoAioObj tradeNoAioObj){
		tradeNoAioObj.setMerchantID(MerchantID);
		log.info("tradeNoAio params: " + tradeNoAioObj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyTradeNoAio verify = new VerifyTradeNoAio();
			tradeNoAioUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(tradeNoAioObj);
			CheckMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, tradeNoAioObj);
			log.info("tradeNoAio generate CheckMacValue: " + CheckMacValue);
			String httpValue = EcpayFunction.genHttpValue(tradeNoAioObj, CheckMacValue);
			log.info("tradeNoAio post String: " + httpValue);
			result = EcpayFunction.httpPost(tradeNoAioUrl, httpValue, "BIG5");
			List<String> subRE = new ArrayList<String>();
			if(tradeNoAioObj.getMediaFormated().equals("0")){
				Pattern pattern = Pattern.compile("\\d{4}\\-\\d{2}\\-\\d{2} \\d{2}:\\d{2}:\\d{2},\\d{16}");
				Matcher matcher = pattern.matcher(result);
				while(matcher.find()){
					subRE.add(matcher.group());
				}
				for(String tmp : subRE){
					result = result.replace(tmp, "\r\n"+tmp);
				}
			} else if(tradeNoAioObj.getMediaFormated().equals("1")){
				result = result.replace("=", "");
				Pattern pattern = Pattern.compile("\"\\d{4}\\/\\d{2}\\/\\d{2} \\d{2}:\\d{2}:\\d{2}\"");
				Matcher matcher = pattern.matcher(result);
				while(matcher.find()){
					subRE.add(matcher.group());
				}
				for(String tmp : subRE){
					result = result.replace(tmp, "\r\n"+tmp);
				}
			}
		} catch (EcpayException e2) {
			e2.ShowExceptionMessage();
			log.error(e2.getNewExceptionMessage());
			throw new EcpayException(e2.getNewExceptionMessage());
		}
		return result;
	}
	
	/**
	 * 信用卡關帳/退刷/取消/放棄的方法
	 * @param doActionObj
	 * @return response string
	 */
	public String doAction(DoActionObj doActionObj){
		doActionObj.setPlatformID(PlatformID);
		if(!PlatformID.isEmpty() && doActionObj.getMerchantID().isEmpty()){
			doActionObj.setMerchantID(MerchantID);
		} else if(!PlatformID.isEmpty() && !doActionObj.getMerchantID().isEmpty()){
		} else {
			doActionObj.setMerchantID(MerchantID);
		}
		String result = "";
		String CheckMacValue = "";
		try {
			VerifyDoAction verify = new VerifyDoAction();
			doActionUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(doActionObj);
			CheckMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, doActionObj);
			log.info("doAction generate CheckMacValue: " + CheckMacValue);
			String httpValue = EcpayFunction.genHttpValue(doActionObj, CheckMacValue);
			log.info("doAction post String: " + httpValue);
			result = EcpayFunction.httpPost(doActionUrl, httpValue, "UTF-8");
		} catch (EcpayException e2){
			e2.ShowExceptionMessage();
			log.error(e2.getNewExceptionMessage());
			throw new EcpayException(e2.getNewExceptionMessage());
		}
		return result;
	}
	
	/**
	 * 查詢訂單資料的方法
	 * @param queryTradeInfoObj
	 * @return response string
	 */
	public String queryTradeInfo(QueryTradeInfoObj queryTradeInfoObj){
		queryTradeInfoObj.setPlatformID(PlatformID);
		if(!PlatformID.isEmpty() && queryTradeInfoObj.getMerchantID().isEmpty()){
			queryTradeInfoObj.setMerchantID(MerchantID);
		} else if(!PlatformID.isEmpty() && !queryTradeInfoObj.getMerchantID().isEmpty()){
		} else {
			queryTradeInfoObj.setMerchantID(MerchantID);
		}
		queryTradeInfoObj.setTimeStamp(EcpayFunction.genUnixTimeStamp());
		String result = "";
		String CheckMacValue = "";
		try {
			VerifyQueryTradeInfo verify = new VerifyQueryTradeInfo();
			queryTradeInfoUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(queryTradeInfoObj);
			CheckMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, queryTradeInfoObj);
			log.info("queryTradeInfo generate CheckMacValue: " + CheckMacValue);
			String httpValue = EcpayFunction.genHttpValue(queryTradeInfoObj, CheckMacValue);
			log.info("queryTradeInfo post String: " + httpValue);
			result = EcpayFunction.httpPost(queryTradeInfoUrl, httpValue, "UTF-8");
		} catch (EcpayException e2){
			e2.ShowExceptionMessage();
			log.error(e2.getNewExceptionMessage());
			throw new EcpayException(e2.getNewExceptionMessage());
		}
		return result;
	}
	
	/**
	 * 信用卡定期定額訂單查詢
	 * @param queryCreditCardPeriodInfoObj
	 * @return response JSON string
	 */
	public String queryCreditCardPeriodInfo(QueryCreditCardPeriodInfoObj queryCreditCardPeriodInfoObj) {
		queryCreditCardPeriodInfoObj.setMerchantID(MerchantID);
		queryCreditCardPeriodInfoObj.setTimeStamp(EcpayFunction.genUnixTimeStamp());
		log.info("queryCreditCardPeriodeInfo params: " + queryCreditCardPeriodInfoObj.toString());
		String result = "";
		String CheckMacValue = "";
		try {
			VerifyQueryCreditTrade verify = new VerifyQueryCreditTrade();
			queryCreditTradeUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(queryCreditCardPeriodInfoObj);
			CheckMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, queryCreditCardPeriodInfoObj);
			log.info("queryCreditCardPeriodInfo generate CheckMacValue: " + CheckMacValue);
			String httpValue = EcpayFunction.genHttpValue(queryCreditCardPeriodInfoObj, CheckMacValue);
			log.info("queryCreditCardPeriodInfo post String: " + httpValue);
			result = EcpayFunction.httpPost(queryCreditTradeUrl, httpValue, "UTF-8");
		} catch (EcpayException e2){
			e2.ShowExceptionMessage();
			log.error(e2.getNewExceptionMessage());
			throw new EcpayException(e2.getNewExceptionMessage());
		}
		return result;
	}
	
	/**
	 * 產生訂單Html form的方法
	 * @param aioCheckOutObj
	 * @param invoice
	 * @param String
	 */
	public String aioCheckOut(Object obj, InvoiceObj invoice){
		StringBuilder out = new StringBuilder();
		String ignoreParam = "";
		if(obj instanceof AioCheckOutALL){
			((AioCheckOutALL) obj).setPlatformID(PlatformID);
			if(!PlatformID.isEmpty() && ((AioCheckOutALL) obj).getMerchantID().isEmpty()){
				((AioCheckOutALL) obj).setMerchantID(MerchantID);
			} else if(!PlatformID.isEmpty() && !((AioCheckOutALL) obj).getMerchantID().isEmpty()){
			} else {
				((AioCheckOutALL) obj).setMerchantID(MerchantID);
			}
			((AioCheckOutALL) obj).setInvoiceMark(invoice == null? "N" : "Y");
			if(ignorePayment.length > 0){ 
				ignoreParam = Arrays.toString(ignorePayment);
				ignoreParam = ignoreParam.replaceAll(", ", "#");
				ignoreParam = ignoreParam.substring(1, ignoreParam.length()-1);
				((AioCheckOutALL) obj).setIgnorePayment(ignoreParam);
			}
			log.info("aioCheckOutALL params: " + ((AioCheckOutALL) obj).toString());
		} else if(obj instanceof AioCheckOutATM){
			((AioCheckOutATM) obj).setPlatformID(PlatformID);
			if(!PlatformID.isEmpty() && ((AioCheckOutATM) obj).getMerchantID().isEmpty()){
				((AioCheckOutATM) obj).setMerchantID(MerchantID);
			} else if(!PlatformID.isEmpty() && !((AioCheckOutATM) obj).getMerchantID().isEmpty()){
			} else {
				((AioCheckOutATM) obj).setMerchantID(MerchantID);
			}
			((AioCheckOutATM) obj).setInvoiceMark(invoice == null? "N" : "Y");
			log.info("aioCheckOutATM params: " + ((AioCheckOutATM) obj).toString());
		} else if(obj instanceof AioCheckOutBARCODE){
			((AioCheckOutBARCODE) obj).setPlatformID(PlatformID);
			if(!PlatformID.isEmpty() && ((AioCheckOutBARCODE) obj).getMerchantID().isEmpty()){
				((AioCheckOutBARCODE) obj).setMerchantID(MerchantID);
			} else if(!PlatformID.isEmpty() && !((AioCheckOutBARCODE) obj).getMerchantID().isEmpty()){
			} else {
				((AioCheckOutBARCODE) obj).setMerchantID(MerchantID);
			}
			((AioCheckOutBARCODE) obj).setInvoiceMark(invoice == null? "N" : "Y");
			log.info("aioCheckOutBARCODE params: " + ((AioCheckOutBARCODE) obj).toString());
		} else if(obj instanceof AioCheckOutCVS){
			((AioCheckOutCVS) obj).setPlatformID(PlatformID);
			if(!PlatformID.isEmpty() && ((AioCheckOutCVS) obj).getMerchantID().isEmpty()){
				((AioCheckOutCVS) obj).setMerchantID(MerchantID);
			} else if(!PlatformID.isEmpty() && !((AioCheckOutCVS) obj).getMerchantID().isEmpty()){
			} else {
				((AioCheckOutCVS) obj).setMerchantID(MerchantID);
			}
			((AioCheckOutCVS) obj).setInvoiceMark(invoice == null? "N" : "Y");
			log.info("aioCheckOutCVS params: " + ((AioCheckOutCVS) obj).toString());
		} else if(obj instanceof AioCheckOutDevide){
			((AioCheckOutDevide) obj).setPlatformID(PlatformID);
			if(!PlatformID.isEmpty() && ((AioCheckOutDevide) obj).getMerchantID().isEmpty()){
				((AioCheckOutDevide) obj).setMerchantID(MerchantID);
			} else if(!PlatformID.isEmpty() && !((AioCheckOutDevide) obj).getMerchantID().isEmpty()){
			} else {
				((AioCheckOutDevide) obj).setMerchantID(MerchantID);
			}
			((AioCheckOutDevide) obj).setInvoiceMark(invoice == null? "N" : "Y");
			log.info("aioCheckOutDevide params: " + ((AioCheckOutDevide) obj).toString());
		} else if(obj instanceof AioCheckOutOneTime){
			((AioCheckOutOneTime) obj).setPlatformID(PlatformID);
			if(!PlatformID.isEmpty() && ((AioCheckOutOneTime) obj).getMerchantID().isEmpty()){
				((AioCheckOutOneTime) obj).setMerchantID(MerchantID);
			} else if(!PlatformID.isEmpty() && !((AioCheckOutOneTime) obj).getMerchantID().isEmpty()){
			} else {
				((AioCheckOutOneTime) obj).setMerchantID(MerchantID);
			}
			((AioCheckOutOneTime) obj).setInvoiceMark(invoice == null? "N" : "Y");
			log.info("aioCheckOutOneTime params: " + ((AioCheckOutOneTime) obj).toString());
		} else if(obj instanceof AioCheckOutPeriod){
			((AioCheckOutPeriod) obj).setPlatformID(PlatformID);
			if(!PlatformID.isEmpty() && ((AioCheckOutPeriod) obj).getMerchantID().isEmpty()){
				((AioCheckOutPeriod) obj).setMerchantID(MerchantID);
			} else if(!PlatformID.isEmpty() && !((AioCheckOutPeriod) obj).getMerchantID().isEmpty()){
			} else {
				((AioCheckOutPeriod) obj).setMerchantID(MerchantID);
			}
			((AioCheckOutPeriod) obj).setInvoiceMark(invoice == null? "N" : "Y");
			log.info("aioCheckOutPeriod params: " + ((AioCheckOutPeriod) obj).toString());
		}  else if(obj instanceof AioCheckOutWebATM){
			((AioCheckOutWebATM) obj).setPlatformID(PlatformID);
			if(!PlatformID.isEmpty() && ((AioCheckOutWebATM) obj).getMerchantID().isEmpty()){
				((AioCheckOutWebATM) obj).setMerchantID(MerchantID);
			} else if(!PlatformID.isEmpty() && !((AioCheckOutWebATM) obj).getMerchantID().isEmpty()){
			} else {
				((AioCheckOutWebATM) obj).setMerchantID(MerchantID);
			}
			((AioCheckOutWebATM) obj).setInvoiceMark(invoice == null? "N" : "Y");
			log.info("aioCheckOutWebATM params: " + ((AioCheckOutWebATM) obj).toString());
		} else{
			throw new EcpayException(ErrorMessage.UNDIFINED_OBJECT);
		}
		try {
			VerifyAioCheckOut verify = new VerifyAioCheckOut();
			aioCheckOutUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			if(invoice != null){
				log.info("aioCheckOut invoice params: " + invoice.toString());
				verify.verifyParams(invoice);
				verify.verifyInvoice(invoice);
				invoice.setCustomerName(EcpayFunction.urlEncode(invoice.getCustomerName()));
				invoice.setCustomerAddr(EcpayFunction.urlEncode(invoice.getCustomerAddr()));
				invoice.setCustomerEmail(EcpayFunction.urlEncode(invoice.getCustomerEmail()));
				invoice.setInvoiceItemName(EcpayFunction.urlEncode(invoice.getInvoiceItemName()));
				invoice.setInvoiceItemWord(EcpayFunction.urlEncode(invoice.getInvoiceItemWord()));
				invoice.setInvoiceRemark(EcpayFunction.urlEncode(invoice.getInvoiceRemark()));
			}
			out.append(genCheckOutHtmlCode(obj, invoice));
		} catch (EcpayException e) {
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new EcpayException(e.getNewExceptionMessage());
		}
		return out.toString();
	}
	
	/**
	 * ATM、CVS或BARCODE的取號結果通知方法。接收傳送至PaymentInfoURL的資料。回傳物件分為ATMRequestObj, CVSOrBARCODERequestObj二種，請用適當的物件承接以免出錯
	 * @param req
	 * @return obj
	 */
	public Object aioCheckOutFeedback(HttpServletRequest req){
		List<String> parameterNames = new ArrayList<String>(req.getParameterMap().keySet());
		if(parameterNames.contains("BankCode")){
			ATMRequestObj obj = new ATMRequestObj();
			for(String name: parameterNames){
				Method method;
				try {
					method = obj.getClass().getMethod("set"+name, null);
					method.invoke(obj, req.getParameter(name));
				} catch(Exception e){
					throw new EcpayException(ErrorMessage.OBJ_MISSING_FIELD);
				}
			}
			log.info("ATMRequest params: " + obj.toString());
			String checkMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("ATMRequest self generate CheckMacValue: " + checkMacValue + ", received CheckMacValue: " + obj.getCheckMacValue());
			if(!checkMacValue.equals(obj.getCheckMacValue())){
				log.error(ErrorMessage.CHECK_MAC_VALUE_NOT_EQUALL_ERROR);
				throw new EcpayException(ErrorMessage.CHECK_MAC_VALUE_NOT_EQUALL_ERROR);
			}
			return obj;
		}else{
			CVSOrBARCODERequestObj obj = new CVSOrBARCODERequestObj();
			for(String name: parameterNames){
				Method method;
				try {
					method = obj.getClass().getMethod("set"+name, null);
					method.invoke(obj, req.getParameter(name));
				} catch(Exception e){
					throw new EcpayException(ErrorMessage.OBJ_MISSING_FIELD);
				}
			}
			log.info("CVSRequest params: " + obj.toString());
			String checkMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("CVSRequest self generate CheckMacValue: " + checkMacValue + ", received CheckMacValue: " + obj.getCheckMacValue());
			if(!checkMacValue.equals(obj.getCheckMacValue())){
				log.error(ErrorMessage.CHECK_MAC_VALUE_NOT_EQUALL_ERROR);
				throw new EcpayException(ErrorMessage.CHECK_MAC_VALUE_NOT_EQUALL_ERROR);
			}
			return obj;
		}
	}
	
	/**
	 * 產生HTML code
	 * @param aio object
	 * @param invoice obj
	 * @return string
	 */
	private String genCheckOutHtmlCode(Object aio, InvoiceObj invoice){
		StringBuilder builder = new StringBuilder();
		Hashtable<String, String> fieldValue = EcpayFunction.objToHashtable(aio);
		Hashtable<String, String> invoiceField = new Hashtable<String, String>();
		if(invoice != null){
			invoiceField = EcpayFunction.objToHashtable(invoice);
			fieldValue.putAll(invoiceField);
		}
		String CheckMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, fieldValue);
		fieldValue.put("CheckMacValue", CheckMacValue);
		Set<String> key = fieldValue.keySet();
		String name[] = key.toArray(new String[key.size()]);
		builder.append("<form id=\"allPayAPIForm\" action=\""+ aioCheckOutUrl + "\" method=\"post\">");
		for(int i = 0 ; i < name.length ; i++) {
			builder.append("<input type=\"hidden\" name=\""+name[i]+"\" value=\""+fieldValue.get(name[i])+"\">");
		}
		builder.append("<script language=\"JavaScript\">");
		builder.append("allPayAPIForm.submit()");
		builder.append("</script>");
		builder.append("</form>");
		return builder.toString();
	}
}
