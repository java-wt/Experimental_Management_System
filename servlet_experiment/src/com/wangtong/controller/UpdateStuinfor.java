package com.wangtong.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wangtong.entity.Student;
import com.wangtong.service.StudentService;
import com.wangtong.utils.ControllerUtils;

public class UpdateStuinfor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StudentService studentService = new StudentService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ControllerUtils.setCharEncoding(request, response);
		
		//获取前端传过来的属性
		String stuphone = request.getParameter("stuphone");
		String stuemail = request.getParameter("stuemail");
		String question = request.getParameter("question");
		String questionpass = request.getParameter("questionpass");
		
		if( (stuphone!=null&&!"".equals(stuphone)) &&  (stuemail!=null&&!"".equals(stuemail)) &&  (question!=null&&!"".equals(question)) &&  
				(questionpass!=null&&!"".equals(questionpass))  ){
			//获取用户id
			Student student = (Student)request.getServletContext().getAttribute("user");
			int stuid = student.getStuid();
			if(student!=null){
				try {
					if(studentService.updateById(stuid, stuphone, stuemail, question, questionpass)){
						response.sendRedirect(request.getContextPath()+"/login.jsp");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
