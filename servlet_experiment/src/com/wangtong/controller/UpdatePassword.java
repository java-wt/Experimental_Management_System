package com.wangtong.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.wangtong.entity.Result;
import com.wangtong.entity.Student;
import com.wangtong.service.StudentService;
import com.wangtong.utils.ControllerUtils;

public class UpdatePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private StudentService studentService = new StudentService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ControllerUtils.setCharEncoding(request, response);
		String stuid = request.getParameter("stuid");
		String password1 = request.getParameter("password1");
		try {
			if((stuid!=null&&!"".equals(stuid)) && (password1!=null&&!"".equals(password1))){
				if(studentService.queryById(Integer.parseInt(stuid), password1)){
					Result result = new Result(null, true, "密码输入正确");
					String json = ControllerUtils.setJson(result);
					ControllerUtils.getPrintWriter(response, json);
				}else{
					Result result = new Result(null, false, "密码输入不正确");
					String json = ControllerUtils.setJson(result);
					ControllerUtils.getPrintWriter(response, json);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ControllerUtils.setCharEncoding(request, response);
		Student student = (Student)request.getServletContext().getAttribute("user");
		int stuid = student.getStuid();
		String password1 = request.getParameter("password1");
		String password3 = request.getParameter("password3");
		
		if(student!=null && password1!=null  && password3!=null){
			try {
				if(studentService.queryById(stuid, password1)){
					if(studentService.updateById(stuid, password3)){
						//request.getRequestDispatcher("login.jsp").forward(request, response);;
						response.sendRedirect("http://localhost:8080/servlet_experiment/login.jsp");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
