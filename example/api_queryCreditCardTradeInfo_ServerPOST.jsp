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
	/*
 	 * 信用卡定期定額訂單查詢ServerPOST的範例程式碼。
 	 */
	List<String> enErrors = new ArrayList<String>();
	try {
		AllInOne oPayment = new AllInOne();
		
		/* 服務參數 */
		oPayment.ServiceMethod = HttpMethod.ServerPOST;
		oPayment.ServiceURL = (String) session.getAttribute("AllPayURL") + "/Cashier/QueryCreditCardPeriodInfo";
		oPayment.HashKey = (String) session.getAttribute("HashKey");
		oPayment.HashIV = (String) session.getAttribute("HashIV");
		oPayment.MerchantID = (String) session.getAttribute("MerchantID");
		
		/* 基本參數 */
		oPayment.Query.MerchantTradeNo = "1422348600644";
		
		PeriodCreditCardTradeInfo htFeedback = new PeriodCreditCardTradeInfo();		
		enErrors.addAll(oPayment.QueryCreditCardTradeInfo(htFeedback));
		
		if (enErrors.size() == 0) {
			out.println("0|" + "無回傳值(遠端服務無法回傳到測試網站, 請檢查測試的網路環境)" + "<br/>");
		} else {		
			/* 查詢後的回傳的基本參數 */
			String szMerchantID = htFeedback.MerchantID;
			String szMerchantTradeNo = htFeedback.MerchantTradeNo;
			String szTradeNo = htFeedback.TradeNo;
			int nRtnCode = htFeedback.RtnCode;
			String szPeriodType = htFeedback.PeriodType;
			int nFrequency = htFeedback.Frequency;
			int nExecTimes = htFeedback.ExecTimes;
			int nPeriodAmount = htFeedback.PeriodAmount;
			int nAmount = htFeedback.amount;
			int nGwsr = htFeedback.gwsr;
			String szProcessDate = htFeedback.process_date;
			String szAuthCode = htFeedback.auth_code;
			String szCard4No = htFeedback.card4no;
			String szCard6No = htFeedback.card6no;
			int nTotalSuccessTimes = htFeedback.TotalSuccessTimes;
			int nTotalSuccessAmount = htFeedback.TotalSuccessAmount;
			PeriodCreditCardTradeInfoLog oLog[] = htFeedback.ExecLog;
			
			/* 查詢後的回傳的基本參數 */
			out.println("查詢後的回傳的基本參數" + "<br/>");
			out.println("MerchantID = " + szMerchantID + "<br/>");
			out.println("MerchantTradeNo = " + szMerchantTradeNo + "<br/>");
			out.println("TradeNo = " + szTradeNo + "<br/>");
			out.println("RtnCode = " + nRtnCode + "<br/>");
			out.println("PeriodType = " + szPeriodType + "<br/>");
			out.println("Frequency = " + nFrequency + "<br/>");
			out.println("ExecTimes = " + nExecTimes + "<br/>");
			out.println("PeriodAmount = " + nPeriodAmount + "<br/>");
			out.println("amount = " + nAmount + "<br/>");
			out.println("gwsr = " + nGwsr + "<br/>");
			out.println("process_date = " + szProcessDate + "<br/>");
			out.println("auth_code = " + szAuthCode + "<br/>");
			out.println("card4no = " + szCard4No + "<br/>");
			out.println("card6no = " + szCard6No + "<br/>");
			out.println("TotalSuccessTimes = " + nTotalSuccessTimes + "<br/>");
			out.println("TotalSuccessAmount = " + nTotalSuccessAmount + "<br/>");
			out.println("<br/>");
			
			// 取得明細資料
			if(nTotalSuccessTimes > 0) {
				for(int i = 0 ; i < oLog.length ; i++) {
					int nLogRtnCode = oLog[i].RtnCode;
					int nLogAmount = oLog[i].amount;
					long nLogGwsr = oLog[i].gwsr;
					String szLogProcessDate = oLog[i].process_date;
					String szLogAuthCode = oLog[i].auth_code;
					//
					out.println("取得明細資料[" + (i+1) + "] <br/>");
					out.println("RtnCode = " + nLogRtnCode + "<br/>");
					out.println("amount = " + nLogAmount + "<br/>");
					out.println("gwsr = " + nLogGwsr);
					out.println("process_date = " + szLogProcessDate + "<br/>");
					out.println("auth_code = " + szLogAuthCode + "<br/>");
					out.println("<br/>");
				}
			}
		}	
	}
	catch (Exception e) {
		// 例外錯誤處理。
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