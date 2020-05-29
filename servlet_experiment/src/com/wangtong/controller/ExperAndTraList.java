package com.wangtong.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wangtong.entity.Experiment;
import com.wangtong.entity.Student;
import com.wangtong.entity.StudentExperiment;
import com.wangtong.entity.StudentTraining;
import com.wangtong.entity.Training;
import com.wangtong.service.ExperimentService;
import com.wangtong.service.StudentExperimentService;
import com.wangtong.service.StudentTrainingService;
import com.wangtong.service.TrainingService;
import com.wangtong.utils.ControllerUtils;

public class ExperAndTraList extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private StudentExperimentService experimentService = new StudentExperimentService();
	private StudentTrainingService trainingService = new StudentTrainingService();
	private ExperimentService service1 = new ExperimentService();
	private TrainingService service2 = new TrainingService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ControllerUtils.setCharEncoding(request, response);
		Student student = (Student)request.getServletContext().getAttribute("user");
		
		String flag = request.getParameter("flag");
		if("unfinexp".equals(flag)){
			try {
				List<StudentExperiment> studentExperiments = experimentService.queryById1ToList(student);
				List<Experiment> list = new ArrayList<Experiment>();
				if(studentExperiments!=null){
					for (StudentExperiment studentExperiment : studentExperiments) {
						Experiment experiment = service1.queryByExperId(studentExperiment);
						list.add(experiment);
					}
					
					request.setAttribute("list", list);
					request.getRequestDispatcher("student/unfinexp.jsp").forward(request, response);
				}else{
					response.sendRedirect(request.getContextPath()+"/student/unfinexp.jsp");
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}else if("finexp".equals(flag)){
			try {
				List<StudentExperiment> studentExperiments = experimentService.queryById2ToList(student);
				List<Experiment> list = new ArrayList<Experiment>();
				if(studentExperiments!=null){
					for (StudentExperiment studentExperiment : studentExperiments) {
						Experiment experiment = service1.queryByExperId(studentExperiment);
						list.add(experiment);
					}
					
					request.setAttribute("list", list);
					request.getRequestDispatcher("/student/finexp.jsp").forward(request, response);
				}else{
					response.sendRedirect(request.getContextPath()+"/student/finexp.jsp");
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}else if("unfintra".equals(flag)){
			
			try {
				List<StudentTraining> studentTrainings = trainingService.queryById1ToList(student);
				List<Training> list = new ArrayList<>();
				if(studentTrainings!=null){
					for (StudentTraining studentTraining : studentTrainings) {
						Training training = service2.queryByTraId(studentTraining);
						list.add(training);
					}
					request.setAttribute("list", list);
					request.getRequestDispatcher("/student/unfintra.jsp").forward(request, response);
				}else{
					response.sendRedirect(request.getContextPath()+"/student/unfintra.jsp");
				}
				
				
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if("fintra".equals(flag)){
		
			try {
				List<StudentTraining> studentTrainings = trainingService.queryById2ToList(student);
				List<Training> list = new ArrayList<>();
				if(studentTrainings!=null){
					for (StudentTraining studentTraining : studentTrainings) {
						Training training = service2.queryByTraId(studentTraining);
						list.add(training);
					}
					request.setAttribute("list", list);
					request.getRequestDispatcher("/student/fintra.jsp").forward(request, response);
				}else{
					response.sendRedirect(request.getContextPath()+"/student/fintra.jsp");
				}
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		}else if("expscore".equals(flag)){
			try {
				List<StudentExperiment> scores = experimentService.queryById3ToList(student);
				request.setAttribute("scores", scores);
				request.getRequestDispatcher("/student/expscore.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}else if("trascore".equals(flag)){
			
		}else{
			response.sendRedirect(request.getContextPath()+"/student/index.jsp");
		}
		
	}

}
