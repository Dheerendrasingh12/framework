package com.dheerendra.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dheerendra.domain.Insurance_Policy;
import com.dheerendra.domain.Interface_InsurancePolicy;

public class DeleteObject {

	public static void main(String[] args) {
		SessionFactory factory = null;
		Session ses = null;
		Insurance_Policy pol=null;
		
		Transaction tx = null;
		factory = new Configuration().configure("/com/dheerendra/cfgs/hibernate.cfg.xml").buildSessionFactory();
		ses = factory.openSession();
		pol=new Insurance_Policy();
		pol.setPolicyId(3);
		try {
			tx=ses.beginTransaction();
			ses.delete(pol);
			tx.commit();
			System.out.println("object deleted");
		}catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			System.out.println("Object not found");
			// TODO: handle exception
		}
		ses.flush();
		ses.close();
		factory.close();
	}

}
