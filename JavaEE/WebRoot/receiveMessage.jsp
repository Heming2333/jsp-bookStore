<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML5>
<html>
<!-- 通用头部，无需更改 -->
<%@ include file="commonHeader.jsp" %>
<title>信箱</title>
 
<!-- 自定义css，请放置与该路径 -->
<!--<link rel="stylesheet" href="style/css/">-->
<style type="text/css">
	#tableBody td{
		overflow:hidden;
	}
</style>
</head>
  
<body>
<!-- 通用的头部导航栏以及左边栏 -->
<%@ include file="insideHeader.jsp"%>
<div class="am-cf admin-main">
<%@ include file="insideBar.jsp"%>

    <!-- Start：内容 -->
    <div class="admin-content">
        <div class="admin-content-body">
            <div class="am-cf am-padding am-padding-bottom-0">
                <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">信箱</strong> / <small>Finance Manage</small></div>
            </div>

            <hr>
<!-- Start：内容上头的部分操作，按需选取 -->
            <div class="am-g">
                <!-- Start：左边四个按钮，按需增删 -->
                <div class="am-u-sm-12 am-u-md-6">
                    <div class="am-btn-toolbar">
                        <div class="am-btn-group am-btn-group-xs">
                            <!-- 此处的“新增”使用了模态框，调用具体模态框依据  data-am-modal 中target的引号部分，#addNewItem 表示调用id为
                            addNewItem 的模态框。模态框代码在最下方-->
                            <button type="button" class="am-btn am-btn-default" id="sendMessageBtn" data-am-modal="{target: '#sendMessage'}"><span class="am-icon-plus"></span> 发送消息</button>
                        </div>
                    </div>
                </div>
                <!-- End：左边四个按钮，按需增删 -->
            </div>
            <!-- End：内容上头的部分操作，按需选取 -->
            <div class="am-g">
                <div class="am-u-sm-12">
                    <form class="am-form">
                        <table class="am-table am-table-striped am-table-hover table-main">
                            <thead>
	                            <tr>
	                                <th class="table-title">来自</th>
	                                <th class="table-type">时间</th>
	                                <th class="table-date am-hide-sm-only">内容</th>
	                            </tr>
                            </thead>
                       <!-- End：表格头，定义列标题 -->
                            <!-- Start：表格体，定义行内容，，以tr为一行，以td为单位 -->
                            <tbody id="tableBody">
                            </tbody>
                            <!-- End：表格体，定义行内容，，以tr为一行，以td为单位 -->
                        </table>
                        <hr />
                    </form>
                    <!-- End：表格部分 -->
                </div>
            </div>
            
        </div>
    </div>
    </div>
<!-- Start：添加新项的模态框，如有需，请自行复制完整并更改id -->
<div class="am-modal am-modal-alert" tabindex="-1" id="sendMessage">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">发送消息<span data-am-modal-close class="am-close">&times;</span></div>
        <div class="am-modal-bd">
                <input type="text" id="studentId" class="am-form-field am-radius" placeholder="学号" />
                <input type="text" id="time" class="am-form-field am-radius" placeholder="时间" readonly/>
                <textarea class="" id="content" rows="5" cols="56" id="doc-ta-1"></textarea>
        </div>
        <div class="am-modal-footer">
            <button type="button" class="am-btn am-btn-default" data-am-modal-close id="cancelEdit">取消</button>
            <button type="button" class="am-btn am-btn-default" data-am-modal-confirm id="submitEdit">提交</button>
        </div>
    </div>
</div>
<!-- End：添加新项的模态框 -->
<!-- Start：添加新项的模态框，如有需，请自行复制完整并更改id -->
<div class="am-modal am-modal-alert" tabindex="-1" id="seeMessage">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">消息<span data-am-modal-close class="am-close">&times;</span></div>
        <div class="am-modal-bd">
                <form class="am-form am-form-horizontal">
                	<div class="am-form-group">
					    <label for="id2" class="am-u-sm-1 am-form-label">From:</label>
					    <div class="am-u-sm-11">
					    	<input class="am-form-field am-radius" type="text" id="id2">
					    </div>
					</div>
					<div class="am-form-group">
					    <label for="time2" class="am-u-sm-1 am-form-label">Time:</label>
					    <div class="am-u-sm-11">
					    	<input class="am-form-field am-radius" type="text" id="time2" readonly>
					    </div>
					</div>
	                <textarea id="content2" rows="15" cols="40" id="doc-ta-1"></textarea>
                </form>
        </div>
    </div>
</div>
<!-- End：添加新项的模态框 -->
<!-- 这个是当屏幕变小时右下角会出现的按钮，点击后显示左边导航栏内容 -->
<a href="#" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"></a>

</body>
<!-- 必备的js-->
<jsp:include page="commonFooter.jsp"></jsp:include>
<!-- 自定义的js，请放置于该路径 -->
<script src="style/js/message.js"></script>
</html>
