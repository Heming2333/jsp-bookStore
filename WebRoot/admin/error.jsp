<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>错误</title>
    
    <link rel="shortcut icon" href="assets/img/favicon.png">
    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <!-- FONT AWESOME CSS -->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!--GOOGLE FONT -->
 	<link href='http://fonts.googleapis.com/css?family=Nova+Flat' rel='stylesheet' type='text/css'>
    <!-- custom CSS here -->
    <link href="assets/css/style-error.css" rel="stylesheet" />

  </head>
  
  <body>
    	<div class="container">
          	<div class="row pad-top text-center">
                <div class="col-md-6 col-md-offset-3 text-center">
              		<span id="error-link"></span>
				</div>
        	</div>

            <div class="row text-center">
                 <div class="col-md-8 col-md-offset-2">
                     
                     <h3> <i  class="fa fa-lightbulb-o fa-5x"></i> </h3>
               <a href="index.jsp" class="btn btn-primary">返回首页</a> 
			</div>
        </div>

    </div>
    <!-- /.container -->
  
  
    <!--Core JavaScript file  -->
    <script src="assets/js/jquery-1.10.2.js"></script>
    <!--bootstrap JavaScript file  -->
    <script src="assets/js/bootstrap.min.js"></script>
     <!--Count Number JavaScript file  -->
    <script src="assets/js/countUp.js"></script>
       <!--Custom JavaScript file  -->
    <script src="assets/js/custom.js"></script>
  </body>
</html>
