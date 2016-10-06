<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="EcPay.Payment.Integration.*" %>
<%@ page import="java.util.Hashtable" %>
<%@ page import="java.util.Set" %>
<%@ page import="java.util.TreeSet" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EcPay</title>
</head>
<body>
<%	
	/*
 	 * 產生all訂單的範例程式碼。
 	 */
	List<String> enErrors = new ArrayList<String>();
	try {
		AllInOne oPayment = new AllInOne();
		
		/* 服務參數 */
		oPayment.ServiceMethod = HttpMethod.HttpPOST;
		oPayment.ServiceURL = (String) session.getAttribute("AllPayURL") + "/Cashier/AioCheckOut/V2";
		oPayment.HashKey = (String) session.getAttribute("HashKey");
		oPayment.HashIV = (String) session.getAttribute("HashIV");
		oPayment.MerchantID = (String) session.getAttribute("MerchantID");
		
		/* 基本參數 */
		String ServerIP = (String) session.getAttribute("ServerIP");
		oPayment.Send.ReturnURL = ServerIP + "/checkOutFeedback_All.jsp";
		oPayment.Send.ClientBackURL = ServerIP + "/checkOutFeedback_All.jsp";
		oPayment.Send.OrderResultURL = ServerIP + "/checkOutFeedback_All.jsp";
		//
		oPayment.Send.MerchantTradeNo = String.valueOf((new Date()).getTime());
		oPayment.Send.MerchantTradeDate = new Date();
		oPayment.Send.TotalAmount = new Decimal("300");
		oPayment.Send.TradeDesc = "測試";
		oPayment.Send.ChoosePayment = PaymentMethod.ALL;
		oPayment.Send.Remark = "測試Pay";
		oPayment.Send.ChooseSubPayment = PaymentMethodItem.ATM_TAISHIN;
		oPayment.Send.NeedExtraPaidInfo = ExtraPaymentInfo.Yes;
		oPayment.Send.DeviceSource = DeviceType.PC;
		//oPayment.Send.
		
		/* ALL */
		//oPayment.Send.IgnorePayment = "ATM#CVS#Alipay#Tenpay#BARCODE#WebATM#TopUpUsed#AccountLink#APPBARCODE";
		
		/* ATM */
		oPayment.SendExtend.ExpireDate = 30;
		oPayment.SendExtend.ClientRedirectURL = ServerIP + "/checkOutFeedback_ATM.jsp";
		
		/* CVS or BARCODE */
		oPayment.SendExtend.Desc_1 = "BarCode01";
		oPayment.SendExtend.Desc_2 = "BarCode02";
		oPayment.SendExtend.Desc_3 = "BarCode03";
		oPayment.SendExtend.Desc_4 = "BarCode04";
		oPayment.SendExtend.PaymentInfoURL = ServerIP + "/checkOutFeedback_BARCODE.jsp";
		
		/* Alipay */
		oPayment.SendExtend.Email = "ks.lin@allpay.com.tw";
		oPayment.SendExtend.PhoneNo = "0933456789";
		oPayment.SendExtend.UserName = "ks.lin";
		
		/* Tenpay */
		oPayment.SendExtend.ExpireTime = AllPayFunction.stringDateFormat("2015/01/28 00:00:00");
		
		/* Credit */
		//分期訂單
		/*
		oPayment.SendExtend.CreditInstallment = 3;
		oPayment.SendExtend.InstallmentAmount = new Decimal("1000");
		oPayment.SendExtend.Redeem = false;
		oPayment.SendExtend.UnionPay = false;
		oPayment.SendExtend.PaymentInfoURL = ServerIP + "/checkOutFeedback.jsp";
		*/
		//oPayment.SendExtend.Language = "ENG";
		
		
		//定期定額
		/*
		oPayment.SendExtend.PeriodAmount = new Decimal("3800");
		oPayment.SendExtend.PeriodType = PeriodType.Day;
		oPayment.SendExtend.Frequency = 1;
		oPayment.SendExtend.ExecTimes = 2;
		*/
		
		// 加入選購商品資料。
		// &測試商品1 240 NTD x 1#測試&商品2 250 NTD x 1#測試商品3& 250 NTD x 
		Item a1 = new Item();
		a1.Name = "測試商品1";
		a1.Price = new Decimal("240");
		a1.Currency = "NTD";
		a1.Quantity = 1;
		a1.URL = "<<產品說明位址>>";
		oPayment.Send.Items.add(a1);
		
		Item a2 = new Item();
		a2.Name = "測試&商品2";
		a2.Price = new Decimal("250");
		a2.Currency = "NTD";
		a2.Quantity = 1;
		a2.URL = "<<產品說明位址>>";
		oPayment.Send.Items.add(a2);
		
		Item a3 = new Item();
		a3.Name = "測試商品3&";
		a3.Price = new Decimal("250");
		a3.Currency = "NTD";
		a3.Quantity = 1;
		a3.URL = "<<產品說明位址>>";
		oPayment.Send.Items.add(a3);
		
		enErrors.addAll(oPayment.CheckOut(response.getWriter()));
		
	}
	catch (Exception e) {
		enErrors.add(e.getMessage());
	}
	finally {
		if (enErrors.size() > 0)
			out.print(enErrors);
	}
%>
</body>
</html>