package com.wangtong.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wangtong.entity.Result;
import com.wangtong.entity.Student;
import com.wangtong.service.StudentService;
import com.wangtong.utils.ControllerUtils;


public class SearchPass1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentService studentService = new StudentService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ControllerUtils.setCharEncoding(request, response);
		String stuid = request.getParameter("stuid");
		
		if(stuid!=null  && !"".equals(stuid)){
			int id = ControllerUtils.StringToInt(stuid);
			try {
				if(studentService.queryById(id)){
					Result result = new Result(null, true, "此账号存在");
					String json = ControllerUtils.setJson(result);
					ControllerUtils.getPrintWriter(response, json);
				}else{
					Result result = new Result(null, false, "此账号不存在,请重新输入");
					String json = ControllerUtils.setJson(result);
					ControllerUtils.getPrintWriter(response, json);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}else{
			Result result = new Result(null, false, "输入框的内容不能为空");
			String json = ControllerUtils.setJson(result);
			ControllerUtils.getPrintWriter(response, json);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ControllerUtils.setCharEncoding(request, response);
		
		String stuid = request.getParameter("stuid");
		try {
			Student student = studentService.queryById2(ControllerUtils.StringToInt(stuid));
			request.getSession().setAttribute("student", student);
			request.getRequestDispatcher("student/searchpass2.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
