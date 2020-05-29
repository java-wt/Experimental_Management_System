package com.wangtong.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wangtong.entity.Student;
import com.wangtong.entity.StudentExperiment;
import com.wangtong.utils.DBUtils;

public class StudentExperimentDao {
	
	/* status = 0 ,实验未完成
	 * 通过学生id查询状态等于0的实验个数，返回int类型数值
	 */
	public int queryById1(Student student) throws Exception{
		ResultSet resultSet = DBUtils.executeQuery("select count(*) from studentexperiment where student_id=? and experiment_status=0", new Object[]{student.getStuid()});
		
		while(resultSet.next()){
			int i = resultSet.getInt(1);
			return i;
		}
		
		return 0;
	}
	
	/* status = 0 ,实验未完成
	 * 通过学生id查询状态等于0的实验个数，返回list集合
	 */
	public List<StudentExperiment> queryById1ToList(Student student) throws Exception{
		List<StudentExperiment> list = new ArrayList<StudentExperiment>();
		ResultSet resultSet = DBUtils.executeQuery("select *from studentexperiment where student_id=? and experiment_status=0",new Object[]{student.getStuid()});
		while(resultSet.next()){
			StudentExperiment experiment = new StudentExperiment();
			experiment.setStudentId(resultSet.getInt(1));
			experiment.setTeacherId(resultSet.getInt(2));
			experiment.setExperimentId(resultSet.getInt(3));
			experiment.setExperimentScore(resultSet.getInt(4));
			list.add(experiment);
		}
		return list;
	}
	
	/* status = 1 ,实验已完成
	 * 通过学生id查询状态等于0的实验个数，返回int类型数值
	 */
	public int queryById2(Student student) throws Exception{
		ResultSet resultSet = DBUtils.executeQuery("select count(*) from studentexperiment where student_id=? and experiment_status=1", new Object[]{student.getStuid()});
		
		while(resultSet.next()){
			int i = resultSet.getInt(1);
			return i;
		}
		
		return 0;
	}
	
	/* status = 1 ,实验已完成
	 * 通过学生id查询状态等于1的实验个数，返回int类型数值
	 */
	public List<StudentExperiment> queryById2ToList(Student student) throws Exception{
		List<StudentExperiment> list = new ArrayList<StudentExperiment>();
		ResultSet resultSet = DBUtils.executeQuery("select *from studentexperiment where student_id=? and experiment_status=1",new Object[]{student.getStuid()});
		while(resultSet.next()){
			StudentExperiment experiment = new StudentExperiment();
			experiment.setStudentId(resultSet.getInt(1));
			experiment.setTeacherId(resultSet.getInt(2));
			experiment.setExperimentId(resultSet.getInt(3));
			experiment.setExperimentScore(resultSet.getInt(4));
			list.add(experiment);
		} 
		return list;
	}
	
	/* status = 2 ,实验已完成并且已经打分
	 * 通过学生id查询状态等于2的实验个数
	 */
	public List<StudentExperiment> queryById3ToList(Student student) throws Exception{
		List<StudentExperiment> list = new ArrayList<StudentExperiment>();
		ResultSet resultSet = DBUtils.executeQuery("SELECT s.*,t.teacher_name,t.teacher_course,e.experiment_name  FROM studentexperiment s,teacher t,experiment e WHERE s.student_id=? AND s.experiment_status=2 AND s.teacher_id=t.teacher_id AND s.experiment_id=e.experiment_id",new Object[]{student.getStuid()});
		while(resultSet.next()){
			StudentExperiment experiment = new StudentExperiment();
			experiment.setStudentId(resultSet.getInt(1));
			experiment.setTeacherId(resultSet.getInt(2));
			experiment.setExperimentId(resultSet.getInt(3));
			experiment.setExperimentScore(resultSet.getInt(4));
			
			experiment.setTeacherName(resultSet.getString("t.teacher_name"));
			experiment.setCourseName(resultSet.getString("t.teacher_course"));
			experiment.setExperimentName(resultSet.getString("e.experiment_name"));
			list.add(experiment);
		}
		return list;
	}
}
