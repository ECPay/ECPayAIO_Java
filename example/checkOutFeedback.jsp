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
			for(int i = 0 ; i < name.length ; i++) {
				out.println(name[i] + " = " + htFeedback.get(name[i]) + "<br/>");
			}
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