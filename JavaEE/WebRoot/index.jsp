<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML5>
<html>
<!-- 通用头部，无需更改 -->
<%@ include file="commonHeader.jsp" %>
<title>学生管理</title>
<!-- 自定义css，请放置与该路径 -->
<link rel="stylesheet" href="style/css/studentManage.css">
</head>
  
<body>
<!-- 通用的头部导航栏以及左边栏 -->
<%@ include file="insideHeader.jsp"%>
<div class="am-cf admin-main">
<%@ include file="insideBar.jsp"%>

<!-- Start：内容 -->
    <div class="admin-content">
    <div class="am-panel-bd">
      <p><span class="am-icon-bookmark"></span> 公告</p>
      <p>时光静好，与君语；细水流年，与君同。</p>
    </div>
<%@ include file="insideFooter.jsp" %>
    </div>
    <!-- End：内容 -->
</div>
</body>
<!-- 必备的js-->
<%@ include file="commonFooter.jsp" %>
<!-- 自定义的js，请放置于该路径 -->
<script src="style/js/studentManage_admin.js"></script>
</html>
