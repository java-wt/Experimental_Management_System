package com.wangtong.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wangtong.entity.Class;
import com.wangtong.utils.DBUtils;

public class ClassDao {
	
	/*
	 * 获取所有的班级
	 */
	public List<Class> getAll() throws Exception{
		List<Class> classes = new ArrayList<>();
		ResultSet resultSet = DBUtils.executeQuery("select *from class", null);
		
		while(resultSet.next()){
			Class clazz = new Class();
			clazz.setClassid(resultSet.getInt("classid"));
			clazz.setClassname(resultSet.getString("classname"));
			classes.add(clazz);
		}
		
		return classes;
	}
	
	/*
	 * 根据id查询班级信息
	 */
	public Class getByid(int classid) throws Exception{
		
		ResultSet resultSet = DBUtils.executeQuery("select *from class where classid =?", new Object[]{classid});
		while(resultSet.next()){
			Class clazz = new Class();
			clazz.setClassid(resultSet.getInt("classid"));
			clazz.setClassname(resultSet.getString("classname"));
			return clazz;
		}
		
		return null;
	}
	
	/*
	 * 添加班级
	 */
	public boolean addClass(Class clazz) throws Exception{
		if(DBUtils.executeUpdate("insert into class(classid,classname)values(?,?)", 
				new Object[]{clazz.getClassid(),clazz.getClassname()})){
			
			return true;
		}
		return false;
	}
	
	/*
	 * 删除班级
	 */
	
	
	/*
	 * 通过班级代号查找id
	 */

}
