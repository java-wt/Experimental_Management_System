package com.wangtong.entity;

public class Student {
	private int stuid;
	private String stuname;
	private String stupass;
	private String stusex;
	private Class clazz; // 一对多关系，一个班级可以子选择多个学生
	private String stuphone;
	private String stuemail;
	private String question;
	private String questionpass;
	private int status;

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getStupass() {
		return stupass;
	}

	public void setStupass(String stupass) {
		this.stupass = stupass;
	}

	public String getStusex() {
		return stusex;
	}

	public void setStusex(String stusex) {
		this.stusex = stusex;
	}

	public Class getClazz() {
		return clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}

	public String getStuphone() {
		return stuphone;
	}

	public void setStuphone(String stuphone) {
		this.stuphone = stuphone;
	}

	public String getStuemail() {
		return stuemail;
	}

	public void setStuemail(String stuemail) {
		this.stuemail = stuemail;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getQuestionpass() {
		return questionpass;
	}

	public void setQuestionpass(String questionpass) {
		this.questionpass = questionpass;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Student(int stuid,String stuname, String stupass, String stusex, Class clazz, String stuphone, String stuemail,
			String question, String questionpass) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.stupass = stupass;
		this.stusex = stusex;
		this.clazz = clazz;
		this.stuphone = stuphone;
		this.stuemail = stuemail;
		this.question = question;
		this.questionpass = questionpass;
		
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [stuname=" + stuname + ", stuid=" + stuid + ", stupass=" + stupass + ", stusex=" + stusex
				+ ", clazz=" + clazz + ", stuphone=" + stuphone + ", stuemail=" + stuemail + ", question=" + question
				+ ", questionpass=" + questionpass + ", status=" + status + "]";
	}

}
