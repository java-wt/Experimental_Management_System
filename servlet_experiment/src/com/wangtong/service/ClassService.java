package com.wangtong.service;

import java.util.List;

import com.wangtong.dao.ClassDao;
import com.wangtong.entity.Class;

public class ClassService {
	private ClassDao dao = new ClassDao();
	
	/*
	 * ��ȡ���еİ༶
	 */
	public List<Class> getAll() throws Exception{
		return dao.getAll();
	}
	
	
	public Class getByid(int classid) throws Exception{
		return dao.getByid(classid);
	}
	
	/*
	 * ��Ӱ༶
	 */
	public boolean addClass(Class clazz) throws Exception{
		return dao.addClass(clazz);
	}

}
