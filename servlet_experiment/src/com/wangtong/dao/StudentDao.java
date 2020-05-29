package com.wangtong.dao;

import java.sql.ResultSet;
import com.wangtong.entity.Class;
import com.wangtong.entity.Student;
import com.wangtong.utils.DBUtils;

public class StudentDao {
	
	/*
	 * 注册
	 */
	public boolean register(Student student) throws Exception{
		
		if(DBUtils.executeUpdate("insert into student(stuname,stuid,stupass,stusex,classid,stuphone,stuemail,question,questionpass)values(?,?,?,?,?,?,?,?,?)",
				new Object[]{student.getStuname(),student.getStuid(),student.getStupass(),student.getStusex(),
						student.getClazz().getClassid(),student.getStuphone(),student.getStuemail(),student.getQuestion(),student.getQuestionpass()})){
			
			return true;
		}
		
		return false;
	}
	
	/*
	 * 根据id查询，返回true或者false
	 */
	public boolean queryById(int id) throws Exception{
		ResultSet resultSet = DBUtils.executeQuery("select count(*) from student where stuid=?", new Object[]{id});
		while(resultSet.next()){
			if(resultSet.getInt(1)==1){
				return true;
			}
		}
		return false;
	}
	
	/*
	 * 根据id查询，返回true或者false
	 */
	public Student queryById2(int id) throws Exception{
		ResultSet resultSet = DBUtils.executeQuery("select *from student where stuid=?", new Object[]{id});
		while(resultSet.next()){
			Student student = new Student();
			student.setStuid(resultSet.getInt("stuid"));
			student.setStupass(resultSet.getString("stupass"));
			student.setStuname(resultSet.getString("stuname"));
			student.setStusex(resultSet.getString("stusex"));
			
			int classid = resultSet.getInt("classid");
			Class class1 = new Class(classid,null,null);
			student.setClazz(class1);
			
			student.setStuphone(resultSet.getString("stuphone"));
			student.setStuemail(resultSet.getString("stuemail"));
			student.setQuestion(resultSet.getString("question"));
			student.setQuestionpass(resultSet.getString("questionpass"));
			return student;
		}
		return null;
	}
	
	/*
	 * 根据id和password查询，返回true或者false
	 */
	public boolean queryById(int id,String password) throws Exception{
		ResultSet resultSet = DBUtils.executeQuery("select count(*) from student where stuid=? and stupass=?", new Object[]{id,password});
		while(resultSet.next()){
			if(resultSet.getInt(1)==1){
				return true;
			}
		}
		return false;
	}
	
	/*
	 * 登录
	 */
	public Student login(int stuid, String stupass) throws Exception{
		
		ResultSet resultSet = DBUtils.executeQuery("select *from student where stuid=? and stupass=?", new Object[]{stuid,stupass});
		while(resultSet.next()){
			Student student = new Student();
			student.setStuid(resultSet.getInt("stuid"));
			student.setStupass(resultSet.getString("stupass"));
			student.setStuname(resultSet.getString("stuname"));
			student.setStusex(resultSet.getString("stusex"));
			
			int classid = resultSet.getInt("classid");
			Class class1 = new Class(classid,null,null);
			student.setClazz(class1);
			
			student.setStuphone(resultSet.getString("stuphone"));
			student.setStuemail(resultSet.getString("stuemail"));
			student.setQuestion(resultSet.getString("question"));
			student.setQuestionpass(resultSet.getString("questionpass"));
			return student;
		}
		return null;
	}
	
	/*
	 * 更新用户  根据账号和密码更新
	 */
	public boolean updateById(int stuid, String stpass) throws Exception{
		
		return DBUtils.executeUpdate("update student set stupass=? where stuid=?", new Object[]{stpass,stuid});
	}
	
	/*
	 * 更新用户信息，根据id
	 */
	public boolean updateById(int stuid, String stuphone, String stuemail,String question, String questionpass) throws Exception{
		
		return DBUtils.executeUpdate("update student set stuphone=?,stuemail=?,question=?,questionpass=? where stuid=?", new Object[]{stuphone,stuemail,question,questionpass,stuid});
	}
	
}
