<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="css/login_page.css"/>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
		<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.js"></script>
		<style type="text/css">
			
			@font-face {
			  font-family: 'webfont';
			  font-display: swap;
			  src: url('//at.alicdn.com/t/webfont_hucodr8y6fj.eot'); /* IE9*/
			  src: url('//at.alicdn.com/t/webfont_hucodr8y6fj.eot?#iefix') format('embedded-opentype'), /* IE6-IE8 */
			  url('//at.alicdn.com/t/webfont_hucodr8y6fj.woff2') format('woff2'),
			  url('//at.alicdn.com/t/webfont_hucodr8y6fj.woff') format('woff'), /* chrome、firefox */
			  url('//at.alicdn.com/t/webfont_hucodr8y6fj.ttf') format('truetype'), /* chrome、firefox、opera、Safari, Android, iOS 4.2+*/
			  url('//at.alicdn.com/t/webfont_hucodr8y6fj.svg#AlibabaPuHuiTiH') format('svg'); /* iOS 4.1- */
			}
			
			.webfont{
				font-family: "webfont" !important;
				font-size: 39px;
				font-style: normal;
				-webkit-font-smoothing: antialiased;
				-webkit-text-stroke-width: 0.2px;
			}
		</style>
		
		<script type="text/javascript">
			$(function(){
				$.ajax({
					type:"GET",
					url:"login",
					dataType:"json",
					success:function(result){
						if(result!=null && result!=""){
							$("#userid").attr("value",result[0]);
							$("#userpass").attr("value",result[1]);
							
							if(result[2]=="学生"){
								$("#option1").attr("selected","selected"); 
							}else if(result[2]=="教师"){
								$("#option2").attr("selected","selected");
							}else{
								$("#option3").attr("selected","selected");
							}
						}
					}
				});
				
				/* 禁止页面的回退 */
				history.pushState(null, null, document.URL);
			    window.addEventListener('popstate', function () {
			        history.pushState(null, null, document.URL);
			    });
			})
			
		</script>
	</head>
	<body style="background: url(img/背景.jpg) no-repeat;">
		<div class="container-fluid w">
			<div class="title">
				<p class="webfont">xx学院实践教学管理系统</p>
			</div>
			<div class="loginInput">
				<form class="form-horizontal" action="login" method="post">
				  <div class="form-group" style="width: 500px;">
					<label for="userid" class="col-sm-2 control-label">账号：</label>
					<div class="col-sm-6">
					  <input type="text" class="form-control" name="userid" id="userid" placeholder="Your ID">
					</div>
				  </div>
				  
				  <div class="form-group" style="width: 500px;">
					<label for="userpass" class="col-sm-2 control-label">密码：</label>
					<div class="col-sm-6">
					  <input type="password" class="form-control" name="userpass" id="userpass" placeholder="Your Password">
					</div>
				  </div>
				  
				  <div class="form-group" style="width: 500px;">
					<label for="select" class="col-sm-2 control-label">身份：</label>
					<div class="col-sm-6">
					  <select name="character" id="select" style="width: 220px;height: 30px;border-radius: 5px;">
					  	 <option id="option1" value="学生">学生</option>
						 <option id="option2" value="教师">教师</option>
						 <option id="option3" value="管理员">管理员</option>
					  </select>
					</div>
				  </div>
				  
				  <div class="form-group" style="width: 400px;">
					<div class="col-sm-offset-2 col-sm-10" style="margin-left: 50px;">
					  <div class="checkbox">
						<label>
						  <input type="checkbox" name="rememberpass" value="1">记住密码
						</label>
						<label>
						  <a href="${pageContext.request.contextPath }/student/searchpass1.jsp" style="text-decoration: none;">密码忘记？请申请找回</a>
						</label>
					  </div>
					</div>
				  </div>
				  
				  <div class="form-group" style="width: 400px;">
						<div class="col-sm-offset-2 col-sm-5" style="margin-left: 10px;">
							<a class="btn btn-success btn-lg btn-block" href="student/register.jsp">
								注册
							</a>
						</div>
						<div class="col-sm-offset-2 col-sm-5" style="margin-left: 10px;">
							<input class="btn btn-primary btn-lg btn-block" type="submit" value="登录">
						</div>
				  </div>
				  
				</form>
			</div>
		</div>
	</body>
</html>
