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
		
		.content, .tab{
			border: 1px solid #DEDEDE;
		}
		.content{
			margin-top: 2%;
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
		.tab td{
			padding-top: 0.5%;
			padding-bottom: 0.5%;
		}
		.tab input, .tab select{
			text-indent: 5px;
			width: 35%;
			height: 30px;
			border: 1px solid #cccccc;
			border-radius: 3px;
		}
		
	</style>
	<script type="text/javascript">
		$(function(){
			var $value = "${applicationScope.user.question}";
			$("select option").each(
				function(){
					if($(this).val()==$value){
						$(this).attr("selected","selected");
					}
				}
			);
		})
	</script>
	<body>
		<div class="w content">
			
			<div class="header" >
				<span class="word"><strong>修改学生信息</strong></span>
				<a href="${pageContext.request.contextPath }/student/index.jsp"><img src="../img/studentIMG/zhuye.png" style="width: 13px;"></a>
				
				<a href="#"><img src="../img/studentIMG/shangyiye.png" style="width: 13px;"></a>
				<a href="#"><img src="../img/studentIMG/xiayiye.png" style="width: 13px;"></a>
				<a href="#"><img src="../img/studentIMG/shuaxin.png" style="width: 13px;"></a>
			</div>
			
			<form action="${pageContext.request.contextPath }/updateStuinfor" method="post">
				<div class="tables">
					<table class="tab" border="1px" cellspacing="0" cellpadding="0">
						<tr>
							<td><span>学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号：&nbsp;${applicationScope.user.stuid }</span>&nbsp;<font size="4" color="">*</font></td>
							<td><span>姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：&nbsp;${applicationScope.user.stuname }</span>&nbsp;<font size="4" color="">*</font></td>
						</tr>
						<tr>
							<td>
								班级代号：
								<input type="text" value="${applicationScope.user.clazz.classid }" readonly="readonly">&nbsp;<font size="4" color="">*</font>
							</td>
							<td>班级名称：
								<input type="text"  value="${applicationScope.user.clazz.classname}" readonly="readonly">&nbsp;<font size="4" color="">*</font>
							</td>
						</tr>	
						<tr>
							<td>
								联系电话：
								<input type="text" name="stuphone" value="${applicationScope.user.stuphone }">&nbsp;<font size="4" color="">*</font>
							</td>
							<td>邮箱地址：
								<input type="text" name="stuemail" value="${applicationScope.user.stuemail }">&nbsp;<font size="4" color="">*</font>
							</td>
						</tr>
						<tr>
							<td>
								密保问题：
								<select class="select" name="question">
									<option id="option1" value="您父亲的名字是">您父亲的名字是？</option>
									<option id="option2" value="您母亲的名字是">您母亲的名字是？</option>
									<option id="option3" value="您母亲的生日是">您母亲的生日是？</option>
									<option id="option4" value="您父亲的生日是">您父亲的生日是？</option>
									<option id="option5" value="您高中班主任的名字是">您高中班主任的名字是？</option>
									<option id="option6" value="您初中班主任的名字是">您初中班主任的名字是？</option>
									<option id="option7" value="您小学班主任的名字是">您小学班主任的名字是</option>
									<option id="option8" value="您最熟悉的童年好友名字是">您最熟悉的童年好友名字是？</option>
								</select>&nbsp;<font size="4" color="">*</font>
							</td>
							<td>密保答案：
								<input type="text" name="questionpass" value="${applicationScope.user.questionpass }">&nbsp;<font size="4" color="">*</font>
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<input type="submit" class="btn btn-primary" style="width: 5%;"/>
							</td>
						</tr>
					</table>
				</div>
			</form>
			
		</div>
		
		
	</body>
</html>
