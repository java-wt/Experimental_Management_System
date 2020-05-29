package com.wangtong.entity;

public class StudentTraining {
	private int studentId;
	private int teacherId;
	private int trainingId;
	private int trainingScore;
	private int trainingStatus;

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

	public int getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}

	public int getTrainingScore() {
		return trainingScore;
	}

	public void setTrainingScore(int trainingScore) {
		this.trainingScore = trainingScore;
	}

	public int getTrainingStatus() {
		return trainingStatus;
	}

	public void setTrainingStatus(int trainingStatus) {
		this.trainingStatus = trainingStatus;
	}

	public StudentTraining(int studentId, int teacherId, int trainingId, int trainingScore) {
		super();
		this.studentId = studentId;
		this.teacherId = teacherId;
		this.trainingId = trainingId;
		this.trainingScore = trainingScore;
	}

	public StudentTraining() {
		super();
	}

	@Override
	public String toString() {
		return "StudentTraining [studentId=" + studentId + ", teacherId=" + teacherId + ", trainingId=" + trainingId
				+ ", trainingScore=" + trainingScore + ", trainingStatus=" + trainingStatus + "]";
	}

}
