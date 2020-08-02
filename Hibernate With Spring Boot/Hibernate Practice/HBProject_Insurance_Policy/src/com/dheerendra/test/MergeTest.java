package com.dheerendra.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dheerendra.domain.Insurance_Policy;

public class MergeTest {

	public static void main(String[] args) {
		SessionFactory factory=null;
		Session ses=null;
		Insurance_Policy details=null,det=null;
		Transaction tx=null;
		factory=new Configuration().configure("/com/dheerendra/cfgs/hibernate.cfg.xml").buildSessionFactory();
		ses=factory.openSession();
		details =new Insurance_Policy();
		details.setPolicyId(9867);
		details.setPolicyName("DS");
		details.setPremium(45);
		details.setTenure(53321);
		try {
			tx=ses.beginTransaction();
			det=(Insurance_Policy) ses.merge(details);
			tx.commit();
			System.out.println("Object is saved");
			
		}catch (Exception e) {
			tx.rollback();
		}
		ses.close();
		factory.close();
	}

}
