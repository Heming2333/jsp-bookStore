<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
  <head>
    <title>后台登录</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="shortcut icon" href="assets/img/favicon.png">
	<link rel="stylesheet" type="text/css" href="assets/css/style.css" tppabs="assets/css/style.css" />
  </head>
  
  <body>
 	 <form method="post" action="bsAdmin_login.action"> 
		<dl class="admin_login">
			 <dt>
			  <strong>书城管理平台登录</strong>
			  <em>Book_store System</em>
			  <span id="tips">
			  	<% if (request.getAttribute("error") != null) { %>
			  	<%= request.getAttribute("error") %>
			  	<% } %>
			  </span>
			 </dt> 
			 <dd class="user_icon">
			  <input type="text" placeholder="账号" class="login_txtbx" id="username" name="username"/>
			 </dd>
			 <dd class="pwd_icon">
			  <input type="password" placeholder="密码" class="login_txtbx" id="password" name="password"/>
			 </dd>
			 <dd class="val_icon">
			  <div class="checkcode">
			    <input type="text" id="J_codetext" placeholder="验证码" maxlength="4" class="login_txtbx">
			    <canvas class="J_codeimg" id="myCanvas" onclick="createCode()">对不起，您的浏览器不支持canvas，请下载最新版浏览器!</canvas>
			  </div>
			  <input type="button" value="验证码核验" class="ver_btn" onClick="validate();">
			 </dd>
			 <dd>
			  <input type="submit" value="立即登陆" class="submit_btn" id="submit_btn" disabled="disabled"/>
			 </dd>
		</dl>
 	 </form> 

    <script src="assets/js/jquery-1.10.2.js"></script>
    <script src="assets/js/verificationNumbers.js"></script>
    <script src="assets/js/Particleground.js"></script>
	<script>
		$(document).ready(function() {
		    //粒子背景特效
		    //$('body').particleground({
		     // dotColor: '#e0e8f5',
		     // lineColor: '#e0e8f5'
		    //});
		    //验证码
		    createCode();
		    $("#J_codetext").keyup(function(){
		    	var code_value = $("#J_codetext").val();
		    	if( code_value == code ){
		    		$("#submit_btn").removeAttr("disabled");
		    		$("#tips").html("");
		    	} else if( code_value.length === 4 ) {
		    		$("#submit_btn").attr("disabled","true");
		    		$("#tips").html("验证码错误！");
		    	} else {
		    		$("#submit_btn").attr("disabled","true");
		    		$("#tips").html("");
		    	}
		    });
		});
	</script>
  </body>
</html>
