<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.hdu.model.User" %>
<!-- 此处是过时浏览器才会显示的部分 -->
<!--[if lte IE 9]>
<p class="browsehappy">你正在使用<strong>过时</strong>的浏览器，Amaze UI 暂不支持。 请 <a href="http://browsehappy.com/" target="_blank">升级浏览器</a>
    以获得更好的体验！</p>
<![endif]-->
<!-- Start：头部导航栏 -->
<header class="am-topbar am-topbar-inverse admin-header">
    <div class="am-topbar-brand">
        <strong>学生综合管理系统</strong>
    </div>
    <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only" data-am-collapse="{target: '#topbar-collapse'}"><span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span></button>

    <div class="am-collapse am-topbar-collapse" id="topbar-collapse">
        <ul class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list">
        <% 
                User user = (User)session.getAttribute("user");
                %>
                 <% if(user.getIdentity() == 0) { %>
            <li><a href="receiveMessage.jsp"><span class="am-icon-envelope-o"></span> 收件箱 <span class="am-badge am-badge-warning"></span></a></li>
             <% } %>
            <li class="am-dropdown" data-am-dropdown>
                <a class="am-dropdown-toggle" id="user" data-am-dropdown-toggle href="javascript:;" rel="<% out.print(((User)session.getAttribute("user")).getUsername()); %>">
                    <span class="am-icon-users"></span><% out.print(((User)session.getAttribute("user")).getUsername()); %><span class="am-icon-caret-down"></span>
                </a>
                <ul class="am-dropdown-content">
                    <li><a href="#"><span class="am-icon-power-off"></span> 退出</a></li>
                </ul>
            </li>
            <li class="am-hide-sm-only"><a href="javascript:;" id="admin-fullscreen"><span class="am-icon-arrows-alt"></span> <span class="admin-fullText">开启全屏</span></a></li>
        </ul>
    </div>
</header>
<!-- End：头部导航栏 -->
