package com.dheerendra.test;

import java.util.Date;

import com.dheerendra.dao.TaskAssignmentDao;
import com.dheerendra.dao.TaskAssignmentDaoFactory;
import com.dheerendra.utility.HibernateUtil;

public class ClientApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TaskAssignmentDao dao=TaskAssignmentDaoFactory.getInstance();
		
		System.out.println(dao.register(12,"Dheerendra", new Date(),new Date(),"good"));
		
		System.out.println("12 task details "+dao.search(12));
		
		HibernateUtil.closeSessionFactory();
		

	}
}
