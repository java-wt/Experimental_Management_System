package com.wangtong.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wangtong.entity.Class;
import com.wangtong.entity.Student;
import com.wangtong.service.ClassService;
import com.wangtong.service.StudentService;
import com.wangtong.utils.ControllerUtils;

public class RegisterController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private ClassService classService = new ClassService();
	private StudentService studentService = new StudentService();
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ControllerUtils.setCharEncoding(request, response);
		
		String stuid = request.getParameter("stuid");
		String stuname = request.getParameter("stuname");
		String stupass = request.getParameter("stupass");
		String stusex = request.getParameter("stusex");
		String classid = request.getParameter("classid");
		String stuphone = request.getParameter("stuphone");
		String stuemail = request.getParameter("stuemail");
		String question = request.getParameter("question");
		String questionpass = request.getParameter("questionpass");
		try {
			if(!studentService.queryById(Integer.parseInt(stuid))){
				Class class1 = classService.getByid(Integer.parseInt(classid));
				if(class1 != null){
					Student student = new Student(Integer.parseInt(stuid), stuname, stupass, stusex, class1, stuphone, stuemail, question, questionpass);
					if(studentService.register(student)){
						
						response.sendRedirect(request.getContextPath()+"/login.jsp");
					}
				}
			}else{
				request.setAttribute("message", "此学号已经被注册！！！");
				request.getRequestDispatcher("/student/register.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
