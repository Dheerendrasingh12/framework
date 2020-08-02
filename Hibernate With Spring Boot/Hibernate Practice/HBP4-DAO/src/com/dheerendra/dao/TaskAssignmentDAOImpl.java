package com.dheerendra.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dheerendra.domain.TaskAssignment;
import com.dheerendra.utility.HibernateUtility;


public class TaskAssignmentDAOImpl implements TaskAssignmentDAO {

	@Override
	public int saveTask(TaskAssignment task) {
		Transaction tx=null;
		Session ses=null;
		int id=0;
		//get Session
		ses=HibernateUtility.getSession();
		try{
		 tx=ses.beginTransaction();
		  id=(int) ses.save(task);
		 tx.commit(); 
		}
		catch(Exception e){
			tx.rollback();
		}
		HibernateUtility.closeSession(ses);
		return id;
	}//saveTask(-)
	
	 
		


	@Override
	public TaskAssignment getTask(int taskId) {
		Session ses=null;
		TaskAssignment task=null;
		//get Session
		ses=HibernateUtility.getSession();
		//get Object
		task=ses.get(TaskAssignment.class,taskId);
		HibernateUtility.closeSession(ses);
		return task;
	}//method





	@Override
	public int updateTask(int taskId, String remarks) {
		Session ses=null;
		TaskAssignment task=null;
		Transaction tx=null;
		//get Session
		ses=HibernateUtility.getSession();
		//get Object
		task=ses.get(TaskAssignment.class, taskId);
		if(task!=null){
			try{
		      tx=ses.beginTransaction();
		       task.setRemarks(remarks);
		      tx.commit();
		      HibernateUtility.closeSession(ses);
		      return 1;
			}
			catch(Exception e){
				tx.rollback();
				return 0;
			}
		}//if
		else{
			return 0;		
		}
	}//method
}//class
