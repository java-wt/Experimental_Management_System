package com.wangtong.controller;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.wangtong.entity.Class;
import com.wangtong.entity.Student;
import com.wangtong.service.ClassService;
import com.wangtong.service.StudentService;
import com.wangtong.utils.ControllerUtils;

public class LoginController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	private StudentService studentService = new StudentService();
	private ClassService classService = new ClassService();
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ControllerUtils.setCharEncoding(request, response);
		String userid = request.getParameter("userid");
		String userpass = request.getParameter("userpass");
		String character = request.getParameter("character");
		String rememberpass = request.getParameter("rememberpass");
		
		//创建servlerContext对象存放登录对象
		ServletContext servletContext = request.getServletContext();
		
		//拼接字符串，将登录信息存入Cookie
		StringBuffer buffer = new StringBuffer();
		buffer.append(userid).append("@").append(userpass).append("@").append(character);
		if(rememberpass!=null && "1".equals(rememberpass)){
			if("学生".equals(character)){
				try {
					Student student = studentService.login(Integer.parseInt(userid), userpass);
					if(student!=null){
						Class class1 = classService.getByid(student.getClazz().getClassid());
						if(class1!=null){
							//这个cookie是存放用户登录信息
							ControllerUtils.setCookie("cookieUser", buffer.toString(),response);
							//这个cookie是判断用户是否登录的标志,在网页关闭之后就会销毁
							ControllerUtils.setCookie("LOGIN_USER", buffer.toString(), response);
							student.getClazz().setClassname(class1.getClassname());
							servletContext.setAttribute("user", student);
							request.getRequestDispatcher("/student/index.jsp").forward(request, response);
						}
					}else{
						response.sendRedirect(request.getContextPath()+"/login.jsp");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
						
			}else if("教师".equals(character)){
				
			}else if("管理员".equals(character)){
				
			}else{
				response.sendRedirect(request.getContextPath()+"/login.jsp");
			}
		}else{
			if("学生".equals(character)){
				try {
					Student student = studentService.login(Integer.parseInt(userid), userpass);
					if(student!=null){
						Class class1 = classService.getByid(student.getClazz().getClassid());
						if(class1!=null){
							student.getClazz().setClassname(class1.getClassname());
							servletContext.setAttribute("user", student);
							request.getRequestDispatcher("/student/index.jsp").forward(request, response);
						}
					}else{
						response.sendRedirect(request.getContextPath()+"/login.jsp");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
						
			}else if("教师".equals(character)){
				
			}else if("管理员".equals(character)){
				
			}else{
				response.sendRedirect(request.getContextPath()+"/login.jsp");
			}
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ControllerUtils.setCharEncoding(request, response);
		
		Cookie[] cookies = request.getCookies();
		if(cookies!=null){
			for (Cookie cookie : cookies) {
				if("cookieUser".equals(cookie.getName())){
					String value = cookie.getValue();
					String[] strings = value.split("@");
					String json = ControllerUtils.setJson(strings);
					ControllerUtils.getPrintWriter(response, json);
				}
			}
		}
		
	}
	
	
	
}
