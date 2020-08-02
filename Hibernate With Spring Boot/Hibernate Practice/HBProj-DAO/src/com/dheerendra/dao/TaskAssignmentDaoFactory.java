package com.dheerendra.dao;

public class TaskAssignmentDaoFactory {

	public static TaskAssignmentDaoImpl getInstance() {
		return new TaskAssignmentDaoImpl();
	}
}
