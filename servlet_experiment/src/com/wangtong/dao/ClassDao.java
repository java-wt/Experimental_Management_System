package com.wangtong.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wangtong.entity.Class;
import com.wangtong.utils.DBUtils;

public class ClassDao {
	
	/*
	 * ��ȡ���еİ༶
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
	 * ����id��ѯ�༶��Ϣ
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
	 * ��Ӱ༶
	 */
	public boolean addClass(Class clazz) throws Exception{
		if(DBUtils.executeUpdate("insert into class(classid,classname)values(?,?)", 
				new Object[]{clazz.getClassid(),clazz.getClassname()})){
			
			return true;
		}
		return false;
	}
	
	/*
	 * ɾ���༶
	 */
	
	
	/*
	 * ͨ���༶���Ų���id
	 */

}
