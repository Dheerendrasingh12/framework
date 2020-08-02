package com.dheerendra.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.loader.plan.build.internal.returns.CollectionFetchableIndexAnyGraph;

import com.dheerendra.domain.EmpDetails;

public class ORMSynchronizeTest {

	public static void main(String[] args) {
		Configuration cfg = null;
		SessionFactory factory = null;
		Session ses = null;
		EmpDetails details = null;
		Transaction tx = null;

		factory = new Configuration().addFile("src/com/dheerendra/cfgs/Employee.hbm.xml").buildSessionFactory();
		ses = factory.openSession();

		details = ses.get(EmpDetails.class, 2);

		try {

			tx = ses.beginTransaction();
			details.setMail("D@gmail.com");
			tx.commit();
			System.out.println("Object is modified");

		} catch (Exception e) {
			tx.rollback();
			// TODO: handle exception
		}

		details = ses.get(EmpDetails.class, 2);
		System.out.println(details);
		try {
			Thread.sleep(41000);
		} catch (Exception e) {
			e.printStackTrace();
			
		
		}
		ses.refresh(details);
		System.out.println(details);
		
		ses.close();
		
		factory.close();
		
	}
}
