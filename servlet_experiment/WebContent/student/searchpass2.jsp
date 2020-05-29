<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css"/>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.4.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstrap.js"></script>
</head>

	<style type="text/css">
		.w{
			width: 40%;
			margin: 0 auto;
			margin-top: 5%;
		}
		
		.title{
			background-color: #ff5b20;
			height: 50px;
			border-bottom-left-radius: 10px;
			border-bottom-right-radius: 10px;
		}
		
		.content{
			color: white;
			font-family: "微软雅黑";
			font-size: 25px;
			padding-top: 0.5%;
			display: block;
			text-align: center;
		}
		
		.div2{
			margin-top: 2%;
			border: #E0E0E0 solid 1px;
			width: 35%;
			position: absolute;
			height: 15%;
			align-items: center;
		}
		.div2:hover{
			background-color: #FBFBFB;
			border: #B9DEF0 solid 1px;
		}
		#span1{
			font-size: 18px;
		}
		
		#span2{
			font-size: 17px;
			font-family: "新宋体";
		}
		.div3{
			margin-top: 2%;
			margin-left: 2%;
		}
		.div4{
			margin-top: 3%;
		}
		.div5{
			margin-top: -1%;
			margin-left: 60%;
		}
		
		
		.clearFix:after,
		.clearFix:before{
		
		content: "";
		
		display: block;
		
		clear: both;
		}
		
	</style>
	<script type="text/javascript">
		
		
	</script>
<body>
	<div class="searchpass">
		<div class="title">
			<span class="content"><strong>找&nbsp;&nbsp;回&nbsp;&nbsp;密&nbsp;&nbsp;码</strong></span>
		</div>
		<div class="w">
				
			<div class="div1">
				<span id="span1">
					你正在为账户${sessionScope.student.stuid }重置密码，请选择重置方式：
				</span>
			</div>
			<div class="div2 clearFix">
				<div class="div3 pull-left">
					<img src="${pageContext.request.contextPath }/img/studentIMG/question.png" style="width: 80px;">
				</div>
				<div class="div4 pull-left">
					<span id="span2">
						通过密保问题进行验证<br />
					</span>
				</div>
				<div class="div5 pull-left">
					<a href="${pageContext.request.contextPath }/student/searchpass3.jsp" class="btn btn-warning">立即重置</a>
				</div>
			</div>
				
		</div>
		
	</div>
</body>
</html>