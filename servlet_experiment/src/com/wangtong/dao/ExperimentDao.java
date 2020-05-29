package com.wangtong.dao;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import com.wangtong.entity.Experiment;
import com.wangtong.entity.StudentExperiment;
import com.wangtong.utils.DBUtils;

public class ExperimentDao {
	
	/*
	 * 通过学生实验表中的实验id查询实验表中的实验信息
	 */
	public Experiment queryByExperId(StudentExperiment studentExperiment) throws Exception{
		ResultSet resultSet = DBUtils.executeQuery("SELECT e.*,t.teacher_name FROM experiment e, teacher t WHERE e.experiment_id=? AND e.experiment_status=1 AND e.teacher_id=t.teacher_id", new Object[]{studentExperiment.getExperimentId()});
		while(resultSet.next()){
			Experiment experiment = new Experiment();
			experiment.setExperimentId(resultSet.getInt(1));
			experiment.setTeacherId(resultSet.getInt(2));
			experiment.setCourseName(resultSet.getString(3));
			experiment.setExperimentName(resultSet.getString(4));
			experiment.setExperimentWeek(resultSet.getString(5));
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			String date = dateFormat.format(resultSet.getTimestamp(6));
			experiment.setExperimentFinishtime(date);
			
			experiment.setExperimentGoal(resultSet.getString(7));
			experiment.setExperimentContent(resultSet.getString(8));
			experiment.setTeacherName(resultSet.getString("t.teacher_name"));
			return experiment;
		}
		
		return null;
	}

}
