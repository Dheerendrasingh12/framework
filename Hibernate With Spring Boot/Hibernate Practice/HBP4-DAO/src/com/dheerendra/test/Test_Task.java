package com.dheerendra.test;

import com.dheerendra.dao.TaskAssignmentDAO;
import com.dheerendra.dao.TaskAssignmentDAOFactory;
import com.dheerendra.domain.TaskAssignment;
import com.dheerendra.utility.HibernateUtility;


public class Test_Task {

	public static void main(String[] args) {
		TaskAssignmentDAO dao=null;
		TaskAssignment task=null;
		int updateStatus=0;
		//get DAO
		dao=TaskAssignmentDAOFactory.getInstance();
		task=dao.getTask(1);
		System.out.println("task details"+task.getTaskId()+" "+task.getTaskName()+" "+task.getAssignDate()+" "+task.getSubmissionDate()+" "+task.getRemarks());
	
		updateStatus=dao.updateTask(1,"POC122");
		if(updateStatus==0)
			System.out.println("Task not found/not updated");
		else
			System.out.println("taks found and updated");
		
		//close SessionFactory
		HibernateUtility.closeSessionFactory();
	}//main
}//class
