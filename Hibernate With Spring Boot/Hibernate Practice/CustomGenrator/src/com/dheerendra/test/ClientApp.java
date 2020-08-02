package com.dheerendra.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dheerendra.domain.EmpDetails;

public class ClientApp {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg=cfg.configure("/com/dheerendra/cfgs/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session ses=factory.openSession();
		
		EmpDetails details=new EmpDetails();
		details.setNo(686);
		details.setFname("DS");
		details.setLname("K");
		details.setMail("Ds@gmail.com");
		Transaction tx=null;
		try {
			tx=ses.beginTransaction();
			int id=(Integer) ses.save(details);
			System.out.println("Generated id value "+id);
			tx.commit();
		}
		catch (Exception e) {
			tx.rollback();
			// TODO: handle exception
		}
		ses.close();
		factory.close();
		
	}

}
