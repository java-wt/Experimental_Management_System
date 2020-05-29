<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<title>右侧展示部分</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.css"/>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.4.1.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstrap.js"></script>
	</head>
	
		<style type="text/css">
		#content{
			margin-top: 20px;
		}
		.marquee ul marquee{
			border: 1px solid #DCDCDC;
			border-radius: 3px ;
			background-color: #fbfbfb;
		}
		.marquee ul marquee span h4{
			font-size: 14px;
			margin: 7px 0px 7px 0px;
		}
		.book{
			background: url(${pageContext.request.contextPath }/img/studentIMG/bookBG.png) repeat-x;
			display: block;
			float: left;
			width: 220px;
			height: 65px;
			text-decoration: none;
			border: 1px solid #EBEBEB;
			border-radius: 5px;
			/* margin-left: 100px; */
			text-shadow: 1px 1px 5px rgba(0, 0, 0, 0.3);
		}
		.bookimg{
			margin-left: 43%;
			margin-top: 8px;
		}
		.span3 div strong:hover{
			color: #999999;
		}
		
		.box{
			margin-top: 100px;
			background-color: #EEEEEE;
			margin-left: 2.7%;
			border: 1px solid #DCDCDC;
			border-radius: 4px;
		}
		
		.books a{
			text-decoration: none;
		}
		
		.unFinishExper,.unFinishTrain,.FinishExper, .FinishTrain{
			text-align: center;
			display: block;
			color: white;
			width: 10%;
			height: 33%;
			border-radius: 10px;
			/* 设置相对定位 */
			position: relative;
			left: 95%;
			bottom: 95%;
		}
		.unFinishExper{
			border: 1px solid #2FABE9;
			background-color: #67C2EF;
		}
		.unFinishTrain{
			border: 1px solid #F4A506;
			background-color: #FABB3D;
		}
		
		.FinishExper{
			border: 1px solid #5AAD34;
			background-color: #78CD51;
		}
		.FinishTrain{
			border: 1px solid #FA5833;
			background-color: #FA603D;
		}
	</style>
	
	<script type="text/javascript">
		$(function(){
			$.ajax({
				type:"GET",
				url:"${pageContext.request.contextPath }/studentExperNum",
				dataType:"json",
				success:function(result){
					$(".unFinishExper").html(result[0]);
					$(".FinishExper").html(result[1]);
					$(".unFinishTrain").html(result[2]);
					$(".FinishTrain").html(result[3]);
				}
			});
		})
	</script>
	
	<body style="width: 95%;margin: auto;">
		<div id="content">
			<div class="marquee">
				<ul>
					<marquee scrollamount="3">
      					<span class="center black"><h4>南阳理工学院软件学院</h4></span>
    				</marquee>
				</ul>
			</div>
			
			<div class="books">
				<a title="未完成实验报告" class="book" href="${pageContext.request.contextPath }/experAndTraList?flag=unfinexp" target="center" style="margin-left: 3%;">
					<img class="bookimg" src="${pageContext.request.contextPath }/img/studentIMG/book-empty.png" >
					<div style="color:black;text-align: center;"><strong>未完成实训报告</strong></div>
					<div></div>
					<span class="unFinishExper"></span>
				</a>

				<a data-rel="tooltip" title="已完成实验报告" class="book" href="${pageContext.request.contextPath }/experAndTraList?flag=finexp" target="center" style="margin-left: 8.5%;">
					<img class="bookimg" src="${pageContext.request.contextPath }/img/studentIMG/book.png" >
					<div style="color:black;text-align: center;"><strong>已完成实验报告</strong></div>
					<div></div>
					<span class="FinishExper"></span>
				</a>

				<a data-rel="tooltip" title="未完成实训报告" class="book" href="${pageContext.request.contextPath }/experAndTraList?flag=unfintra" target="center" style="margin-left: 8.5%;">
					<img class="bookimg" src="${pageContext.request.contextPath }/img/studentIMG/book-empty.png" >
					<div style="color:black;text-align: center;"><strong>未完成实训报告</strong></div>
					<span class="unFinishTrain"></span>
					<div></div>
				</a>
				
				<a title="已完成实训报告" class="book" href="${pageContext.request.contextPath }/experAndTraList?flag=fintra" target="center" style="margin-left: 8.5%;">
					<img class="bookimg" src="${pageContext.request.contextPath }/img/studentIMG/book.png" >
					<div style="color:black;text-align: center;"><strong>已完成实训报告</strong></div>
					<div></div>
					<span class="FinishTrain"></span>
				</a>
			</div>
			
			<div class="box" style="">
				<div class="boxHeader">
					<span class="glyphicon glyphicon-flash" style="padding-top: 10px; padding-bottom: 15px;text-shadow: 1px 1px 5px rgba(0, 0, 0, 0.3);">
						<strong>欢迎登陆</strong>
					</span>
				</div>
				<div class="boxContent" style="background-color: white;">
					<img style="width: 95%;margin: 15px 2.7% 20px;" src="${pageContext.request.contextPath }/img/studentIMG/bookContentBG.jpg" >
				</div>
			</div> 
		</div>
		
		
		
	</body>
</html>
