package com.wangtong.service;

import com.wangtong.dao.ExperimentDao;
import com.wangtong.entity.Experiment;
import com.wangtong.entity.StudentExperiment;

public class ExperimentService {
	
	private ExperimentDao dao = new ExperimentDao();
	
	/*
	 * ͨ��ѧ��ʵ����е�ʵ��id��ѯʵ����е�ʵ����Ϣ
	 */
	public Experiment queryByExperId(StudentExperiment studentExperiment) throws Exception{
		return dao.queryByExperId(studentExperiment);
	}
}
