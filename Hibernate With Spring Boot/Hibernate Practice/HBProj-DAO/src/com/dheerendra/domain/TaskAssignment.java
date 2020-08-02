package com.dheerendra.domain;

import java.util.Date;

public class TaskAssignment {

	private int taskId;
	private String taskName;
	private Date assignDate;
	private Date submissionDate;
	private String remarks;
	

	public int getTaskId() {
		return taskId;
	}


	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}


	public String getTaskName() {
		return taskName;
	}


	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}


	public Date getAssignDate() {
		return assignDate;
	}


	public void setAssignDate(Date assignDate) {
		this.assignDate = assignDate;
	}


	public Date getSubmissionDate() {
		return submissionDate;
	}


	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	public TaskAssignment() {
	System.out.println("Task Assignment 0-param constructor");	
	}
	
	


	
	@Override
	public String toString() {
		return "TaskAssignment [taskId=" + taskId + ", taskName=" + taskName + ", assignDate=" + assignDate
				+ ", submissionDate=" + submissionDate + ", remarks=" + remarks + "]";
	}

}
