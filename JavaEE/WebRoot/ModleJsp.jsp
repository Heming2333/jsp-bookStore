<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML5>
<html>
<!-- 通用头部，无需更改 -->
<%@ include file="commonHeader.jsp" %>
<title>Your Title Here</title>
<!-- 自定义css，请放置与该路径 -->
<!--<link rel="stylesheet" href="style/css/">-->
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
                <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">名称</strong> / <small>English Name</small></div>
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
                            <button type="button" class="am-btn am-btn-default" data-am-modal="{target: '#addNewItem'}"><span class="am-icon-plus"></span> 新增</button>
                        </div>
                    </div>
                </div>
                <!-- End：左边四个按钮，按需增删 -->
                <!-- Start：条件选框，按需增删 -->
                <div class="am-u-sm-12 am-u-md-3">
                    <div class="am-form-group">
                        <select data-am-selected="{btnSize: 'sm'}">
                            <option value="option1">所有类别</option>
                            <option value="option2">IT业界</option>
                            <option value="option3">数码产品</option>
                            <option value="option3">笔记本电脑</option>
                            <option value="option3">平板电脑</option>
                            <option value="option3">只能手机</option>
                            <option value="option3">超极本</option>
                        </select>
                    </div>
                </div>
                <!-- End：条件选框，按需增删 -->
                <!-- Start：搜索框，按需增删 -->
                <div class="am-u-sm-12 am-u-md-3">
                    <div class="am-input-group am-input-group-sm">
                        <input type="text" class="am-form-field">
                        <span class="am-input-group-btn">
                        <button class="am-btn am-btn-default" type="button">搜索</button>
                        </span>
                    </div>
                </div>
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
                                <th class="table-id">序号</th>
                                <th class="table-title">标题</th>
                                <th class="table-type">类别</th>
                                <th class="table-author am-hide-sm-only">作者</th>
                                <th class="table-date am-hide-sm-only">修改日期</th>
                                <th class="table-set">操作</th>
                            </tr>
                            </thead>
                            <!-- End：表格头，定义列标题 -->
                            <!-- Start：表格体，定义行内容，，以tr为一行，以td为单位 -->
                            <tbody>
                            <tr>
                                <td>1</td>
                                <td>Business management</td>
                                <td>default</td>
                                <td>测试1号</td>
                                <td>2014年9月4日 7:28:47</td>
                                <td>
                                    <div class="am-btn-toolbar">
                                        <div class="am-btn-group am-btn-group-xs">
                                            <button type="button" class="am-btn am-btn-default am-btn-xs am-text-secondary editItem" onclick="item.editItem(this)"><span class="am-icon-pencil-square-o"></span> 编辑</button>
                                            <button type="button" class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only"><span class="am-icon-trash-o"></span> 删除</button>
                                        </div>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td>Business management</td>
                                <td>default</td>
                                <td>测试1号</td>
                                <td>2014年9月4日 7:28:47</td>
                                <td>
                                    <div class="am-btn-toolbar">
                                        <div class="am-btn-group am-btn-group-xs">
                                            <button type="button" class="am-btn am-btn-default am-btn-xs am-text-secondary editItem" onclick="item.editItem(this)"><span class="am-icon-pencil-square-o"></span> 编辑</button>
                                            <button type="button" class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only"><span class="am-icon-trash-o"></span> 删除</button>
                                        </div>
                                    </div>
                                </td>
                            </tr>
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
<%@ include file="insideFooter.jsp" %>
    </div>
    <!-- End：内容 -->
</div>
</body>
<!-- 必备的js-->
<%@ include file="commonFooter.jsp" %>
<!-- 自定义的js，请放置于该路径 -->
<script src="style/js/common.js"></script>
<!--<script src="style/js/"></script>-->
</html>
