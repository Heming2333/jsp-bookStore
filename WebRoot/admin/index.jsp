<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%  
    if(session.getAttribute("user") == null){//说明是用户首次登录，而非服务端跳转，这时候再在cookies中进行取值操作
    	 response.sendRedirect("http://127.0.0.1:8080/book_store/admin/login.jsp");
         return;      
    }
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>loading……</title>
    <link rel="shortcut icon" href="assets/img/favicon.png">
  </head>
  
  <body style="display: flex; align-items: center; justify-content: center;">
  	<img src="assets/img/loading.gif" style="width: 100px; margin: auto;">
  	<%@ include file="admin_footer.jspf" %>
  	<script>
  		setTimeout(function(){window.location="bsAdmin_query.action";},1500);
  	</script>
  </body>
</html>
