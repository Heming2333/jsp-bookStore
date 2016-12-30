<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  
    <s:form action="finance_pay.action">
		<s:textfield name="finance.s_id" label="finance.s_id"></s:textfield>
		<s:textfield name="finance.f_time" label="finance.f_time"></s:textfield>
		<s:textfield name="finance.f_content" label="finance.f_content"></s:textfield>
		<s:textfield name="finance.f_type" label="finance.f_type"></s:textfield>
		<s:textfield name="finance.f_money" label="finance.f_money"></s:textfield>
		<s:submit></s:submit>
	</s:form>
  </body>
</html>
