package com.wangtong.entity;

public class TeacherStudent {

	private int teacherId;
	private int studentId;

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public TeacherStudent(int teacherId, int studentId) {
		super();
		this.teacherId = teacherId;
		this.studentId = studentId;
	}

	public TeacherStudent() {
		super();
	}

	@Override
	public String toString() {
		return "TeacherStudent [teacherId=" + teacherId + ", studentId=" + studentId + "]";
	}

}
