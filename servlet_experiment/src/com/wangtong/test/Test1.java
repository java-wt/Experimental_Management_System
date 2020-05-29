package com.wangtong.test;

import static org.junit.Assert.*;

import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

import com.wangtong.dao.ExperimentDao;
import com.wangtong.dao.StudentExperimentDao;
import com.wangtong.dao.TrainingDao;
import com.wangtong.entity.Experiment;
import com.wangtong.entity.StudentExperiment;
import com.wangtong.entity.StudentTraining;
import com.wangtong.entity.Training;
import com.wangtong.utils.ControllerUtils;

public class Test1 {

	private TrainingDao dao = new TrainingDao();
	@Test
	public void test() {
		StudentTraining studentTraining = new StudentTraining();
		studentTraining.setTrainingId(1);
		try {
			 Training training = dao.queryByTraId(studentTraining);
			System.out.println(training);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2() {
		ExperimentDao dao = new ExperimentDao();
		StudentExperiment studentExperiment = new StudentExperiment();
		studentExperiment.setExperimentId(1);
		try {
			Experiment Experiment = dao.queryByExperId(studentExperiment);
			System.out.println(Experiment);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test3(){
		int i = 1;
		i = i++;
		System.out.println("i1=" + i);
		int j = i++;
		System.out.println("i2=" + i);
		int k = i + ++i * i++;
		System.out.println("i3=" + i);
		System.out.println("j=" + j);
		System.out.println("k=" + k);

	}

}
