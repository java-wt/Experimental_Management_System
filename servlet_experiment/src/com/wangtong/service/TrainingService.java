package com.wangtong.service;

import com.wangtong.dao.TrainingDao;
import com.wangtong.entity.StudentTraining;
import com.wangtong.entity.Training;

public class TrainingService {
	
	private TrainingDao dao = new TrainingDao();
	
	/*
	 * ͨ��ѧ��ʵѵ���е�ʵ��id��ѯʵѵ���е�ʵ����Ϣ
	 */
	public Training queryByTraId(StudentTraining studentTraining) throws Exception{
		return dao.queryByTraId(studentTraining);
	}
}
