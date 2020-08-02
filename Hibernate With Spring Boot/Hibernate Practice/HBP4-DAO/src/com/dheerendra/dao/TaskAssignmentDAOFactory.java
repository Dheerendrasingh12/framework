package com.dheerendra.dao;

public class TaskAssignmentDAOFactory {
	
	public static TaskAssignmentDAO getInstance(){
		return new TaskAssignmentDAOImpl();
	}

}
