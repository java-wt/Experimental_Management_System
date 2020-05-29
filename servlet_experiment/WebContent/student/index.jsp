<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/studentCSS/top1.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css"/>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.4.1.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstrap.js"></script>
	</head>
	
	<script type="text/javascript">
		
	 	function a1(){
			$(".navbar-inner").attr("style","background-color: black;");
			$(".navbar .brand").attr("style","color: #EEEEEE;");
		}
		
		function a2(){
			$(".navbar-inner").attr("style","background-color: #3f9fd9;");
			$(".navbar .brand").attr("style","color: #EEEEEE;");
		}
		
		function a3(){
			$(".navbar-inner").attr("style","background-color: mediumvioletred;");
			$(".navbar .brand").attr("style","color: #EEEEEE;");
		}
		
		function a4(){
			$(".navbar-inner").attr("style","background-color: ghostwhite;");
			$(".navbar .brand").attr("style","color: black;");
			
		} 
		
	</script>
	
<body>
	
	<!-- topbar开始 -->
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="brand" href="${pageContext.request.contextPath }/student/right.jsp" target="center"><img alt="xxx管理系统" src="${pageContext.request.contextPath }/img/studentIMG/brand.png" ><span>xxx管理系统</span></a>
				
				<div class="topbtn">
					<!-- 主题更换开始 -->
					<div class="btn-group pull-right">
						<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
							<img class="icon-zhuti" src="${pageContext.request.contextPath }/img/studentIMG/zhuti.png" alt="更换主题"> 点击更换主题 <span class="caret"></span>
						</button>
						<ul class="dropdown-menu" id="themes">
							<li><a data-value="classic" onclick="a1()">黑色</a></li>
							<li><a data-value="cerulean" onclick="a2()">天蓝</a></li>
							<li><a data-value="redy" onclick="a3()">红紫</a></li>
							<li><a data-value="spacelab" onclick="a4()">牛奶</a></li>
						</ul>
					
					</div>
					<!-- 主题更换结束 -->
					
					
					<!-- 用户按钮开始 -->
					<div class="btn-group pull-right" >
						<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
							<img class="icon-user" src="${pageContext.request.contextPath }/img/studentIMG/icon-user.png" alt="user"></img>
							<span class="hidden-phone">
								${applicationScope.user.stuname }
							</span>
							<span class="caret"></span>
						</a>
						<ul class="dropdown-menu">
							<li class="divider"></li>
							<li><a href="${pageContext.request.contextPath }/student/stuinfor.jsp" target="center">个人资料修改</a></li>
							<li class="divider"></li>
							<li><a href="${pageContext.request.contextPath }/student/stupass.jsp" target="center">个人密码修改</a></li>
							<li class="divider"></li>
							<li><a href="${pageContext.request.contextPath }/login.jsp">退出</a></li>
						</ul>
					</div>
					<!-- 用户按钮结束 -->
					
					<!-- 帮助按钮开始 -->
					<div class="btn-group pull-right">
						<a class="btn " data-toggle="modal" data-target="#myModal" style="border-top-right-radius: 5px;border-bottom-right-radius: 5px;">
						    <img class="icon-bangzhu" src="${pageContext.request.contextPath }/img/studentIMG/bangzhu.png"> 帮助
						</a>
				
						<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
							<div class="modal-dialog">
								<div class="modal-content">
								    <div class="modal-header">
										<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
										<h4 class="modal-title" id="myModalLabel">帮助</h4>
								    </div>
									<div class="modal-body">
										...
									</div>
								    <div class="modal-footer">
										<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
								    </div>
								</div><!-- /.modal-content -->
							</div><!-- /.modal-dialog -->
						</div><!-- /.modal -->
					</div>			
					<!-- 帮助按钮结束 -->
				</div>
				
			</div>
		</div>
	</div>
	<!-- topbar结束 -->
	
	<iframe class="pull-left" src="${pageContext.request.contextPath }/student/left.jsp" width="12%" height="600px" style="margin-left: 1%;" frameborder="no"></iframe>
	<iframe src="${pageContext.request.contextPath }/student/right.jsp" width="87%" height="600px" frameborder="no" name="center"></iframe>
	<iframe src="${pageContext.request.contextPath }/student/foot.jsp" width="100%" height="50px" frameborder="no"></iframe>
</body>
	
</html>
