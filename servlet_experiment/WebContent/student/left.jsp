<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<title>左侧导航栏</title>
		<link rel="stylesheet" type="text/css" href="../css/studentCSS/leftCSS.css"/>
		<link rel="stylesheet" type="text/css" href="../css/bootstrap.css"/>
		<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
		<script type="text/javascript" src="../js/bootstrap.js"></script>
	</head>
	<body>
		<div class="box">
			<div class="content">
				<ul class="nav nav-stacked">
					<li class="header">报告查看</li>
					<li><a class="headerchild" href="${pageContext.request.contextPath }/experAndTraList?flag=unfinexp" target="center"><i class="icon-pencil glyphicon glyphicon-pencil"></i><span class="hidden-tablet"> 未完成的实验报告</span></a></li>
					<li><a class="ajax-link" href="${pageContext.request.contextPath }/experAndTraList?flag=finexp" target="center"><i class="icon-ok glyphicon glyphicon-ok"></i><span class="hidden-tablet"> 已完成的实验报告</span></a></li>
					<li class="header">实训查看</li>
					<li><a class="headerchild" href="${pageContext.request.contextPath }/experAndTraList?flag=unfintra" target="center"><i class="icon-pencil glyphicon glyphicon-pencil"></i><span class="hidden-tablet"> 未完成的实训报告</span></a></li>
					<li><a class="headerchild" href="${pageContext.request.contextPath }/experAndTraList?flag=fintra" target="center"><i class="icon-ok glyphicon glyphicon-ok"></i><span class="hidden-tablet"> 已完成的实训报告</span></a></li>
					<li class="header">成绩查询</li>
					<li><a class="headerchild" href="${pageContext.request.contextPath }/experAndTraList?flag=expscore" target="center"><i class="icon-search glyphicon glyphicon-search"></i><span class="hidden-tablet"> 实验成绩查询</span></a></li>
					<li><a class="headerchild" href="${pageContext.request.contextPath }/experAndTraList?flag=trascore" target="center"><i class="icon-search glyphicon glyphicon-search"></i><span class="hidden-tablet"> 实训成绩查询</span></a></li>
					<li class="header">个人资料管理</li>
					<li><a class="headerchild" href="stuinfor.jsp" target="center"><i class="icon-file glyphicon glyphicon-file"></i><span class="hidden-tablet"> 资料管理</span></a></li>				
				</ul>
			</div>
		</div>
	</body>
</html>
