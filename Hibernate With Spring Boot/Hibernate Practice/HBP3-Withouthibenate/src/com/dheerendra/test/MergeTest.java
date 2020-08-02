package com.dheerendra.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dheerendra.domain.EmpDetails;

public class MergeTest {
	
	public static void main(String[] args) {
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		Transaction tx=null;
		EmpDetails details=null, det=null;
		
		factory=new Configuration().addFile("src/com/dheerendra/cfgs/Employee.hbm.xml").buildSessionFactory();
		
		ses=factory.openSession();
		
		details=new EmpDetails();
		details.setNo(1);
		details.setFname("Dheerendra");
		details.setLname("Singh ");
		details.setMail("hi@gmail.com");
		try {
			tx=ses.beginTransaction();
			det=(EmpDetails) ses.merge(details);
			tx.commit();
			System.out.println("Recored successfully updated ");
		}
		catch (Exception e) {
			tx.rollback();
			// TODO: handle exception
		}
		ses.close();
		factory.close();
		
	}
}
