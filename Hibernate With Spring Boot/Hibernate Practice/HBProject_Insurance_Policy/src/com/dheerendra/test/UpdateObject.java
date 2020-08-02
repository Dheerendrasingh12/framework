package com.dheerendra.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dheerendra.domain.Insurance_Policy;

public class UpdateObject {

	public static void main(String[] args) {
		
		SessionFactory factory=null;
		Session ses=null;
		Insurance_Policy policy=null;
		Transaction tx=null;
		policy=new Insurance_Policy();
		factory=new Configuration().configure("/com/dheerendra/cfgs/hibernate.cfg.xml").buildSessionFactory();
		ses=factory.openSession();
		
		policy.setPolicyId(13);
		policy.setPolicyName("singh");
		policy.setPremium(45);
		policy.setTenure(45213);
		try {
			tx=ses.beginTransaction();
			ses.update(policy);
			tx.commit();
			System.out.println("Successfully");
		}catch (Exception e) {
			tx.rollback();
			System.out.println("failed");
			
		}
		ses.flush();
		ses.close();
		factory.close();

	}

}
