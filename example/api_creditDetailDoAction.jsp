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
 	 * 信用卡關帳/退刷/取消/放棄的範例程式碼。
 	 */
	List<String> enErrors = new ArrayList<String>();
	try {
		AllInOne oPayment = new AllInOne();
		
		/* 服務參數 */
		oPayment.ServiceMethod = HttpMethod.ServerPOST;
		oPayment.ServiceURL = (String) session.getAttribute("AllPayURL") + "/CreditDetail/DoAction";
		oPayment.HashKey = (String) session.getAttribute("HashKey");
		oPayment.HashIV = (String) session.getAttribute("HashIV");
		oPayment.MerchantID = (String) session.getAttribute("MerchantID");
		
		/* 基本參數 */
		oPayment.Action.MerchantTradeNo = "1417055489665";
		oPayment.Action.TradeNo = "1417055489665";
		oPayment.Action.Action = ActionType.C;
		oPayment.Action.TotalAmount = new Decimal("30");
		
		Hashtable<String, String> htFeedback = new Hashtable<String, String>();
		
		enErrors.addAll(oPayment.DoAction(htFeedback));
		
		Set<String> key = htFeedback.keySet();
		String name[] = key.toArray(new String[key.size()]);
		
		
		/* 執行後的回傳的基本參數 */
        String szMerchantID = "";
        String szMerchantTradeNo = "";
        String szTradeNo = "";
        String szRtnCode = "";
        String szRtnMsg = "";
        
		// 取得資料
		for(int i = 0 ; i < name.length ; i++) {
			 /* 執行後的回傳的基本參數 */
			 if(name[i].equals("MerchantID"))
				 szMerchantID = htFeedback.get(name[i]);
			 else if(name[i].equals("MerchantTradeNo"))
				 szMerchantTradeNo = htFeedback.get(name[i]);
			 else if(name[i].equals("TradeNo"))
				 szTradeNo = htFeedback.get(name[i]);
			 else if(name[i].equals("RtnCode"))
				 szRtnCode = htFeedback.get(name[i]);
			 else if(name[i].equals("RtnMsg"))
				 szRtnMsg = htFeedback.get(name[i]);
		}
		/* 執行後的回傳的基本參數 */
		out.println("執行後的回傳的基本參數" + "<br/>");
		out.println("MerchantID = " + szMerchantID + "<br/>");
		out.println("MerchantTradeNo = " + szMerchantTradeNo + "<br/>");
		out.println("TradeNo = " + szTradeNo + "<br/>");
		out.println("RtnCode = " + szRtnCode + "<br/>");
		out.println("RtnMsg = " + szRtnMsg + "<br/>");
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