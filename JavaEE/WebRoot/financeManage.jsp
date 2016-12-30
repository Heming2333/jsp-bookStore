<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML5>
<html>
<!-- 通用头部，无需更改 -->
<jsp:include page="commonHeader.jsp"></jsp:include>
<title>财务管理</title>

<!-- 自定义css，请放置与该路径 -->
<!--<link rel="stylesheet" href="style/css/">-->
</head>
  
<body>
<!-- 通用的头部导航栏以及左边栏 -->
<jsp:include page="insideHeader.jsp"></jsp:include>
<div class="am-cf admin-main">
<jsp:include page="insideBar.jsp"></jsp:include>

    <!-- Start：内容 -->
    <div class="admin-content">
        <div class="admin-content-body">
            <div class="am-cf am-padding am-padding-bottom-0">
                <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">财务管理</strong> / <small>Finance Manage</small></div>
            </div>

            <hr>

            <div class="am-g">
                <div class="am-u-sm-12">
                    <form class="am-form">
                        <table class="am-table am-table-striped am-table-hover table-main">
                            <thead>
	                            <tr>
	                                <th class="table-type">账号</th>
	                                <th class="table-date am-hide-sm-only">交易类别</th>
	                                <th class="table-date am-hide-sm-only">交易时间</th>
	                                <th class="table-date am-hide-sm-only">交易金额</th>
	                                <th class="table-date am-hide-sm-only">交易内容</th>
	                            </tr>
                            </thead>
                            <tbody id="lists">
                            	
                            </tbody>
                        </table>
                        <hr />
                    </form>
                </div>
            </div>
            
        </div>
    </div>

<!-- 这个是当屏幕变小时右下角会出现的按钮，点击后显示左边导航栏内容 -->
<a href="#" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"></a>

</body>
<!-- 必备的js-->
<jsp:include page="commonFooter.jsp"></jsp:include>
<!-- 自定义的js，请放置于该路径 -->
<script src="style/js/common.js"></script>
<script src="style/js/financeStudent.js"></script>
</html>