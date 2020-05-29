<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<base target="_parent" /> 
		<meta charset="utf-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="../css/bootstrap.css"/>
		<link rel="stylesheet" type="text/css" href="../css/studentCSS/stupassCSS.css"/>
		<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
		<script type="text/javascript" src="../js/bootstrap.js"></script>
	</head>
	
	<script type="text/javascript">
		
		function pass1(value){
			$.ajax({
				type:"GET",
				url:"${pageContext.request.contextPath }/updatePassword",
				data: {stuid:"${applicationScope.user.stuid}",password1:value},
				dataType:"json",
				success:function(result){
					if(result.success){
						$("#span1").html("");
					}else{
						$("#span1").html(result.message.fontcolor("#ff5b20"));
					}
				}
			});
		}
		
		function pass2(value){
			if(value==null || value==""){
				$("#span2").html("密码不能为空".fontcolor("#ff5b20"));
			}else{
				$("#span2").html("");
			}
		}
		
		function pass3(value){
			if(value==$("#password2").val()){
				$("#span3").html("");
			}else{
				$("#span3").html("两次输入的密码不一致，请重新输入".fontcolor("#ff5b20"));
			}
		}
		
		function sub(){
			var $password1 = $("#password1").val();
			var $password2 = $("#password2").val();
			var $password3 = $("#password3").val();
			
			if( ($password1==null||$password1=="") || ($password2 != $password3) ||  ($password2==null||$password2==""
			   || ($password1==null||$password1=="") ) ){
				$("form").attr("action","${pageContext.request.contextPath }/student/stupass.jsp");
				alert("你输入的信息有误，请重新填写");
			}else{	
				$("form").attr("action","${pageContext.request.contextPath }/updatePassword");
			}
		}
		
	</script>
	
	<body>
		<div class="w content">  <!-- border #DEDEDE -->
			
			<div class="header" >
				<span class="word"><strong>修改学生信息</strong></span>
				<a href="${pageContext.request.contextPath }/student/index.jsp"><img src="../img/studentIMG/zhuye.png" style="width: 13px;"></a>
				
				<a href="#"><img src="../img/studentIMG/shangyiye.png" style="width: 13px;"></a>
				<a href="#"><img src="../img/studentIMG/xiayiye.png" style="width: 13px;"></a>
				<a href="#"><img src="../img/studentIMG/shuaxin.png" style="width: 13px;"></a>
			</div>
			
			<form action="" method="post">
				<div class="tables">
					<table class="tab" border="1px" cellspacing="0" cellpadding="0">
						<tr>
							<td>
								旧密码：
								<input type="password" onblur="pass1(this.value)" id="password1" name="password1">&nbsp;<font size="4" color="">*</font>
								<span id="span1"></span>
							</td>
							
						</tr>	
						<tr>
							<td>
								新密码：
								<input type="password" id="password2" onblur="pass2(this.value)" name="password2">&nbsp;<font size="4" color="">*</font>
								<span id="span2"></span>
							</td>
							
						</tr>
						<tr>
							<td>
								新密码：
								<input type="password" id="password3" onblur="pass3(this.value)" name="password3">&nbsp;<font size="4" color="">*</font>
								<span id="span3"></span>
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<input type="submit" onclick="sub()" class="btn btn-primary" style="width: 5%;"/>
							</td>
						</tr>
					</table>
				</div>
			</form>
			
		</div>
		
		
	</body>
</html>
