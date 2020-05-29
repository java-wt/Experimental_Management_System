package com.wangtong.service;

import com.wangtong.dao.ExperimentDao;
import com.wangtong.entity.Experiment;
import com.wangtong.entity.StudentExperiment;

public class ExperimentService {
	
	private ExperimentDao dao = new ExperimentDao();
	
	/*
	 * 通过学生实验表中的实验id查询实验表中的实验信息
	 */
	public Experiment queryByExperId(StudentExperiment studentExperiment) throws Exception{
		return dao.queryByExperId(studentExperiment);
	}
}
