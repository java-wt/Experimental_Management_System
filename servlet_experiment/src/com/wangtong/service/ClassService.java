package com.wangtong.service;

import java.util.List;

import com.wangtong.dao.ClassDao;
import com.wangtong.entity.Class;

public class ClassService {
	private ClassDao dao = new ClassDao();
	
	/*
	 * 获取所有的班级
	 */
	public List<Class> getAll() throws Exception{
		return dao.getAll();
	}
	
	
	public Class getByid(int classid) throws Exception{
		return dao.getByid(classid);
	}
	
	/*
	 * 添加班级
	 */
	public boolean addClass(Class clazz) throws Exception{
		return dao.addClass(clazz);
	}

}
