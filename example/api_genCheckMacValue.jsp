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
 	 * 取得檢查碼API的範例程式碼。
 	 */
	List<String> enErrors = new ArrayList<String>();
	try {
		AllInOne oPayment = new AllInOne();
		
		/* 服務參數 */
		oPayment.ServiceMethod = HttpMethod.ServerPOST;
		oPayment.ServiceURL = (String) session.getAttribute("AllPayURL") + "/AioHelper/GenCheckMacValue";
		oPayment.HashKey = (String) session.getAttribute("HashKey");
		oPayment.HashIV = (String) session.getAttribute("HashIV");
		oPayment.MerchantID = (String) session.getAttribute("MerchantID");
		
		StringBuilder stringBuilder = new StringBuilder();
		enErrors.addAll(oPayment.GenCheckMacValue(stringBuilder));
		
		out.print(stringBuilder + "<br/>");
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