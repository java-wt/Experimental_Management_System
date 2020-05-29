package com.wangtong.entity;

public class Teacher {
	private Integer teacherId;
	private String teacherPassword;
	private String teacherName;
	private String teacherCourse;
	private String teacherPhone;
	private int teacherStatus;

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherPassword() {
		return teacherPassword;
	}

	public void setTeacherPassword(String teacherPassword) {
		this.teacherPassword = teacherPassword;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherCourse() {
		return teacherCourse;
	}

	public void setTeacherCourse(String teacherCourse) {
		this.teacherCourse = teacherCourse;
	}

	public String getTeacherPhone() {
		return teacherPhone;
	}

	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}

	public int getTeacherStatus() {
		return teacherStatus;
	}

	public void setTeacherStatus(int teacherStatus) {
		this.teacherStatus = teacherStatus;
	}

	public Teacher(Integer teacherId, String teacherPassword, String teacherName, String teacherCourse,
			String teacherPhone, int teacherStatus) {
		super();
		this.teacherId = teacherId;
		this.teacherPassword = teacherPassword;
		this.teacherName = teacherName;
		this.teacherCourse = teacherCourse;
		this.teacherPhone = teacherPhone;
		this.teacherStatus = teacherStatus;
	}

	public Teacher() {
		super();
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherPassword=" + teacherPassword + ", teacherName="
				+ teacherName + ", teacherCourse=" + teacherCourse + ", teacherPhone=" + teacherPhone
				+ ", teacherStatus=" + teacherStatus + "]";
	}

}
