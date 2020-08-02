package com.dheerendra.dao;

import java.util.Date;

import com.dheerendra.domain.TaskAssignment;


public interface TaskAssignmentDao {
	public int register(int taskId,String taskName,Date assignDate,Date submissionDate,String remarks);
	public void modifyTask(int taskId,String remarks);
	public TaskAssignment search(int taskId);
}