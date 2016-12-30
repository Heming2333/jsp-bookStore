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
        <div class="admin-content-body">
            <div class="am-cf am-padding am-padding-bottom-0">
                <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">学生管理</strong> / <small>Student Manage</small></div>
            </div>

            <hr>

            <!-- Start：中间内容表格部分，按需选取 -->
            <div class="am-g">
                <div class="am-u-sm-12">
                    <!-- Start：表格部分 -->
                    <form class="am-form">
                        <table class="am-table am-table-striped am-table-hover table-main">
                            <!-- Start：表格头，定义列标题 -->
                            <!-- 请务必使表格头的个数与下方表格体部分个数相同，以th为单位 -->
                            <thead>
                            <tr>
                                <!-- 第一个序号请保留不要删除，循环的时候也请打印 -->
                                <th class="table-id">姓名</th>
                                <th class="table-title">学号</th>
                                <th class="table-type">性别</th>
                                <th class="table-author am-hide-sm-only">学院</th>
                                <th class="table-date am-hide-sm-only">专业</th>
                                <th class="table-date am-hide-sm-only">班级</th>
                                <th class="table-set">操作</th>
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
            <!-- End：中间内容表格部分，按需选取 -->
        </div>
<!-- Start：添加新项的模态框，如有需，请自行复制完整并更改id -->
<div class="am-modal am-modal-alert" tabindex="-1" id="modifyStudent">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">编辑学生<span data-am-modal-close class="am-close">&times;</span></div>
        <div class="am-modal-bd">
            <form class="am-form" id="newStudentForm">
                <!-- 请在placeholder里写该项作用 -->
                <input type="text" class="am-form-field am-radius" id="modifyStudentName" placeholder="姓名"  readonly/>
                <input type="text" class="am-form-field am-radius" id="modifyStudentId" placeholder="学号"  readonly/>
                <select id="modifyStudentCollege" onchange="college(this)">
                    <option value="所有学院">所有学院</option>
                </select>
                <select id="modifyStudentMajor" onchange="major(this)">
                    <option value="所有专业">所有专业</option>
                </select>
                <select id="modifyStudentClass">
                    <option value="所有班级">所有班级</option>
                </select>
            </form>
        </div>
        <div class="am-modal-footer">
            <button type="button" class="am-btn am-btn-default" id="modifyCancel" data-am-modal-close>取消</button>
            <button type="button" class="am-btn am-btn-default" id="modifySubmit" data-am-modal-confirm>提交</button>
        </div>
    </div>
</div>
<!-- End：添加新项的模态框 -->
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
