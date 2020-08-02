package com.dheerendra.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dheerendra.domain.EmpDetails;

public class SaveOrUpdate {

	public static void main(String[] args) {
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		Transaction tx=null;
		EmpDetails details=null;
		
		factory = new Configuration().addFile("src/com/dheerendra/cfgs/Employee.hbm.xml").buildSessionFactory();
		                       
		ses=factory.openSession();
		
		details=new EmpDetails();
		details.setNo(1);
		details.setFname("KDheerendra");
		details.setLname("Singh");
		details.setMail("KDS@gmail.com");
		
		try {
			tx=ses.beginTransaction();
			ses.saveOrUpdate(details);
			tx.commit();
			System.out.println("Object is saved/update");
		}catch (Exception e) {
			tx.rollback();
		}
		
		
		ses.close();
		factory.close();
		
		
	}
}
