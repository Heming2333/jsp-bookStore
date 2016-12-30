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
                <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">图书管理</strong> / <small>Library Manage</small></div>
            </div>

            <hr>
            <!-- Start：内容上头的部分操作，按需选取 -->
            <div class="am-g">
                <!-- Start：左边四个按钮，按需增删 -->
                <div class="am-u-sm-12 am-u-md-2">
                    <div class="am-btn-toolbar">
                        <div class="am-btn-group am-btn-group-xs">
                            <!-- 此处的“新增”使用了模态框，调用具体模态框依据  data-am-modal 中target的引号部分，#addNewItem 表示调用id为
                            addNewItem 的模态框。模态框代码在最下方-->
                            <button type="button" class="am-btn am-btn-default" data-am-modal="{target: '#addNewStudent',width: 525}"><span class="am-icon-plus"></span> 新增</button>
                        </div>
                    </div>
                </div>
                <!-- End：左边四个按钮，按需增删 -->
                <!-- Start：条件选框，按需增删 -->
                <div class="am-u-sm-12 am-u-md-2">
                    <div class="am-form-group am-form-select">
                        <select class=" am-input-lg">
		                    <option value="1">所有学院</option>
		                    <option value="2">计算机学院</option>
		                    <option value="3">数字媒体学院</option>
		                    <option value="4">外国语学院</option>
		                </select>
                    </div>
                </div>
                <div class="am-u-sm-12 am-u-md-2">
                    <div class="am-form-group am-form-select">
                        <select class=" am-input-lg">
                            <option value="option1">所有专业</option>
                            <option value="option2">计算机科学与技术</option>
                            <option value="option3">软件工程</option>
                            <option value="option4">数字媒体与艺术</option>
                            <option value="option5">平面设计</option>
                        </select>
                    </div>
                </div>
                <div class="am-u-sm-12 am-u-md-2">
                    <div class="am-form-group am-form-select">
                        <select class=" am-input-lg">
                            <option value="option1">所有班级</option>
                            <option value="option2">14108411</option>
                            <option value="option3">14108412</option>
                            <option value="option4">14108414</option>
                            <option value="option5">14108414</option>
                        </select>
                    </div>
                </div>
                <!-- End：条件选框，按需增删 -->
                <!-- Start：搜索框，按需增删 -->
                <form action="LibraryManageShowAction.action" method="post">
                <div class="am-u-sm-12 am-u-md-3">
                    <div class="am-input-group am-input-group-sm">
                        <input type="text" name="books" class="am-form-field" placeholder="按书名关键字搜索">
                        <span class="am-input-group-btn">
                        <button class="am-btn am-btn-default" type="submit">搜索</button>
                        </span>
                    </div>
          			<div>${errors.book[0]}</div>
                </div>
                </form>
                <!-- End：搜索框，按需增删 -->
            </div>
            <!-- End：内容上头的部分操作，按需选取 -->

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
                                <th class="table-title">年龄</th>
                                <th class="table-type">性别</th>
                                <th class="table-type">联系方式</th>
                                <th class="table-author am-hide-sm-only">书籍编号</th>
                                <th class="table-date am-hide-sm-only">书名</th>
                                <th class="table-date am-hide-sm-only">作者</th>
                                <th class="table-date am-hide-sm-only">出版社</th>
                                <th class="table-date am-hide-sm-only">价格</th>
                                <th class="table-date am-hide-sm-only">存量</th>
                                <th class="table-date am-hide-sm-only">借书时间</th>
                                <th class="table-date am-hide-sm-only">还书时间</th>
                                <th class="table-date am-hide-sm-only"></th>
                                <!-- <th class="table-set">操作</th> -->
                            </tr>
                            </thead>
                            <!-- End：表格头，定义列标题 -->
                            <!-- Start：表格体，定义行内容，，以tr为一行，以td为单位 -->
                            <tbody>
								<s:iterator value="bookm">
		                            <tr>
		                                <td><s:property value="name"/></td>
		                                <td><s:property value="age"/></td>
		                                <td><s:property value="sex"/></td>
		                                <td><s:property value="tel"/></td>
		                                <td><s:property value="isbn"/></td>
		                                <td><s:property value="bookName"/></td>
		                                <td><s:property value="author"/></td>
		                                <td><s:property value="publisher"/></td>
		                                <td><s:property value="price"/></td>
		                                <td><s:property value="snum"/></td>
		                                <td><s:property value="lendTime"/></td>
		                                <td><s:property value="returnTime"/></td>
		                                <td>
		                                    <div class="am-btn-toolbar">
		                                        <div class="am-btn-group am-btn-group-xs">
		                                            <button type="button" class="am-btn am-btn-default am-btn-xs am-text-secondary editItem"  data-am-modal="{target: '#modifyStudent',width: 525}"><span class="am-icon-pencil-square-o"></span> 编辑</button>
		                                            <button type="button" class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only"><span class="am-icon-trash-o"></span> 删除</button>
		                                        </div>
		                                    </div>
		                                </td>
		                            </tr>
		                            </s:iterator>
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
<div class="am-modal am-modal-alert" tabindex="-1" id="addNewStudent">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">新增借还信息<span data-am-modal-close class="am-close">&times;</span></div>
        <div class="am-modal-bd">
		<s:form action="LibraryManageAddAction.action" method="post" theme="simple" class="am-form" id="newStudentForm">
                <!-- 请在placeholder里写该项作用 -->
                <input type="text" class="am-form-field am-radius" id="newStudentName" placeholder="学生姓名" required>
                <input type="text" class="am-form-field am-radius" id="newStudentId" placeholder="学生年龄" required>
                <input type="text" class="am-form-field am-radius" id="newStudentId" placeholder="学生性别" required>
                <input type="text" class="am-form-field am-radius" id="newStudentId" placeholder="联系方式" required>
                <input name="isbn" type="text" class="am-form-field am-radius" id="newStudentId" placeholder="借记书籍编号" required>
                <input name="bookName" type="text" class="am-form-field am-radius" id="newStudentId" placeholder="书名" required>
                <input name="author" type="text" class="am-form-field am-radius" id="newStudentId" placeholder="作者" required>
                <input name="publisher" type="text" class="am-form-field am-radius" id="newStudentId" placeholder="出版社" required>
                <input name="price" type="text" class="am-form-field am-radius" id="newStudentId" placeholder="价格" required>
                <input name="snum" type="text" class="am-form-field am-radius" id="newStudentId" placeholder="存量" required>
                <input name="summary" type="text" class="am-form-field am-radius" id="newStudentId" placeholder="书籍简介" required>
                <input name="lendTime" type="text" class="am-form-field am-radius" id="newStudentId" placeholder="借书时间" required>
                <input name="returnTime" type="text" class="am-form-field am-radius" id="newStudentId" placeholder="还书时间" required>
		        <div class="am-modal-footer">
		            <button type="button" class="am-btn am-btn-default" id="addCancel" data-am-modal-close>取消</button>
		            <button type="submit" class="am-btn am-btn-default" id="addSubmit" data-am-modal-confirm>提交</button>
		        </div>
        </s:form>
        </div>
    </div>
</div>
<!-- End：添加新项的模态框 -->
<!-- Start：添加新项的模态框，如有需，请自行复制完整并更改id -->
<div class="am-modal am-modal-alert" tabindex="-1" id="modifyStudent">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">更新借还信息<span data-am-modal-close class="am-close">&times;</span></div>
        <div class="am-modal-bd">
		<s:form action="LibraryManageUpdateAction.action" method="post" theme="simple" class="am-form" id="newStudentForm">
                <!-- 请在placeholder里写该项作用 -->
                <input name='lendTime' type="text" class="am-form-field am-radius" id="newStudentId" placeholder="借书时间" required/>
                <input name='returnTime' type="text" class="am-form-field am-radius" id="newStudentId" placeholder="还书时间" required/>
		        <div class="am-modal-footer">
		            <button type="button" class="am-btn am-btn-default" id="modifyCancel" data-am-modal-close>取消</button>
		            <button type="submit" class="am-btn am-btn-default" id="modifySubmit" data-am-modal-confirm>提交</button>
		        </div>
        </s:form>
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
