<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<base target="_parent" /> 
		<meta charset="utf-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="../css/bootstrap.css"/>
		<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
		<script type="text/javascript" src="../js/bootstrap.js"></script>
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
			background: url(../img/studentIMG/tableheaderBG.jpg) repeat-x;
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
				<span class="word"><strong>已批阅实训报告</strong></span>
				<a href="${pageContext.request.contextPath }/student/index.jsp"><img src="../img/studentIMG/zhuye.png" style="width: 13px;"></a>
				
				<a href="#"><img src="../img/studentIMG/shangyiye.png" style="width: 13px;"></a>
				<a href="#"><img src="../img/studentIMG/xiayiye.png" style="width: 13px;"></a>
				<a href="#"><img src="../img/studentIMG/shuaxin.png" style="width: 13px;"></a>
			</div>
			
			<div class="tables">
				<table class="tab" border="1px" cellspacing="0" cellpadding="0">
					<tr>
						<th>课程名称</th>
						<th>实训名称</th>
						<th>教师名称</th>
						<th>实训成绩</th>
					</tr>
					<tr>
						<td>Docker应用容器引擎实践</td>
						<td>DockerCE的安装</td>
						<td>单平平</td>
						<td style="color: #F4A506;">90</td>
					</tr>
				</table>
			</div>
		</div>
	</body>
</html>
