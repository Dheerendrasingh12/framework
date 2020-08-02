package com.dheerendra.dao;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dheerendra.domain.TaskAssignment;
import com.dheerendra.utility.HibernateUtil;

public class TaskAssignmentDaoImpl implements TaskAssignmentDao {

	@Override
	public int register(int taskId, String taskName, Date assignDate, Date submissionDate, String remarks) {
		Session ses = null;
		Transaction tx = null;
		TaskAssignment ta = null;
		int id = 0;
		ses = HibernateUtil.getSession();
		ta = new TaskAssignment();

		ta.setTaskId(taskId);
		ta.setTaskName(taskName);
		ta.setAssignDate(assignDate);
		ta.setSubmissionDate(submissionDate);
		ta.setRemarks(remarks);

		try {
			tx = ses.beginTransaction();
			id = (int) ses.save(ta);
			tx.commit();

		} catch (Exception e) {
			tx.rollback();
			// TODO: handle exception
		}
		return id;

	}

	@Override
	public void modifyTask(int taskId, String remarks) {
		Session ses = null;
		TaskAssignment task = null;
		Transaction tx = null;

		ses = HibernateUtil.getSession();

		task = search(taskId);

		if (task != null) {
			task.setRemarks(remarks);
			
			try {
				tx = ses.beginTransaction();

				ses.update(task);
				tx.commit();
			} catch (Exception e) {
				// TODO: handle exception
				tx.rollback();
			}

		} 
	}

	@Override
	public TaskAssignment search(int taskId) {
		Session ses = null;
		TaskAssignment task = null;
		Transaction tx = null;

		ses = HibernateUtil.getSession();
		task = ses.get(TaskAssignment.class, taskId);
		return task;

	}

}
