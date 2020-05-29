package com.wangtong.service;

import java.util.List;

import com.wangtong.dao.StudentExperimentDao;
import com.wangtong.entity.Student;
import com.wangtong.entity.StudentExperiment;

public class StudentExperimentService {
	
	private StudentExperimentDao dao = new StudentExperimentDao();
	
	/* status = 0 ,实验未完成
	 * 通过学生id查询状态等于0的实验个数，返回int类型数值
	 */
	public int queryById1(Student student) throws Exception{
		return dao.queryById1(student);
	}
	
	/* status = 0 ,实验未完成
	 * 通过学生id查询状态等于0的实验个数，返回list集合
	 */
	public List<StudentExperiment> queryById1ToList(Student student) throws Exception{
		return dao.queryById1ToList(student);
	}
	
	/* status = 1 ,实验已完成
	 * 通过学生id查询状态等于0的实验个数，返回int类型数值
	 */
	public int queryById2(Student student) throws Exception{
		return dao.queryById2(student);
	}
	

	/* status = 1 ,实验已完成
	 * 通过学生id查询状态等于0的实验个数，返回int类型数值
	 */
	public List<StudentExperiment> queryById2ToList(Student student) throws Exception{
		return dao.queryById2ToList(student);
	}
	
	/* status = 2 ,实验已完成并且已经打分
	 * 通过学生id查询状态等于2的实验个数
	 */
	public List<StudentExperiment> queryById3ToList(Student student) throws Exception{
		return dao.queryById3ToList(student);
	}
}
