package com.wangtong.service;

import java.util.List;

import com.wangtong.dao.StudentTrainingDao;
import com.wangtong.entity.Student;
import com.wangtong.entity.StudentTraining;

public class StudentTrainingService {
	private StudentTrainingDao dao = new StudentTrainingDao();
	
	/* status = 0 ,ʵѵδ���
	 * ͨ��ѧ��id��ѯ״̬����0��ʵѵ����������int������ֵ
	 */
	public int queryById1(Student student) throws Exception{
		return dao.queryById1(student);
	}
	
	/* status = 0 ,ʵ��δ���
	 * ͨ��ѧ��id��ѯ״̬����0��ʵ�����������list����
	 */
	public List<StudentTraining> queryById1ToList(Student student) throws Exception{
		return dao.queryById1ToList(student);
	}
	
	/* status = 1 ,ʵѵ�����
	 * ͨ��ѧ��id��ѯ״̬����0��ʵѵ����������int������ֵ
	 */
	public int queryById2(Student student) throws Exception{
		return dao.queryById2(student);
	}
	
	/* status = 1 ,ʵ�������
	 * ͨ��ѧ��id��ѯ״̬����0��ʵ�����������int������ֵ
	 */
	public List<StudentTraining> queryById2ToList(Student student) throws Exception{
		return dao.queryById2ToList(student);
	}
	
	/* status = 2 ,ʵ������ɲ����Ѿ����
	 * ͨ��ѧ��id��ѯ״̬����2��ʵ�����
	 */
	public List<StudentTraining> queryById3ToList(Student student) throws Exception{
		return dao.queryById3ToList(student);
	}
}
