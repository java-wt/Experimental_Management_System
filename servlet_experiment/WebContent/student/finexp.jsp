<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<base target="_parent" /> 
		<meta charset="utf-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css"/>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.4.1.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstrap.js"></script>
	</head>
	
	<style type="text/css">
		.w{
			width: 90%;
			margin: 0 auto;
		}
		
		.content{
			margin-top: 2%;
		}
		.content, .tab{
			border: 1px solid #DEDEDE;
			border-radius: 2px;
		}
		
		
		.header{
			background: url(${pageContext.request.contextPath }/img/studentIMG/tableheaderBG.jpg) repeat-x;
			height: 35px;
		}
		.header span{
			font-size: 15px;
			position: relative;
			left: 2%;
			top: 17%;
		}
		.header a{
			display: inline-block;
			width: 27px;
			height: 28px;
			background-color: #f5f5f5;
			text-align: center;
			border: 1px solid #ccc;
			border-radius: 20px;
			position: relative;
			left: 80%;
			top: 10%;
		}
		.header a img{
			display: block;
			margin-top: 20%;
			margin-left: 23%;
		}
		
		.header a:hover{
			background-color: #e6e6e6;
		}
		
		.tab{
			width: 98%;
			margin: 0 auto;
			text-indent: 1%;
			margin-top: 1%;
			margin-bottom: 2.5%;
		}
		.tab th, .tab td{
			padding-top: 0.5%;
			padding-bottom: 0.5%;
		}
		.tab a{
			display: inline-block;
			height: 30px;
		}
	</style>
	<body>
		<div class="w content">  <!-- border #DEDEDE -->
			
			<div class="header" >
				<span class="word"><strong>已完成实训报告</strong></span>
				<a href="${pageContext.request.contextPath }/student/index.jsp"><img src="${pageContext.request.contextPath }/img/studentIMG/zhuye.png" style="width: 13px;"></a>
				
				<a href="#"><img src="${pageContext.request.contextPath }/img/studentIMG/shangyiye.png" style="width: 13px;"></a>
				<a href="#"><img src="${pageContext.request.contextPath }/img/studentIMG/xiayiye.png" style="width: 13px;"></a>
				<a href="#"><img src="${pageContext.request.contextPath }/img/studentIMG/shuaxin.png" style="width: 13px;"></a>
			</div>
			
			<div class="tables">
				<table class="tab" border="1px" cellspacing="0" cellpadding="0">
					<tr>
						<th>课程名称</th>
						<th>实训名称</th>
						<th>教师名称</th>
						<th>实训周次</th>
						<th>截止时间</th>
						<th>操作</th>
					</tr>
					<c:forEach var="experiment" items="${requestScope.list }">
						<c:if test="${!empty experiment }">
							<tr>
								<td>${experiment.courseName }</td>
								<td>${experiment.experimentName }</td>
								<td>${experiment.teacherName }</td>
								<td>${experiment.experimentWeek }</td>
								<td>${experiment.experimentFinishtime }</td>
								<td>
									<a href="#" class="btn btn-success">
										<img src="${pageContext.request.contextPath }/img/studentIMG/sousuo.png" style="width: 16px;">
										<span>查看</span>
									</a>
									<a href="#" class="btn btn-primary">
										<img src="${pageContext.request.contextPath }/img/studentIMG/bianji.png" style="width: 16px;">
										<span>编辑</span>
									</a>
									<a href="#" class="btn btn-danger">
										<img src="${pageContext.request.contextPath }/img/studentIMG/shanchu.png" style="width: 16px;">
										<span>删除</span>
									</a>
								</td>
							</tr>
						</c:if>
						<c:if test="${empty experiment }">
							<tr>
								<td colspan="6">
									没有数据
								</td>
							</tr>
							
						</c:if>
						
					</c:forEach>
				</table>
			</div>
		</div>
	</body>
</html>
