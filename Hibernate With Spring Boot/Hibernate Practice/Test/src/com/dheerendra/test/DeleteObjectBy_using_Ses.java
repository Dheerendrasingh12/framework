package com.dheerendra.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dheerendra.domain.EmpDetails;

public class DeleteObjectBy_using_Ses {

	public static void main(String[] args) {

		Configuration cfg = null;
		SessionFactory factory = null;
		Session ses = null;
		Transaction tx = null;
		EmpDetails ed = null;
		cfg=new Configuration();
		cfg=cfg.configure("/com/dheerendra/cfgs/hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
		ses = factory.openSession();
		ed = new EmpDetails();

		ed.setNo(3);
		try {
			tx = ses.beginTransaction();
			ses.delete(ed);
			tx.commit();
			System.out.println("Successfully Object Delete");
		} catch (Exception e) {
			tx.rollback();
		}
		finally {
			ses.close();
			factory.close();
			
		}

	}

}
