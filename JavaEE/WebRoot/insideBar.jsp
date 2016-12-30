<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.hdu.model.User" %>
    <!-- Start：侧边栏 -->
    <div class="admin-sidebar am-offcanvas" id="admin-offcanvas">
        <div class="am-offcanvas-bar admin-offcanvas-bar">
            <ul class="am-list admin-sidebar-list">
                <!-- 普通版本侧边栏，直接加入整个li就可以 -->
                <li><a href="index.jsp"><span class="am-icon-home"></span> 首页</a></li>
                
                <% 
                User user = (User)session.getAttribute("user");
                %>
                <% if(user.getIdentity() == 1) { %>
                 <li><a href="studentManage_admin.jsp"><span class="am-icon-file"></span> 学生管理</a></li>
                <li><a href="FinanceStudentShowAction.action"><span class="am-icon-file"></span> 财务管理</a></li>
                <% } %>
                <% if(user.getIdentity() == 0) { %>
                <li><a href="studentManage.jsp"><span class="am-icon-file"></span> 学生个人信息</a></li>
                <% } %>
                <% if(user.getIdentity() == 2) { %>
                <li><a href="BuildingStudentShowAction.action"><span class="am-icon-file"></span>宿舍管理</a></li>
                <% } %>
                <% if(user.getIdentity() == 3) { %>
                <li><a href="LibraryStudentShowAction.action"><span class="am-icon-file"></span> 图书管理</a></li>
                <% } %>
                <% if(user.getIdentity() == 4) { %>
                <li><a href="MedicineStudentShowAction.action"><span class="am-icon-file"></span> 医疗管理</a></li>
                <% } %>
                <!-- 含下拉的侧边栏，需要则在最里面的li进行添加即可 -->
                <li class="admin-parent">
                    <a class="am-cf am-collapsed" data-am-collapse="{target: '#collapse-nav'}"><span class="am-icon-file"></span> 按照自己需要更换此项 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
                    <ul class="am-list am-collapse admin-sidebar-sub" id="collapse-nav">
                        <li><a href="javascript:;" class="am-cf"><span class="am-icon-check"></span> 个人资料</a></li>
                        <li><a href="javascript:;"><span class="am-icon-puzzle-piece"></span> 帮助页</a></li>
                        <li><a href="javascript:;"><span class="am-icon-th"></span> 相册页面</a></li>
                        <li><a href="javascript:;"><span class="am-icon-calendar"></span> 系统日志</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
    <!-- End：侧边栏 -->
