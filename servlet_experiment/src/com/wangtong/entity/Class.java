package com.wangtong.entity;

import java.util.ArrayList;
import java.util.List;

public class Class {
	private int classid;
	private String classname;
	private List<Student> students = new ArrayList<Student>();  //一对多关系，一个班级可以子选择多个学生

	public int getClassid() {
		return classid;
	}

	public void setClassid(int classid) {
		this.classid = classid;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Class [classid=" + classid + ", classname=" + classname + ", students=" + students + "]";
	}

	public Class(int classid, String classname, List<Student> students) {
		super();
		this.classid = classid;
		this.classname = classname;
		this.students = students;
	}

	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}

}
