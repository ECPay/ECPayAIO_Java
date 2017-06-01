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
<title>EcPay</title>
</head>
<body>
<%
	List<String> enErrors = new ArrayList<String>();
	try {
		AllInOne oPayment = new AllInOne();
		oPayment.HashKey = (String) session.getAttribute("HashKey");
		oPayment.HashIV = (String) session.getAttribute("HashIV");
		
		Hashtable<String, String> htFeedback = new Hashtable<String, String>();
		enErrors.addAll(oPayment.CheckOutFeedback(htFeedback, request));
		
		if (enErrors.size() == 0) {
			out.println("0|" + "無回傳值(遠端服務無法回傳到測試網站, 請檢查測試的網路環境)" + "<br/>");
		} else {
			Set<String> key = htFeedback.keySet();
			String name[] = key.toArray(new String[key.size()]);
			
			/* 支付後的回傳的基本參數 */
			String szMerchantID = "";
			String szMerchantTradeNo = "";
			String szPaymentDate = "";
			String szPaymentType = "";
			String szPaymentTypeChargeFee = "";
			String szRtnCode = "";
			String szRtnMsg = "";
			String szSimulatePaid = "";
			String szTradeAmt = "";
			String szTradeDate = "";
			String szTradeNo = "";
			/* 使用定期定額交易時，回傳的額外參數 */
			String szPeriodType = "";
			String szFrequency = "";
			String szExecTimes = "";
			String szAmount = "";
			String szGwsr = "";
			String szProcessDate = "";
			String szAuthCode = "";
			String szFirstAuthAmount = "";
			String szTotalSuccessTimes = "";
			// 取得資料
			for(int i = 0 ; i < name.length ; i++) {
				/* 支付後的回傳的基本參數 */
				if(name[i].equals("MerchantID"))
					szMerchantID = htFeedback.get(name[i]);
				else if(name[i].equals("MerchantTradeNo"))
					szMerchantTradeNo = htFeedback.get(name[i]);
				else if(name[i].equals("PaymentDate"))
					szPaymentDate = htFeedback.get(name[i]);
				else if(name[i].equals("PaymentType"))
					szPaymentType = htFeedback.get(name[i]);
				else if(name[i].equals("PaymentTypeChargeFee"))
					szPaymentTypeChargeFee = htFeedback.get(name[i]);
				else if(name[i].equals("RtnCode"))
					szRtnCode = htFeedback.get(name[i]);
				else if(name[i].equals("RtnMsg"))
					szRtnMsg = htFeedback.get(name[i]);
				else if(name[i].equals("SimulatePaid"))
					szSimulatePaid = htFeedback.get(name[i]);
				else if(name[i].equals("TradeAmt"))
					szTradeAmt = htFeedback.get(name[i]);
				else if(name[i].equals("TradeDate"))
					szTradeDate = htFeedback.get(name[i]);
				else if(name[i].equals("TradeNo"))
					szTradeNo = htFeedback.get(name[i]);
				else if(name[i].equals("PeriodType"))
					szPeriodType = htFeedback.get(name[i]);
				else if(name[i].equals("Frequency"))
					szFrequency = htFeedback.get(name[i]);
				else if(name[i].equals("ExecTimes"))
					szExecTimes = htFeedback.get(name[i]);
				else if(name[i].equals("Amount"))
					szAmount = htFeedback.get(name[i]);
				else if(name[i].equals("Gwsr"))
					szGwsr = htFeedback.get(name[i]);
				else if(name[i].equals("ProcessDate"))
					szProcessDate = htFeedback.get(name[i]);
				else if(name[i].equals("AuthCode"))
					szAuthCode = htFeedback.get(name[i]);
				else if(name[i].equals("FirstAuthAmount"))
					szFirstAuthAmount = htFeedback.get(name[i]);
				else if(name[i].equals("TotalSuccessTimes"))
					szTotalSuccessTimes = htFeedback.get(name[i]);
			}
			/* 支付後的回傳的基本參數 */
			out.println("支付後回傳的基本參數" + "<br/>");
			out.println("MerchantID = " + szMerchantID + "<br/>");
			out.println("MerchantTradeNo = " + szMerchantTradeNo + "<br/>");
			out.println("PaymentDate = " + szPaymentDate + "<br/>");
			out.println("PaymentType = " + szPaymentType + "<br/>");
			out.println("PaymentTypeChargeFee = " + szPaymentTypeChargeFee + "<br/>");
			out.println("RtnCode = " + szRtnCode + "<br/>");
			out.println("RtnMsg = " + szRtnMsg + "<br/>");
			out.println("SimulatePaid = " + szSimulatePaid + "<br/>");
			out.println("TradeAmt = " + szTradeAmt + "<br/>");
			out.println("TradeDate = " + szTradeDate + "<br/>");
			out.println("TradeNo = " + szTradeNo + "<br/>");
			out.println("<br/>");
			/* 使用定期定額交易時，回傳的額外參數 */
			out.println("使用定期定額交易時，回傳的額外參數" + "<br/>");
			out.println("PeriodType = " + szPeriodType + "<br/>");
			out.println("Frequency = " + szFrequency + "<br/>");
			out.println("ExecTimes = " + szExecTimes + "<br/>");
			out.println("Amount = " + szAmount + "<br/>");
			out.println("Gwsr = " + szGwsr + "<br/>");
			out.println("ProcessDate = " + szProcessDate + "<br/>");
			out.println("AuthCode = " + szAuthCode + "<br/>");
			out.println("FirstAuthAmount = " + szFirstAuthAmount + "<br/>");
			out.println("TotalSuccessTimes = " + szTotalSuccessTimes + "<br/>");
			out.println("<br/>");
		}
	}
	catch (Exception e) {
		enErrors.add(e.getMessage());
	}
	finally {
		// 回覆錯誤訊息。
	    if (enErrors.size() > 0) {
	    	out.println("0|" + enErrors);
		}	
		out.println("<br/>");
	}
%>

<form action="<%=session.getAttribute("ServerIP")%>" method="post">
	<input type="button" value="回到Ecpay金流測試首頁" onClick="submit()">	
</form>

</body>
</html>