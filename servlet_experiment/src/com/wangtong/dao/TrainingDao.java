package com.wangtong.dao;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import com.wangtong.entity.Experiment;
import com.wangtong.entity.StudentExperiment;
import com.wangtong.entity.StudentTraining;
import com.wangtong.entity.Training;
import com.wangtong.utils.DBUtils;

public class TrainingDao {
	
	/*
	 * 通过学生实训表中的实验id查询实训表中的实验信息
	 */
	
	public Training queryByTraId(StudentTraining studentTraining) throws Exception{
		ResultSet resultSet = DBUtils.executeQuery("SELECT t1.*,t2.teacher_name FROM training t1, teacher t2 WHERE t1.training_id=? AND t1.training_status=1 AND t1.teacher_id=t2.teacher_id", new Object[]{studentTraining.getTrainingId()});
		while(resultSet.next()){
			Training training = new Training();
			training.setTrainingId(resultSet.getInt(1));
			training.setTeacherId(resultSet.getInt(2));
			training.setCourseName(resultSet.getString(3));
			training.setTrainingName(resultSet.getString(4));
			training.setTrainingWeek(resultSet.getString(5));
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String date = dateFormat.format(resultSet.getTimestamp(6));
			training.setTrainingFinishtime(date);
			
			training.setTrainingGoal(resultSet.getString(7));
			training.setTrainingContent(resultSet.getString(8));
			training.setTeacherName(resultSet.getString("t2.teacher_name"));
			
			return training;
		}
		
		return null;
	}

}
