<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<title>注册</title>
		<link rel="stylesheet" type="text/css" href="../css/bootstrap.css"/>
		<link rel="stylesheet" type="text/css" href="../css/studentCSS/register.css"/>
		<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
		<script type="text/javascript" src="../js/bootstrap.js"></script>
		<script type="text/javascript" src="../js/studentJS/register.js"></script>
	</head>
	
	<body>
		<div class="reg">
			<div class="title">
				<span class="content"><strong>用&nbsp;&nbsp;户&nbsp;&nbsp;注&nbsp;&nbsp;册</strong></span>
			</div>
			<div class="input w">
				<form role="form" action="" method="post">
					<div class="k form-group">
						<label>学号</label>
						<input type="text" class="form-control" id="stuid" onblur="studentid(this.value)" name="stuid" placeholder="学号     注：必须是自己的学号">
						<span id="span1"></span>
					</div>
				    <div class="i form-group pull-left">
						<label >姓名</label>
						<input type="text" class="form-control" id="stuname" name="stuname" placeholder="姓名">
						<span id="span2"></span>
				    </div>
				    <div class="i j form-group pull-left">
						<label >密码</label>
						<input type="password" class="form-control" id="stupass" name="stupass"  placeholder="密码    默认密码为：123456789">
				    </div>
				    <div class="i form-group pull-left">
				    	<label >性别</label>
				    	<input type="text" class="form-control" id="stusex" name="stusex" placeholder="性别">
				    </div>
				    <div class="i j form-group pull-left">
				    	<label >班级代号</label>
				    	<input type="text" class="form-control" id="classid" name="classid"  placeholder="班级代号">
				    </div>
					
					<div class="i form-group pull-left">
						<label >联系电话</label>
						<input type="text" class="form-control" id="stuphone" name="stuphone" placeholder="联系电话">
					</div>
					<div class="i j form-group pull-left">
						<label >邮箱地址</label>
						<input type="text" class="form-control" id="stuemail" name="stuemail" placeholder="邮箱地址">
					</div>
					<div class="i form-group pull-left">
						<label >密保问题</label>
						<select class="select form-control" id="question" name="question">
							<option value="您父亲的名字是">您父亲的名字是？</option>
							<option value="您母亲的名字是">您母亲的名字是？</option>
							<option value="您母亲的生日是">您母亲的生日是？</option>
							<option value="您父亲的生日是">您父亲的生日是？</option>
							<option value="您高中班主任的名字是">您高中班主任的名字是？</option>
							<option value="您初中班主任的名字是">您初中班主任的名字是？</option>
							<option value="您小学班主任的名字是">您小学班主任的名字是</option>
							<option value="您最熟悉的童年好友名字是">您最熟悉的童年好友名字是？</option>
						</select>
					</div>
					
					<div class="i form-group pull-left" style="margin-left: 15%;">
						<label >密保答案</label>
						<input type="text" class="form-control" id="questionpass" name="questionpass" placeholder="密保答案">
					</div>
				    <input type="submit" onclick="sub()" class="btn btn-success pull-left" 
					style="margin-top: 2%;width: 40%;margin-left: 26%;"></input>
				</form>
			</div>
		</div>
	</body>
</html>
