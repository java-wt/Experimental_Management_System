package com.wangtong.service;

import com.wangtong.dao.StudentDao;
import com.wangtong.entity.Student;

public class StudentService {
	
	private StudentDao dao = new StudentDao();
	
	public boolean register(Student student) throws Exception{
		return dao.register(student);
	}
	
	public Student login(int stuid, String stupass) throws Exception{
		return dao.login(stuid, stupass);
	}

	/*
	 * ����id��ѯ������true����false
	 */
	public boolean queryById(int id) throws Exception{
		return dao.queryById(id);
	}
	
	/*
	 * ����id��password��ѯ������true����false
	 */
	public boolean queryById(int id,String password) throws Exception{
		return dao.queryById(id, password);
	}
	
	/*
	 * ����id��ѯ������true����false
	 */
	public Student queryById2(int id) throws Exception{
		return dao.queryById2(id);
	}
	
	/*
	 * �����û�  �����˺ź��������
	 */
	public boolean updateById(int stuid, String stpass) throws Exception{
		return dao.updateById(stuid, stpass);
	}
	
	/*
	 * �����û���Ϣ������id
	 */
	public boolean updateById(int stuid, String stuphone, String stuemail,String question, String questionpass) throws Exception{
		return dao.updateById(stuid, stuphone, stuemail, question, questionpass);
	}
}
