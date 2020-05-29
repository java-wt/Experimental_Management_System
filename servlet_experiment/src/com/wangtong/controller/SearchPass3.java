package com.wangtong.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wangtong.entity.Student;
import com.wangtong.service.StudentService;
import com.wangtong.utils.ControllerUtils;


public class SearchPass3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentService studentService = new StudentService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ControllerUtils.setCharEncoding(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ControllerUtils.setCharEncoding(request, response);
		String password1 = request.getParameter("password1");
		String password2 = request.getParameter("password2");
		
		Student student = (Student)request.getSession().getAttribute("student");
		if(password1.equals(password2)){
			try {
				if(studentService.updateById(student.getStuid(), password2)){
					request.getSession().invalidate();
					response.sendRedirect(request.getContextPath()+"/login.jsp");
				}else{
					response.sendRedirect(request.getContextPath()+"/student/searchpass4.jsp");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			response.sendRedirect(request.getContextPath()+"/student/searchpass4.jsp");
		}
		
	}

}
