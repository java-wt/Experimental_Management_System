package com.wangtong.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.wangtong.entity.Student;
import com.wangtong.entity.StudentExperiment;
import com.wangtong.entity.StudentTraining;
import com.wangtong.utils.DBUtils;

public class StudentTrainingDao {
	/* status = 0 ,ʵ��δ���
	 * ͨ��ѧ��id��ѯ״̬����0��ʵ�����������int������ֵ
	 */
	public int queryById1(Student student) throws Exception{
		ResultSet resultSet = DBUtils.executeQuery("select count(*) from studenttraining where student_id=? and training_status=0",new Object[]{student.getStuid()});
		
		while(resultSet.next()){
			int i = resultSet.getInt(1);
			return i;
		}
		
		return 0;
	}
	
	/* status = 0 ,ʵ��δ���
	 * ͨ��ѧ��id��ѯ״̬����0��ʵ�����������list����
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
	
	/* status = 1 ,ʵ�������
	 * ͨ��ѧ��id��ѯ״̬����0��ʵ�����������int������ֵ
	 */
	public int queryById2(Student student) throws Exception{
		ResultSet resultSet = DBUtils.executeQuery("select count(*) from studenttraining where student_id=? and training_status=1",new Object[]{student.getStuid()});
		
		while(resultSet.next()){
			int i = resultSet.getInt(1);
			return i;
		}
		
		return 0;
	}
	
	/* status = 1 ,ʵ�������
	 * ͨ��ѧ��id��ѯ״̬����0��ʵ�����������int������ֵ
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
	
	/* status = 2 ,ʵ������ɲ����Ѿ����
	 * ͨ��ѧ��id��ѯ״̬����2��ʵ�����
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
