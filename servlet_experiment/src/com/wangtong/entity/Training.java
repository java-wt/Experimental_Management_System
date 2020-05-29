package com.wangtong.entity;

public class Training {

	private int trainingId;
	private int teacherId;
	private String teacherName;
	private String courseName;
	private String trainingName;
	private String trainingWeek;
	private String trainingFinishtime;
	private String trainingGoal;
	private String trainingContent;
	private String trainingSteps;
	private String trainingResult;
	private String trainingProblem;
	private String trainingProcess;
	private String trainingDocUrl;
	private int trainingStatus;

	public int getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	

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

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public String getTrainingWeek() {
		return trainingWeek;
	}

	public void setTrainingWeek(String trainingWeek) {
		this.trainingWeek = trainingWeek;
	}

	public String getTrainingFinishtime() {
		return trainingFinishtime;
	}

	public void setTrainingFinishtime(String trainingFinishtime) {
		this.trainingFinishtime = trainingFinishtime;
	}

	public String getTrainingGoal() {
		return trainingGoal;
	}

	public void setTrainingGoal(String trainingGoal) {
		this.trainingGoal = trainingGoal;
	}

	public String getTrainingContent() {
		return trainingContent;
	}

	public void setTrainingContent(String trainingContent) {
		this.trainingContent = trainingContent;
	}

	public String getTrainingSteps() {
		return trainingSteps;
	}

	public void setTrainingSteps(String trainingSteps) {
		this.trainingSteps = trainingSteps;
	}

	public String getTrainingResult() {
		return trainingResult;
	}

	public void setTrainingResult(String trainingResult) {
		this.trainingResult = trainingResult;
	}

	public String getTrainingProblem() {
		return trainingProblem;
	}

	public void setTrainingProblem(String trainingProblem) {
		this.trainingProblem = trainingProblem;
	}

	public String getTrainingProcess() {
		return trainingProcess;
	}

	public void setTrainingProcess(String trainingProcess) {
		this.trainingProcess = trainingProcess;
	}

	public String getTrainingDocUrl() {
		return trainingDocUrl;
	}

	public void setTrainingDocUrl(String trainingDocUrl) {
		this.trainingDocUrl = trainingDocUrl;
	}

	public int getTrainingStatus() {
		return trainingStatus;
	}

	public void setTrainingStatus(int trainingStatus) {
		this.trainingStatus = trainingStatus;
	}

	public Training(int teacherId, String courseName, String trainingName, String trainingWeek,
			String trainingFinishtime, String trainingGoal, String trainingContent, String trainingSteps,
			String trainingResult, String trainingProblem, String trainingProcess, String trainingDocUrl) {
		super();
		this.teacherId = teacherId;
		this.courseName = courseName;
		this.trainingName = trainingName;
		this.trainingWeek = trainingWeek;
		this.trainingFinishtime = trainingFinishtime;
		this.trainingGoal = trainingGoal;
		this.trainingContent = trainingContent;
		this.trainingSteps = trainingSteps;
		this.trainingResult = trainingResult;
		this.trainingProblem = trainingProblem;
		this.trainingProcess = trainingProcess;
		this.trainingDocUrl = trainingDocUrl;
	}

	public Training() {
		super();
	}

	@Override
	public String toString() {
		return "Training [trainingId=" + trainingId + ", teacherId=" + teacherId + ", teacherName=" + teacherName
				+ ", courseName=" + courseName + ", trainingName=" + trainingName + ", trainingWeek=" + trainingWeek
				+ ", trainingFinishtime=" + trainingFinishtime + ", trainingGoal=" + trainingGoal + ", trainingContent="
				+ trainingContent + ", trainingSteps=" + trainingSteps + ", trainingResult=" + trainingResult
				+ ", trainingProblem=" + trainingProblem + ", trainingProcess=" + trainingProcess + ", trainingDocUrl="
				+ trainingDocUrl + ", trainingStatus=" + trainingStatus + "]";
	}

	

}
