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
	 * 根据id查询，返回true或者false
	 */
	public boolean queryById(int id) throws Exception{
		return dao.queryById(id);
	}
	
	/*
	 * 根据id和password查询，返回true或者false
	 */
	public boolean queryById(int id,String password) throws Exception{
		return dao.queryById(id, password);
	}
	
	/*
	 * 根据id查询，返回true或者false
	 */
	public Student queryById2(int id) throws Exception{
		return dao.queryById2(id);
	}
	
	/*
	 * 更新用户  根据账号和密码更新
	 */
	public boolean updateById(int stuid, String stpass) throws Exception{
		return dao.updateById(stuid, stpass);
	}
	
	/*
	 * 更新用户信息，根据id
	 */
	public boolean updateById(int stuid, String stuphone, String stuemail,String question, String questionpass) throws Exception{
		return dao.updateById(stuid, stuphone, stuemail, question, questionpass);
	}
}
