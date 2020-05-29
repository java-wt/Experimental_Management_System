<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>找回密码</title>
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
		
		.span1{
			font-size: 17px;
		}
		
		.input1,.input2{
			position: absolute;
			width: 20%;
			height: 4.5%;
			text-indent: 1em;
			border: 1px solid #E0E0E0;
			border-radius: 3px;
		}
		
		.div1{
			margin-left: 35%;
		}
		.div2{
			margin-top: 20%;
		}
		.div3{
			margin-top: 10%;
		}
		
		.div4{
			margin-top: 10%;
			margin-left: 14%;
		}
		
		#span3,#span2{
			display: block;
			margin-top: 2%;
			margin-left: 15%;
		}
		
	</style>
	<script type="text/javascript">
		function pass1(value){
			if(value==null || value==""){
				$("#span2").html("密码不能为空".fontcolor("#ff5b20"));
			}else{
				$("#span2").html("");
			}
		}
		
		function pass2(value){
			if(value==null || value==""){
				$("#span3").html("密码不能为空".fontcolor("#ff5b20"));
			}else if(value!=$(".input1").val()){
				$("#span3").html("两次输入的密码不一致，请重新输入".fontcolor("#ff5b20"));
			}else{
				$("#span3").html("");
			}
		}
		
	</script>
<body>
	<div class="searchpass">
		<div class="title">
			<span class="content"><strong>找&nbsp;&nbsp;回&nbsp;&nbsp;密&nbsp;&nbsp;码</strong></span>
		</div>
		<div class="w div1">
			<form action="${pageContext.request.contextPath }/searchPass3" method="post">
				<div class="div2">
					<span class="span1">
						新&nbsp;&nbsp;密&nbsp;&nbsp;码：
					</span>
					<input type="password" class="input1" onblur="pass1(this.value)" name="password1"/><br />
					<span id="span2"></span>
				</div>
				
				<div class="div3">
					<span class="span1">
						确认密码：
					</span>
					<input type="password" class="input2" onblur="pass2(this.value)" name="password2"/><br />
					<span id="span3"></span>
				</div>
				
				<div class="div4">
					<input type="submit" class="btn btn-success col-lg-3""/>
				</div>
			</form>	
			
				
		</div>
		
	</div>
</body>
</html>