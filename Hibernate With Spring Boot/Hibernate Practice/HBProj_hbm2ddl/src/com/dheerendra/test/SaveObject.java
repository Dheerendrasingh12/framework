package com.dheerendra.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dheerendra.domain.EmpDetails;

import oracle.net.aso.f;

public class SaveObject {

	public static void main(String[] args) {
		
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		EmpDetails details=null;
		Transaction tx=null;
		
		
		cfg=new Configuration();
		cfg=cfg.configure("/com/dheerendra/cfgs/hibernate.cfg.xml");
		
		
		factory=cfg.buildSessionFactory();
		
		ses=factory.openSession();
		
		details=new EmpDetails();
		
		details.setNo(126);
		details.setFname("Shikha");
		details.setLname("Singh");
		details.setMail("shikha@gmail.com");
		
		
		try {
			Thread.sleep(30000);
			tx=ses.beginTransaction();
			int idval=(Integer)ses.save(details);
			
			tx.commit();
			System.out.println("Object is saved");
		}catch (Exception e) {
			tx.rollback();
		
		}
		
		ses.close();
		factory.close();
		
		
		
	}

}
