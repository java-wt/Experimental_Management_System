package com.wangtong.entity;

public class StudentExperiment {
	private int studentId;
	private int teacherId;
	private int experimentId;
	private int experimentScore;
	private int experimentStatus;
	
	private String teacherName;
	private String courseName;
	private String experimentName;

	
	
	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getExperimentName() {
		return experimentName;
	}

	public void setExperimentName(String experimentName) {
		this.experimentName = experimentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public int getExperimentId() {
		return experimentId;
	}

	public void setExperimentId(int experimentId) {
		this.experimentId = experimentId;
	}

	public int getExperimentScore() {
		return experimentScore;
	}

	public void setExperimentScore(int experimentScore) {
		this.experimentScore = experimentScore;
	}

	public int getExperimentStatus() {
		return experimentStatus;
	}

	public void setExperimentStatus(int experimentStatus) {
		this.experimentStatus = experimentStatus;
	}

	public StudentExperiment(int studentId, int teacherId, int experimentId, int experimentScore) {
		super();
		this.studentId = studentId;
		this.teacherId = teacherId;
		this.experimentId = experimentId;
		this.experimentScore = experimentScore;
	}

	public StudentExperiment() {
		super();
	}

	@Override
	public String toString() {
		return "StudentExperiment [studentId=" + studentId + ", teacherId=" + teacherId + ", experimentId="
				+ experimentId + ", experimentScore=" + experimentScore + ", experimentStatus=" + experimentStatus
				+ "]";
	}

}
