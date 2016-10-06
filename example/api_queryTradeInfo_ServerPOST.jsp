<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="EcPay.Payment.Integration.*" %>
<%@ page import="java.util.Hashtable" %>
<%@ page import="java.util.Set" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>
<%
	/*
 	 * 訂單查詢ServerPOST_客戶的範例程式碼。
 	 */
	List<String> enErrors = new ArrayList<String>();
	try {
		AllInOne oPayment = new AllInOne();
		
		/* 服務參數 */
		oPayment.ServiceMethod = HttpMethod.ServerPOST;
		oPayment.ServiceURL = (String) session.getAttribute("AllPayURL") + "/Cashier/QueryTradeInfo/V2";
		oPayment.HashKey = (String) session.getAttribute("HashKey");
		oPayment.HashIV = (String) session.getAttribute("HashIV");
		oPayment.MerchantID = (String) session.getAttribute("MerchantID");
		
		/* 基本參數 */
		oPayment.Query.MerchantTradeNo = "1417656864147";
		
		Hashtable<String, String> htFeedback = new Hashtable<String, String>();
		
		enErrors.addAll(oPayment.QueryTradeInfo(htFeedback));
		
		Set<String> key = htFeedback.keySet();
		String name[] = key.toArray(new String[key.size()]);
		
		/* 查詢後的回傳的基本參數 */
		String szMerchantID = "";
		String szMerchantTradeNo = "";
		String szTradeNo = "";
		String szTradeAmt = "";
		String szPaymentDate = "";
		String szPaymentType = "";
		String szHandlingCharge = "";
		String szPaymentTypeChargeFee = "";
		String szTradeDate = "";
		String szTradeStatus = "";
		String szItemName = "";
        /* 使用 WebATM 交易時，回傳的額外參數 */
        String szWebATMAccBank = "";
        String szWebATMAccNo = "";
        /* 使用 ATM 交易時，回傳的額外參數 */
        String szATMAccBank = "";
        String szATMAccNo = "";
        /* 使用 CVS 或 BARCODE 交易時，回傳的額外參數 */
        String szPaymentNo = "";
        String szPayFrom = "";
        /* 使用 Alipay 交易時，回傳的額外參數
        String szAlipayID = "";
        String szAlipayTradeNo = ""; */
        /* 使用 Tenpay 交易時，回傳的額外參數
        String szTenpayTradeNo = "";  */
        /* 使用 Credit 交易時，回傳的額外參數 */
        String szGwsr = "";
        String szProcessDate = "";
        String szAuthCode = "";
        String szAmount = "";
        String szStage = "";
        String szStast = "";
        String szStaed = "";
        String szECI = "";
        String szCard4No = "";
        String szCard6No = "";
        String szRedDan = "";
        String szRedDeAmt = "";
        String szRedOkAmt = "";
        String szRedYet = "";
        String szPeriodType = "";
        String szFrequency = "";
        String szExecTimes = "";
        String szPeriodAmount = "";
        String szTotalSuccessTimes = "";
        String szTotalSuccessAmount = "";
		
		// 取得資料
		for(int i = 0 ; i < name.length ; i++) {
			/* 查詢後的回傳的基本參數 */
			if(name[i].equals("MerchantID"))
				szMerchantID = htFeedback.get(name[i]);
			else if(name[i].equals("MerchantTradeNo"))
				szMerchantTradeNo = htFeedback.get(name[i]);
			else if(name[i].equals("TradeNo"))
				szTradeNo = htFeedback.get(name[i]);
			else if(name[i].equals("TradeAmt"))
				szTradeAmt = htFeedback.get(name[i]);
			else if(name[i].equals("PaymentDate"))
				szPaymentDate = htFeedback.get(name[i]);
			else if(name[i].equals("PaymentType"))
				szPaymentType = htFeedback.get(name[i]);
			else if(name[i].equals("HandlingCharge"))
				szHandlingCharge = htFeedback.get(name[i]);
			else if(name[i].equals("PaymentTypeChargeFee"))
				szPaymentTypeChargeFee = htFeedback.get(name[i]);
			else if(name[i].equals("TradeDate"))
				szTradeDate = htFeedback.get(name[i]);
			else if(name[i].equals("TradeStatus"))
				szTradeStatus = htFeedback.get(name[i]);
			else if(name[i].equals("ItemName"))
				szItemName = htFeedback.get(name[i]);
			/* 使用 WebATM 交易時回傳的參數 */
			else if(name[i].equals("WebATMAccBank"))
				szWebATMAccBank = htFeedback.get(name[i]);
			else if(name[i].equals("WebATMAccNo"))
				szWebATMAccNo = htFeedback.get(name[i]);
			/* 使用 ATM 交易時回傳的參數 */
			else if(name[i].equals("ATMAccBank"))
				szATMAccBank = htFeedback.get(name[i]);
			else if(name[i].equals("ATMAccNo"))
				szATMAccNo = htFeedback.get(name[i]);
			/* 使用 CVS 或 BARCODE 交易時回傳的參數 */
			else if(name[i].equals("PaymentNo"))
				szPaymentNo = htFeedback.get(name[i]);
			else if(name[i].equals("PayFrom"))
				szPayFrom = htFeedback.get(name[i]);
			/* 使用 Alipay 交易時回傳的參數
			else if(name[i].equals("AlipayID"))
				szAlipayID = htFeedback.get(name[i]);
			else if(name[i].equals("AlipayTradeNo"))
				szAlipayTradeNo = htFeedback.get(name[i]); */
			/* 使用 Tenpay 交易時回傳的參數
			else if(name[i].equals("TenpayTradeNo"))
				szTenpayTradeNo = htFeedback.get(name[i]); */
			/* 使用 Credit 交易時回傳的參數 */
			else if(name[i].equals("gwsr"))
				szGwsr = htFeedback.get(name[i]);
			else if(name[i].equals("process_date"))
				szProcessDate = htFeedback.get(name[i]);
			else if(name[i].equals("auth_code"))
				szAuthCode = htFeedback.get(name[i]);
			else if(name[i].equals("amount"))
				szAmount = htFeedback.get(name[i]);
			else if(name[i].equals("stage"))
				szStage = htFeedback.get(name[i]);
			else if(name[i].equals("stast"))
				szStast = htFeedback.get(name[i]);
			else if(name[i].equals("staed"))
				szStaed = htFeedback.get(name[i]);
			else if(name[i].equals("eci"))
				szECI = htFeedback.get(name[i]);
			else if(name[i].equals("card4no"))
				szCard4No = htFeedback.get(name[i]);
			else if(name[i].equals("card6no"))
				szCard6No = htFeedback.get(name[i]);
			else if(name[i].equals("red_dan"))
				szRedDan = htFeedback.get(name[i]);
			else if(name[i].equals("red_de_amt"))
				szRedDeAmt = htFeedback.get(name[i]);
			else if(name[i].equals("red_ok_amt"))
				szRedOkAmt = htFeedback.get(name[i]);
			else if(name[i].equals("red_yet"))
				szRedYet = htFeedback.get(name[i]);
			else if(name[i].equals("PeriodType"))
				szPeriodType = htFeedback.get(name[i]);
			else if(name[i].equals("Frequency"))
				szFrequency = htFeedback.get(name[i]);
			else if(name[i].equals("ExecTimes"))
				szExecTimes = htFeedback.get(name[i]);
			else if(name[i].equals("PeriodAmount"))
				szPeriodAmount = htFeedback.get(name[i]);
			else if(name[i].equals("TotalSuccessTimes"))
				szTotalSuccessTimes = htFeedback.get(name[i]);
			else if(name[i].equals("TotalSuccessAmount"))
				szTotalSuccessAmount = htFeedback.get(name[i]);
		}
		/* 查詢後的回傳的基本參數 */
		out.println("支付後回傳的基本參數" + "<br/>");
		out.println("MerchantID = " + szMerchantID + "<br/>");
		out.println("MerchantTradeNo = " + szMerchantTradeNo + "<br/>");
		out.println("TradeNo = " + szTradeNo + "<br/>");
		out.println("TradeAmt = " + szTradeAmt + "<br/>");
		out.println("PaymentDate = " + szPaymentDate + "<br/>");
		out.println("PaymentType = " + szPaymentType + "<br/>");
		out.println("HandlingCharge = " + szHandlingCharge + "<br/>");
		out.println("PaymentTypeChargeFee = " + szPaymentTypeChargeFee + "<br/>");
		out.println("TradeDate = " + szTradeDate + "<br/>");
		out.println("TradeStatus = " + szTradeStatus + "<br/>");
		out.println("ItemName = " + szItemName + "<br/>");
		out.println("<br/>");
		/* 使用 WebATM 交易時回傳的參數 */
		out.println("使用 WebATM 交易時回傳的參數" + "<br/>");
		out.println("WebATMAccBank = " + szWebATMAccBank + "<br/>");
		out.println("WebATMAccNo = " + szWebATMAccNo + "<br/>");
		out.println("<br/>");
		/* 使用 ATM 交易時回傳的參數 */
		out.println("使用 ATM 交易時回傳的參數" + "<br/>");
		out.println("ATMAccBank = " + szATMAccBank + "<br/>");
		out.println("ATMAccNo = " + szATMAccNo + "<br/>");
		out.println("<br/>");
		/* 使用 CVS 或 BARCODE 交易時回傳的參數 */
		out.println("使用 CVS 或 BARCODE 交易時回傳的參數" + "<br/>");
		out.println("PaymentNo = " + szPaymentNo + "<br/>");
		out.println("PayFrom = " + szPayFrom + "<br/>");
		out.println("<br/>");
		/* 使用 Alipay 交易時回傳的參數
		out.println("使用 Alipay 交易時回傳的參數" + "<br/>");
		out.println("AlipayID = " + szAlipayID + "<br/>");
		out.println("AlipayTradeNo = " + szAlipayTradeNo + "<br/>");
		out.println("<br/>"); */ 
		/* 使用 Tenpay 交易時回傳的參數
		out.println("使用 Tenpay 交易時回傳的參數" + "<br/>");
		out.println("TenpayTradeNo = " + szTenpayTradeNo + "<br/>");
		out.println("<br/>"); */
		/* 使用 Credit 交易時回傳的參數 */
		out.println("使用 Credit 交易時回傳的參數" + "<br/>");
		out.println("gwsr = " + szGwsr + "<br/>");
		out.println("process_date = " + szProcessDate + "<br/>");
		out.println("auth_code = " + szAuthCode + "<br/>");
		out.println("amount = " + szAmount + "<br/>");
		out.println("stage = " + szStage + "<br/>");
		out.println("stast = " + szStast + "<br/>");
		out.println("staed = " + szStaed + "<br/>");
		out.println("eci = " + szECI + "<br/>");
		out.println("card4no = " + szCard4No + "<br/>");
		out.println("card6no = " + szCard6No + "<br/>");
		out.println("red_dan = " + szRedDan + "<br/>");
		out.println("red_de_amt = " + szRedDeAmt + "<br/>");
		out.println("red_ok_amt = " + szRedOkAmt + "<br/>");
		out.println("red_yet = " + szRedYet + "<br/>");
		out.println("PeriodType = " + szPeriodType + "<br/>");
		out.println("Frequency = " + szFrequency + "<br/>");
		out.println("ExecTimes = " + szExecTimes + "<br/>");
		out.println("PeriodAmount = " + szPeriodAmount + "<br/>");
		out.println("TotalSuccessTimes = " + szTotalSuccessTimes + "<br/>");
		out.println("TotalSuccessAmount = " + szTotalSuccessAmount + "<br/>");
		out.println("<br/>");
	}
	catch (Exception e) {
		// 例外錯誤處理。
		enErrors.add(e.getMessage());
	}
	finally {
		// 回覆錯誤訊息。
	    if (enErrors.size() > 0)
	    	out.println("0|" + enErrors);
	}
%>

<form action="<%=session.getAttribute("ServerIP")%>" method="post">
	<input type="button" value="回到Ecpay金流測試首頁" onClick="submit()">	
</form>

</body>
</html>