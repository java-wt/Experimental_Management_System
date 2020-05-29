package com.wangtong.entity;

public class Experiment {
	private int experimentId;
	private int teacherId;
	private String teacherName;
	private String courseName;
	private String experimentName;
	private String experimentWeek;
	private String experimentFinishtime;
	private String experimentGoal;
	private String experimentContent;
	private String experimentSteps;
	private String experimentResult;
	private String experimentProblem;
	private String experimentProcess;
	private String experimentDocUrl;
	private int experimentStatus;

	public int getExperimentId() {
		return experimentId;
	}

	public void setExperimentId(int experimentId) {
		this.experimentId = experimentId;
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

	public String getExperimentName() {
		return experimentName;
	}

	public void setExperimentName(String experimentName) {
		this.experimentName = experimentName;
	}

	public String getExperimentWeek() {
		return experimentWeek;
	}

	public void setExperimentWeek(String experimentWeek) {
		this.experimentWeek = experimentWeek;
	}

	public String getExperimentFinishtime() {
		return experimentFinishtime;
	}

	public void setExperimentFinishtime(String experimentFinishtime) {
		this.experimentFinishtime = experimentFinishtime;
	}

	public String getExperimentGoal() {
		return experimentGoal;
	}

	public void setExperimentGoal(String experimentGoal) {
		this.experimentGoal = experimentGoal;
	}

	public String getExperimentContent() {
		return experimentContent;
	}

	public void setExperimentContent(String experimentContent) {
		this.experimentContent = experimentContent;
	}

	public String getExperimentSteps() {
		return experimentSteps;
	}

	public void setExperimentSteps(String experimentSteps) {
		this.experimentSteps = experimentSteps;
	}

	public String getExperimentResult() {
		return experimentResult;
	}

	public void setExperimentResult(String experimentResult) {
		this.experimentResult = experimentResult;
	}

	public String getExperimentProblem() {
		return experimentProblem;
	}

	public void setExperimentProblem(String experimentProblem) {
		this.experimentProblem = experimentProblem;
	}

	public String getExperimentProcess() {
		return experimentProcess;
	}

	public void setExperimentProcess(String experimentProcess) {
		this.experimentProcess = experimentProcess;
	}

	public String getExperimentDocUrl() {
		return experimentDocUrl;
	}

	public void setExperimentDocUrl(String experimentDocUrl) {
		this.experimentDocUrl = experimentDocUrl;
	}

	public int getExperimentStatus() {
		return experimentStatus;
	}

	public void setExperimentStatus(int experimentStatus) {
		this.experimentStatus = experimentStatus;
	}

	public Experiment(int teacherId, String courseName, String experimentName, String experimentWeek,
			String experimentFinishtime, String experimentGoal, String experimentContent, String experimentSteps,
			String experimentResult, String experimentProblem, String experimentProcess, String experimentDocUrl) {
		super();
		this.teacherId = teacherId;
		this.courseName = courseName;
		this.experimentName = experimentName;
		this.experimentWeek = experimentWeek;
		this.experimentFinishtime = experimentFinishtime;
		this.experimentGoal = experimentGoal;
		this.experimentContent = experimentContent;
		this.experimentSteps = experimentSteps;
		this.experimentResult = experimentResult;
		this.experimentProblem = experimentProblem;
		this.experimentProcess = experimentProcess;
		this.experimentDocUrl = experimentDocUrl;
	}

	

	@Override
	public String toString() {
		return "Experiment [experimentId=" + experimentId + ", teacherId=" + teacherId + ", teacherName=" + teacherName
				+ ", courseName=" + courseName + ", experimentName=" + experimentName + ", experimentWeek="
				+ experimentWeek + ", experimentFinishtime=" + experimentFinishtime + ", experimentGoal="
				+ experimentGoal + ", experimentContent=" + experimentContent + ", experimentSteps=" + experimentSteps
				+ ", experimentResult=" + experimentResult + ", experimentProblem=" + experimentProblem
				+ ", experimentProcess=" + experimentProcess + ", experimentDocUrl=" + experimentDocUrl
				+ ", experimentStatus=" + experimentStatus + "]";
	}

	public Experiment() {
		super();
	}

}
