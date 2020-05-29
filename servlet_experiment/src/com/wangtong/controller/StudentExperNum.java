package com.wangtong.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wangtong.entity.Student;
import com.wangtong.service.StudentExperimentService;
import com.wangtong.service.StudentTrainingService;
import com.wangtong.utils.ControllerUtils;

public class StudentExperNum extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentExperimentService experimentService = new StudentExperimentService();
	private StudentTrainingService trainingService = new StudentTrainingService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ControllerUtils.setCharEncoding(request, response);
		
		//判断用户是否已经登录
		if(ControllerUtils.LoginUser(request)){
			List<Object> lists = new ArrayList<>();
			Student student = (Student)request.getServletContext().getAttribute("user");
			if(student!=null){
				try {
					//查询没有完成的实验
					int queryById1 = experimentService.queryById1(student);
					//查询已经完成的实验
					int queryById2 = experimentService.queryById2(student);
					//查询没有完成的实训
					int queryById3 = trainingService.queryById1(student);
					//查询已经完成的实训
					int queryById4 = trainingService.queryById2(student);
					
					lists.add(queryById1);
					lists.add(queryById2);
					lists.add(queryById3);
					lists.add(queryById4);
					
					String json = ControllerUtils.setJson(lists);
					ControllerUtils.getPrintWriter(response, json);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}else{
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		}
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
