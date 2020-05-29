package com.wangtong.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wangtong.entity.Student;
import com.wangtong.service.StudentService;
import com.wangtong.utils.ControllerUtils;


public class SearchPass2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentService studentService = new StudentService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ControllerUtils.setCharEncoding(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ControllerUtils.setCharEncoding(request, response);
		
		Student student =  (Student)request.getSession().getAttribute("student");
		String questionpass = request.getParameter("questionpass");
		if(questionpass!=null && !"".equals(questionpass)){
			if(questionpass.equals(student.getQuestionpass())){
				response.sendRedirect(request.getContextPath()+"/student/searchpass4.jsp");
			}else{
				response.sendRedirect(request.getContextPath()+"/student/searchpass3.jsp");
			}
		}else{
			response.sendRedirect(request.getContextPath()+"/student/searchpass3.jsp");
		}
		
	}

}
