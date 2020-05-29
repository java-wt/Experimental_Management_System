package com.wangtong.service;

import com.wangtong.dao.TrainingDao;
import com.wangtong.entity.StudentTraining;
import com.wangtong.entity.Training;

public class TrainingService {
	
	private TrainingDao dao = new TrainingDao();
	
	/*
	 * 通过学生实训表中的实验id查询实训表中的实验信息
	 */
	public Training queryByTraId(StudentTraining studentTraining) throws Exception{
		return dao.queryByTraId(studentTraining);
	}
}
