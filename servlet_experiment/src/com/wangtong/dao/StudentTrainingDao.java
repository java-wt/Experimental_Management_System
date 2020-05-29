package com.wangtong.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.wangtong.entity.Student;
import com.wangtong.entity.StudentExperiment;
import com.wangtong.entity.StudentTraining;
import com.wangtong.utils.DBUtils;

public class StudentTrainingDao {
	/* status = 0 ,实验未完成
	 * 通过学生id查询状态等于0的实验个数，返回int类型数值
	 */
	public int queryById1(Student student) throws Exception{
		ResultSet resultSet = DBUtils.executeQuery("select count(*) from studenttraining where student_id=? and training_status=0",new Object[]{student.getStuid()});
		
		while(resultSet.next()){
			int i = resultSet.getInt(1);
			return i;
		}
		
		return 0;
	}
	
	/* status = 0 ,实验未完成
	 * 通过学生id查询状态等于0的实验个数，返回list集合
	 */
	public List<StudentTraining> queryById1ToList(Student student) throws Exception{
		List<StudentTraining> list = new ArrayList<StudentTraining>();
		ResultSet resultSet = DBUtils.executeQuery("select *from studenttraining where student_id=? and training_status=0",new Object[]{student.getStuid()});
		while(resultSet.next()){
			StudentTraining training = new StudentTraining();
			training.setStudentId(resultSet.getInt(1));
			training.setTeacherId(resultSet.getInt(2));
			training.setTrainingId(resultSet.getInt(3));
			training.setTrainingScore(resultSet.getInt(4));
			list.add(training);
		}
		return list;
	}
	
	/* status = 1 ,实验已完成
	 * 通过学生id查询状态等于0的实验个数，返回int类型数值
	 */
	public int queryById2(Student student) throws Exception{
		ResultSet resultSet = DBUtils.executeQuery("select count(*) from studenttraining where student_id=? and training_status=1",new Object[]{student.getStuid()});
		
		while(resultSet.next()){
			int i = resultSet.getInt(1);
			return i;
		}
		
		return 0;
	}
	
	/* status = 1 ,实验已完成
	 * 通过学生id查询状态等于0的实验个数，返回int类型数值
	 */
	public List<StudentTraining> queryById2ToList(Student student) throws Exception{
		List<StudentTraining> list = new ArrayList<StudentTraining>();
		ResultSet resultSet = DBUtils.executeQuery("select *from studenttraining where student_id=? and training_status=1",new Object[]{student.getStuid()});
		while(resultSet.next()){
			StudentTraining training = new StudentTraining();
			training.setStudentId(resultSet.getInt(1));
			training.setTeacherId(resultSet.getInt(2));
			training.setTrainingId(resultSet.getInt(3));
			training.setTrainingScore(resultSet.getInt(4));
			list.add(training);
		}
		return list;
	}
	
	/* status = 2 ,实验已完成并且已经打分
	 * 通过学生id查询状态等于2的实验个数
	 */
	public List<StudentTraining> queryById3ToList(Student student) throws Exception{
		List<StudentTraining> list = new ArrayList<StudentTraining>();
		ResultSet resultSet = DBUtils.executeQuery("select *from studenttraining where student_id=? and training_status=2",new Object[]{student.getStuid()});
		while(resultSet.next()){
			StudentTraining training = new StudentTraining();
			training.setStudentId(resultSet.getInt(1));
			training.setTeacherId(resultSet.getInt(2));
			training.setTrainingId(resultSet.getInt(3));
			training.setTrainingScore(resultSet.getInt(4));
			list.add(training);
		}
		return list;
	}
}
