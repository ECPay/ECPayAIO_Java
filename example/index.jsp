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
	//預設資料 Stage
	session.setAttribute("AllPayURL", ENVIRONMENT.STAGE.toString());
	session.setAttribute("HashKey", "5294y06JbISpM5x9");
	session.setAttribute("HashIV", "v77hoKGq4kWxNNIS");
	session.setAttribute("MerchantID", "2000132");
	//
	session.setAttribute("ServerIP", "http://127.0.0.1:8080/aioEcpay");
%>

<form action="<%=session.getAttribute("ServerIP")%>/api_checkOut_ATM.jsp" method="post">
	<input type="button" value="產生ATM訂單" onClick="submit()">	
</form>

<form action="<%=session.getAttribute("ServerIP")%>/api_checkOut_CVS.jsp" method="post">
	<input type="button" value="產生CVS訂單" onClick="submit()">
</form>

<!-- (ks.lin@2016-09-23) 恢復此功能 -->
<form action="<%=session.getAttribute("ServerIP")%>/api_checkOut_BARCODE.jsp" method="post">
	<input type="button" value="產生BARCODE訂單" onClick="submit()">
</form>

<!-- (ks.lin@2016-09-23) 移除此功能 
<form action="<%=session.getAttribute("ServerIP")%>/api_checkOut_Alipay.jsp" method="post">
	<input type="button" value="產生支付寶訂單" onClick="submit()">
</form>
-->

<!-- (ks.lin@2016-09-23) 移除此功能 
<form action="<%=session.getAttribute("ServerIP")%>/api_checkOut_Tenpay.jsp" method="post">
	<input type="button" value="產生財付通訂單" onClick="submit()">
</form>
-->

<form action="<%=session.getAttribute("ServerIP")%>/api_checkOut_Credit_A.jsp" method="post">
	<input type="button" value="產生信用卡(Creadir Card)分期訂單" onClick="submit()">
</form>

<form action="<%=session.getAttribute("ServerIP")%>/api_checkOut_Credit_B.jsp" method="post">
	<input type="button" value="產生信用卡(Creadir Card)定期定額" onClick="submit()">
</form>

<form action="<%=session.getAttribute("ServerIP")%>/api_checkOut_All.jsp" method="post">
	<input type="button" value="產生all訂單" onClick="submit()">
</form>

</br></br>

<form action="<%=session.getAttribute("ServerIP")%>/api_queryTradeInfo_ServerPOST.jsp" method="post">
	<input type="button" value="訂單查詢ServerPOST" onClick="submit()">
</form>

<!-- (ks.lin@2016-09-23) 移除
<form action="<%=session.getAttribute("ServerIP")%>/api_queryTradeInfo_ServerSOAP.jsp" method="post">
	<input type="button" value="訂單查詢ServerSOAP" onClick="submit()">
</form>
-->

<!-- (ks.lin@2016-09-23) 移除
<form action="<%=session.getAttribute("ServerIP")%>/test_api_queryTradeInfo_ServerPOST.jsp" method="post">
	<input type="button" value="訂單查詢ServerPOST_客戶" onClick="submit()">
</form>
-->

</br></br>

<form action="<%=session.getAttribute("ServerIP")%>/api_creditDetailDoAction.jsp" method="post">
	<input type="button" value="信用卡關帳/退刷/取消/放棄" onClick="submit()">
</form>

</br></br>

<!-- (ks.lin@2016-09-23) 移除此功能 
<form action="<%=session.getAttribute("ServerIP")%>/api_aioChargeback.jsp" method="post">
	<input type="button" value="廠商通知退款" onClick="submit()">
</form>
-->

</br></br>

<form action="<%=session.getAttribute("ServerIP")%>/api_queryCreditCardTradeInfo_ServerPOST.jsp" method="post">
	<input type="button" value="信用卡定期定額訂單查詢ServerPOST" onClick="submit()">
</form>

</br></br>

<form action="<%=session.getAttribute("ServerIP")%>/api_genCheckMacValue.jsp" method="post">
	<input type="button" value="取得檢查碼API" onClick="submit()">
</form>

</br></br>

<!-- (ks.lin@2016-09-23) 移除
<form action="<%=session.getAttribute("ServerIP")%>/pay_barcode_getbarcode.jsp" method="post">
	<input type="button" value="pay 超商條碼 特店查詢超商條碼作業" onClick="submit()">
</form>
-->

</body>
</html>