<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<!-- 通用头部，无需更改 -->
<jsp:include page="commonHeader.jsp"></jsp:include>
<title>Medicine Student</title>
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
                <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">宿舍管理</strong> / <small>Dormitory Manage</small></div>
            </div>

            <hr>
            <div class="am-g">
                <!-- Start：搜索框，按需增删 -->
                <form action="BuildingStudentShowAction.action" method="post">
                <div class="am-u-sm-12 am-u-md-3">
                    <div class="am-input-group am-input-group-sm">
                        <input type="text" name="buildings" class="am-form-field" placeholder="按宿舍号搜索">
                        <span class="am-input-group-btn">
                        <button class="am-btn am-btn-default" type="submit">搜索</button>
                        </span>
                    </div>
          			<div>${errors.building[0]}</div>
                </div>
                </form>
                <!-- End：搜索框，按需增删 -->
            </div>

            <div class="am-g">
                <div class="am-u-sm-12">
                    <form class="am-form">
                        <table class="am-table am-table-striped am-table-hover table-main">
                            <thead>
	                            <tr>
	                                <th class="table-title">楼号</th>
	                                <th class="table-type">宿舍号</th>
	                                <th class="table-author am-hide-sm-only">宿舍楼情况简述</th>
	                                <th class="table-date am-hide-sm-only">是否为优秀寝室</th>
	                            </tr>
                            </thead>
                            <tbody>
								<s:iterator value="buildingstu">
		                            <tr>
		                                <td><s:property value="bno"/></td>
		                                <td><s:property value="dno"/></td>
		                                <td><s:property value="bintro"/></td>
		                                <td><s:property value="dgood"/></td>
		                            </tr>
	                            </s:iterator>
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

<!-- Start：添加新项的模态框，如有需，请自行复制完整并更改id -->
<div class="am-modal am-modal-alert" tabindex="-1" id="addNewItem">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">头部标题<span data-am-modal-close class="am-close">&times;</span></div>
        <div class="am-modal-bd">
            <form class="am-form">
                <!-- 请在placeholder里写该项作用 -->
                <input type="text" class="am-form-field am-radius" placeholder="姓名" />
                <input type="text" class="am-form-field am-radius" placeholder="学号" />
                <input type="text" class="am-form-field am-radius" placeholder="圆角表单域" />
                <input type="text" class="am-form-field am-radius" placeholder="圆角表单域" />
                <input type="text" class="am-form-field am-radius" placeholder="圆角表单域" />
                <input type="text" class="am-form-field am-radius" placeholder="圆角表单域" />
            </form>
        </div>
        <div class="am-modal-footer">
            <button type="button" class="am-btn am-btn-default" data-am-modal-cancel>取消</button>
            <button type="button" class="am-btn am-btn-default" data-am-modal-confirm>提交</button>
        </div>
    </div>
</div>
<!-- End：添加新项的模态框 -->
<jsp:include page="insideFooter.jsp"></jsp:include>
    </div>
    <!-- End：内容 -->
</div>
</body>
<!-- 必备的js-->
<jsp:include page="commonFooter.jsp"></jsp:include>
<!-- 自定义的js，请放置于该路径 -->
<script src="style/js/common.js"></script>
<!--<script src="style/js/"></script>-->
</html>