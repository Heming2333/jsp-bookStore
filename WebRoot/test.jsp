<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>test page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
    <!-- 下面两种写法都可以访问 
    <a href="${pageContext.request.contextPath }/bsAdmin_update.action">访问update</a>  
    <a href="bsAdmin_save.action">访问save</a>  
    -->
    <a href="${pageContext.request.contextPath }/bsAdmin_update.action?bsAdmin.id=1&bsAdmin.username=admin&bsAdmin.password=admin&bsAdmin.telephone=13735501806&bsAdmin.truename=YuXLan&bsAdmin.idnumber=330184199605162628">访问update</a>  
    <a href="bsAdmin_save.action">访问save</a>  
    <a href="bsAdmin_save.action?id=1&username=admin&password=123456&telephone=13735501806&truename=YuXLan&idnumber=330184199605162628">测试ModelDriven</a>  
    <a href="bsAdmin_query.action">查询所有类别</a><br/>  
    <c:forEach items="${requestScope.bsAdminList }" var="bsAdmin">  
        ${bsAdmin.id } | ${bsAdmin.username } | ${bsAdmin.password } | ${bsAdmin.telephone } | ${bsAdmin.truename } | ${bsAdmin.idnumber } <br/>  
    </c:forEach>  
      
    <c:forEach items="${sessionScope.bsAdminList }" var="bsAdmin">  
        ${bsAdmin.id } | ${bsAdmin.username } | ${bsAdmin.password } | ${bsAdmin.telephone } | ${bsAdmin.truename } | ${bsAdmin.idnumber } <br/>  
    </c:forEach>  
      
    <c:forEach items="${applicationScope.bsAdminList }" var="bsAdmin">  
         ${bsAdmin.id } | ${bsAdmin.username } | ${bsAdmin.password } | ${bsAdmin.telephone } | ${bsAdmin.truename } | ${bsAdmin.idnumber } <br/>    
    </c:forEach>  
  </body>
</html>
