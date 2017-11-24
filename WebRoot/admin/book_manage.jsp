<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%  
    if(session.getAttribute("user") == null){//说明是用户首次登录，而非服务端跳转，这时候再在cookies中进行取值操作
    	 response.sendRedirect("http://127.0.0.1:8080/book_store/admin/login.jsp");
         return;      
    }
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>图书管理</title>
    <%@ include file="admin_header.jspf" %>  
  </head>
  
  <body>
    <%@ include file="admin_top_nav.jspf" %>  
    <nav class="navbar-default navbar-side" role="navigation">
    	<div class="sidebar-collapse">
    		<ul class="nav" id="main-menu">
    			<li>
    				<a href="bsAdmin_query.action" class="waves-effect waves-dark">
    					<i class="fa fa-cogs"></i> 
    					管理员列表
    				</a>
                </li>
    			<li>
    				<a href="bsUser_query.action" class="waves-effect waves-dark">
    					<i class="fa fa-users"></i> 
    					用户管理
    				</a>
                </li>
                <li>
                	<a href="bsBooks_query.action" class="active-menu waves-effect waves-dark">
                		<i class="fa fa-desktop"></i> 
                		图书管理
                	</a>
                </li>
                <li>
                	<a href="bsOrder_query.action" class="waves-effect waves-dark">
                		<i class="fa fa-bar-chart-o"></i> 
                		订单管理
                	</a>
                </li>
                <li>
                	<a href="bsEval_query.action" class="waves-effect waves-dark">
                		<i class="fa fa-table"></i> 
                		评论管理
                	</a>
                </li>
                <li>
                	<a href="bsQuestion_query.action" class="waves-effect waves-dark">
                		<i class="fa fa-edit"></i>
                		问题管理
                	</a>
                </li>
                <li>
                	<a href="bsAnswer_query.action" class="waves-effect waves-dark">
                		<i class="fa fa-envelope-open-o"></i>
                		回答管理
                	</a>
                </li>
                <li>
                	<a href="bsBanner_query.action" class="waves-effect waves-dark"> 
                		<i class="fa fa-picture-o"></i> 
                		图片管理 
                	</a>
                </li>
            </ul>
        </div>
     </nav>
     <div id="page-wrapper" >
		  <div class="header"> 
                        <h3 class="page-header">
                        	图书管理
                        </h3>
						<ol class="breadcrumb">
					  <li><a>首页</a></li>
					  <li><a>图书管理</a></li>
					  <li class="active">图书列表</li>
					</ol> 
									
		</div>
		
            <div id="page-inner"> 
               
            <div class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->
                    <div class="card">
                        <div class="card-action">
                             	图书列表
                        </div>
                        <div class="card-content">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th class="center">
                                            	<p>
                                            	 	<input type="checkbox" class="filled-in" id="filled-in-box" />
                                            	 	<label for="filled-in-box"></label>
                                            	</p>
                                            </th>
                                            <th class="center">
                                            	书名
											</th>
                                            <th class="center">
                                            	封面
                                            </th>
                                            <th class="center">
                                            	作者
                                            </th>
                                            <th class="center">
                                            	简介
                                            </th>
                                            <th class="center">
                                            	出版社
                                            </th>
                                            <th class="center">
                                            	出版时间
                                            </th>
                                            <th class="center">
                                            	书籍编号
                                            </th>
                                            <th class="center">
                                            	价格
                                            </th>
                                            <th class="center">
                                            	库存
                                            </th>
                                            <th class="center">
                                            	已售
                                            </th>
                                            <th class="center">
                                            	操作
                                            </th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${sessionScope.bsBooksList }" var="bsBooks"> 
	                                        <tr class="odd gradeX">
	                                            <td class="center">
	                                            	<p>
	                                            	 	<input type="checkbox" class="filled-in" id="filled-in-box-1" />
	                                            	 	<label for="filled-in-box-1"></label>
	                                            	</p>
	                                            </td>
	                                            <td class="center">
	                                            	${bsBooks.title}
	                                            </td>
	                                            <td class="center">
	                                            	<img src="${bsBooks.img}" />
	                                            </td>
	                                            <td class="center">
	                                            	${bsBooks.author}
	                                            </td>
	                                            <td class="center">
	                                            	${bsBooks.subtitle}
	                                            </td>
	                                            <td class="center">
	                                            	${bsBooks.publish}
	                                            </td>
	                                            <td class="center">
													${fn:substring(bsBooks.publishtime,0,10)}
	                                            </td>
	                                            <td class="center">
	                                            	${bsBooks.number}
	                                            </td>
	                                            <td class="center">
	                                            	${bsBooks.nprice}
	                                            </td>
	                                            <td class="center">
	                                            	${bsBooks.store}
	                                            </td>
	                                            <td class="center">
	                                            	${bsBooks.sale}
	                                            </td>
	                                            <td class="center">
	                                            	<a class="waves-effect waves-light btn"><i class="material-icons left">mode_edit</i>编辑</a>
	                                            	<a class="waves-effect waves-light btn btn_1"><i class="material-icons left">cloud</i>删除</a>
	                                            </td>
	                                        </tr> 
									    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            
                        </div>
                    </div>
                </div>
            </div>
            <footer>
           		<p>基于JSP的中型购书网站管理系统设计与实现 @设计与编写: <a href="https://github.com/yuxlan" target="_blank">余小兰</a></p>
           	</footer>
    	</div>
	</div>
	
    <%@ include file="admin_footer.jspf" %>
   
  </body>
</html>
