package com.wangtong.service;

import java.util.List;

import com.wangtong.dao.StudentExperimentDao;
import com.wangtong.entity.Student;
import com.wangtong.entity.StudentExperiment;

public class StudentExperimentService {
	
	private StudentExperimentDao dao = new StudentExperimentDao();
	
	/* status = 0 ,ʵ��δ���
	 * ͨ��ѧ��id��ѯ״̬����0��ʵ�����������int������ֵ
	 */
	public int queryById1(Student student) throws Exception{
		return dao.queryById1(student);
	}
	
	/* status = 0 ,ʵ��δ���
	 * ͨ��ѧ��id��ѯ״̬����0��ʵ�����������list����
	 */
	public List<StudentExperiment> queryById1ToList(Student student) throws Exception{
		return dao.queryById1ToList(student);
	}
	
	/* status = 1 ,ʵ�������
	 * ͨ��ѧ��id��ѯ״̬����0��ʵ�����������int������ֵ
	 */
	public int queryById2(Student student) throws Exception{
		return dao.queryById2(student);
	}
	

	/* status = 1 ,ʵ�������
	 * ͨ��ѧ��id��ѯ״̬����0��ʵ�����������int������ֵ
	 */
	public List<StudentExperiment> queryById2ToList(Student student) throws Exception{
		return dao.queryById2ToList(student);
	}
	
	/* status = 2 ,ʵ������ɲ����Ѿ����
	 * ͨ��ѧ��id��ѯ״̬����2��ʵ�����
	 */
	public List<StudentExperiment> queryById3ToList(Student student) throws Exception{
		return dao.queryById3ToList(student);
	}
}
