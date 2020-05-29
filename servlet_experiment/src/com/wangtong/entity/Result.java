package com.wangtong.entity;

public class Result {
	private String docUrl;
	private boolean success;
	private String message;

	public String getDocUrl() {
		return docUrl;
	}

	public void setDocUrl(String docUrl) {
		this.docUrl = docUrl;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Result(String docUrl, boolean success, String message) {
		super();
		this.docUrl = docUrl;
		this.success = success;
		this.message = message;
	}

	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Result [docUrl=" + docUrl + ", success=" + success + ", message=" + message + "]";
	}

}
