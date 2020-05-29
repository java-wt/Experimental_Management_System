/* 验证学生id */
function studentid(v){
	var patt = /^\d{10}$/;
	if(patt.test(v)){
		$("#span1").html("");
	}else{
		$("#span1").html("填写的必须是自己的学号".fontcolor("#ff5b20"));
	}
}
/* 验证注册信息是否全部填写 */
function sub(){
	var stuid =  $("#stuid").val();
	var stuname =  $("#stuname").val();
	var stusex =  $("#stusex").val();
	var classid =  $("#classid").val();
	var stuphone =  $("#stuphone").val();
	var stuemail =  $("#stuemail").val();
	var questionpass =  $("#questionpass").val();
	
	if(stuid==null || stuid==""){
		alert("学号不能为空");
		$("form").attr("action","register.jsp");
	}else if(stuname==null || stuname==""){
		alert("姓名不能为空");
		$("form").attr("action","register.jsp");
	}else if(stusex==null || stusex==""){
		alert("性别不能为空");
		$("form").attr("action","register.jsp");
	}else if(classid==null || classid==""){
		alert("班级不能为空");
		$("form").attr("action","register.jsp");
	}else if(stuphone==null || stuphone==""){
		alert("电话号码不能为空");
		$("form").attr("action","register.jsp");
	}else if(stuemail==null || stuemail==""){
		alert("邮箱不能为空");
		$("form").attr("action","register.jsp");
	}else if(questionpass==null || questionpass==""){
		alert("密保问题不能为空");
		$("form").attr("action","register.jsp");
	}else{
		$("form").attr("action","/servlet_experiment/register");
	}
}