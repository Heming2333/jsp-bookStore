<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML5>
<html>
<!-- 通用头部，无需更改 -->
<%@ include file="commonHeader.jsp" %>
<title>个人信息</title>
<!-- 自定义css，请放置与该路径 -->
    <style type="text/css">
        #studentInfoBox input{
            border: 0px;
        }
        #studentInfoBox label{
            padding-top:6px;
        }
        .am-form input[type=number][disabled], .am-form input[type=number][readonly], .am-form input[type=search][disabled], .am-form input[type=search][readonly], .am-form input[type=text][disabled], .am-form input[type=text][readonly], .am-form input[type=password][disabled], .am-form input[type=password][readonly], .am-form input[type=datetime][disabled], .am-form input[type=datetime][readonly], .am-form input[type=datetime-local][disabled], .am-form input[type=datetime-local][readonly], .am-form input[type=date][disabled], .am-form input[type=date][readonly], .am-form input[type=month][disabled], .am-form input[type=month][readonly], .am-form input[type=time][disabled], .am-form input[type=time][readonly], .am-form input[type=week][disabled], .am-form input[type=week][readonly], .am-form input[type=email][disabled], .am-form input[type=email][readonly], .am-form input[type=url][disabled], .am-form input[type=url][readonly], .am-form input[type=tel][disabled], .am-form input[type=tel][readonly], .am-form input[type=color][disabled], .am-form input[type=color][readonly], .am-form select[disabled], .am-form select[readonly], .am-form textarea[disabled], .am-form textarea[readonly], .am-form-field[disabled], .am-form-field[readonly], fieldset[disabled] .am-form input[type=number], fieldset[disabled] .am-form input[type=search], fieldset[disabled] .am-form input[type=text], fieldset[disabled] .am-form input[type=password], fieldset[disabled] .am-form input[type=datetime], fieldset[disabled] .am-form input[type=datetime-local], fieldset[disabled] .am-form input[type=date], fieldset[disabled] .am-form input[type=month], fieldset[disabled] .am-form input[type=time], fieldset[disabled] .am-form input[type=week], fieldset[disabled] .am-form input[type=email], fieldset[disabled] .am-form input[type=url], fieldset[disabled] .am-form input[type=tel], fieldset[disabled] .am-form input[type=color], fieldset[disabled] .am-form select, fieldset[disabled] .am-form textarea, fieldset[disabled] .am-form-field{
            background-color: white;
        }
        .am-form input[type=number][disabled], .am-form input[type=number][readonly], .am-form input[type=search][disabled], .am-form input[type=search][readonly], .am-form input[type=text][disabled], .am-form input[type=text][readonly], .am-form input[type=password][disabled], .am-form input[type=password][readonly], .am-form input[type=datetime][disabled], .am-form input[type=datetime][readonly], .am-form input[type=datetime-local][disabled], .am-form input[type=datetime-local][readonly], .am-form input[type=date][disabled], .am-form input[type=date][readonly], .am-form input[type=month][disabled], .am-form input[type=month][readonly], .am-form input[type=time][disabled], .am-form input[type=time][readonly], .am-form input[type=week][disabled], .am-form input[type=week][readonly], .am-form input[type=email][disabled], .am-form input[type=email][readonly], .am-form input[type=url][disabled], .am-form input[type=url][readonly], .am-form input[type=tel][disabled], .am-form input[type=tel][readonly], .am-form input[type=color][disabled], .am-form input[type=color][readonly], .am-form select[disabled], .am-form select[readonly], .am-form textarea[disabled], .am-form textarea[readonly], .am-form-field[disabled], .am-form-field[readonly], fieldset[disabled] .am-form input[type=number], fieldset[disabled] .am-form input[type=search], fieldset[disabled] .am-form input[type=text], fieldset[disabled] .am-form input[type=password], fieldset[disabled] .am-form input[type=datetime], fieldset[disabled] .am-form input[type=datetime-local], fieldset[disabled] .am-form input[type=date], fieldset[disabled] .am-form input[type=month], fieldset[disabled] .am-form input[type=time], fieldset[disabled] .am-form input[type=week], fieldset[disabled] .am-form input[type=email], fieldset[disabled] .am-form input[type=url], fieldset[disabled] .am-form input[type=tel], fieldset[disabled] .am-form input[type=color], fieldset[disabled] .am-form select, fieldset[disabled] .am-form textarea, fieldset[disabled] .am-form-field:hover{
            cursor: default;
        }
        #submitBtn{
            display: none;
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
                <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">个人信息</strong> / <small>Personal Info</small></div>
                <!-- Start：左边四个按钮，按需增删 -->
                <div class="am-fr">
                    <div class="am-btn-toolbar">
                        <div class="am-btn-group am-btn-group-xs">
                            <!-- 此处的“新增”使用了模态框，调用具体模态框依据  data-am-modal 中target的引号部分，#addNewItem 表示调用id为
                            addNewItem 的模态框。模态框代码在最下方-->
                            <button type="button" class="am-btn am-btn-default" id="studentInfoModify"><span class="am-icon-pencil-square-o"></span> 编辑</button>
                        </div>
                    </div>
                </div>
                <!-- End：左边四个按钮，按需增删 -->
            </div>
            <hr>
            <div id="studentInfoBox">
                <form class="am-form am-form-horizontal">
                    <div class="am-form-group am-u-sm-6">
                        <label class="am-u-sm-2 am-form-label">姓名</label>
                        <div class="am-u-sm-10">
                            <input type="text" placeholder="姓名" disabled>
                        </div>
                    </div>
                    <div class="am-form-group am-u-sm-6">
                        <label class="am-u-sm-2 am-form-label">学号</label>
                        <div class="am-u-sm-10">
                            <input type="number" placeholder="学号" disabled>
                        </div>
                    </div>
                    <div class="am-form-group am-u-sm-6">
                        <label class="am-u-sm-2 am-form-label">性别</label>
                        <div class="am-u-sm-10">
                            <input type="text" placeholder="性别" disabled>
                        </div>
                    </div>
                    <div class="am-form-group am-u-sm-6">
                        <label class="am-u-sm-2 am-form-label">班级</label>
                        <div class="am-u-sm-10">
                            <input type="text" placeholder="班级号" disabled>
                        </div>
                    </div>
                    <div class="am-form-group am-u-sm-6">
                        <label class="am-u-sm-2 am-form-label">年龄</label>
                        <div class="am-u-sm-10">
                            <input type="number" placeholder="年龄" disabled>
                        </div>
                    </div>
                    <div class="am-form-group am-u-sm-6">
                        <label class="am-u-sm-2 am-form-label">专业</label>
                        <div class="am-u-sm-10">
                            <input type="text" placeholder="专业名" disabled>
                        </div>
                    </div>
                    <div class="am-form-group am-u-sm-6">
                        <label class="am-u-sm-2 am-form-label">电话</label>
                        <div class="am-u-sm-10">
                            <input type="tel" placeholder="电话号码" disabled>
                        </div>
                    </div>
                    <div class="am-form-group am-u-sm-6">
                        <label class="am-u-sm-2 am-form-label">学院</label>
                        <div class="am-u-sm-10">
                            <input type="text" placeholder="学院名" disabled>
                        </div>
                    </div>
                    <div class="am-form-group am-u-sm-6">
                        <label class="am-u-sm-2 am-form-label">籍贯</label>
                        <div class="am-u-sm-10">
                            <input type="text" placeholder="籍贯" disabled>
                        </div>
                    </div>
                    <div class="am-form-group am-u-sm-6">
                        <label class="am-u-sm-2 am-form-label">宿舍楼</label>
                        <div class="am-u-sm-10">
                            <input type="text" placeholder="宿舍楼号" disabled>
                        </div>
                    </div>
                    <div class="am-form-group am-u-sm-6" id="submitBtn">
                        <div class="am-u-sm-10 am-u-sm-offset-2">
                            <button type="button" class="am-btn am-btn-default" id="studentInfoSubmit">提交</button>
                            <button type="button" class="am-btn am-btn-default" id="studentInfoCancel">取消</button>
                        </div>
                    </div>
                    <div class="am-form-group am-u-sm-6">
                        <label class="am-u-sm-2 am-form-label">寝室号</label>
                        <div class="am-u-sm-10">
                            <input type="text" placeholder="寝室号" disabled>
                        </div>
                    </div>
                </form>
            </div>
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
<!-- 自定义的js，请放置于该路径 -->
<script src="style/js/studentManage.js"></script>
</html>
