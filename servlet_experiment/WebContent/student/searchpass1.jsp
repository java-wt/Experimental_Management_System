<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css"/>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/studentCSS/searchpassCSS.css"/>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.4.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstrap.js"></script>
</head>

	<script type="text/javascript">
		
	function fun(value){
		
		$.ajax({
			type:"GET",
			url:"${pageContext.request.contextPath }/searchPass1",
			data: {stuid:value},
			dataType:"json",
			success:function(result){
				if(result.success){
					$("#span2").html("");
					$("form").attr("action","${pageContext.request.contextPath }/searchPass1");
				}else{
					$("#span2").html(result.message.fontcolor("#ff5b20"));
					$("form").attr("action","${pageContext.request.contextPath }/student/searchpass1.jsp");
				}
			}
		});
	}
		
	
	
	
	</script>
<body>
	<div class="searchpass">
		<div class="title">
			<span class="content"><strong>找&nbsp;&nbsp;回&nbsp;&nbsp;密&nbsp;&nbsp;码</strong></span>
		</div>
		<div class="w">
			<form action="" method="post">
				
				<div class="div1">
					<span class="span1">账号：</span>
					<input type="text" class="input1" onblur="fun(this.value)" name="stuid" placeholder="Your ID"/><br>
					
					<div class="div3">
						<span id="span2"></span>
					</div>
					
				</div>
				
				<div class="div2">
					<input type="submit" onclick="sub()" class="btn btn-success col-lg-4"/>
				</div>
				
				
			</form>
		</div>
		
	</div>
</body>
</html>