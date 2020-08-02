package com.dheerendra.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dheerendra.domain.Insurance_Policy;

public class ClientApp {

	public static void main(String[] args) {
		Configuration cfg = null;
		SessionFactory factory = null;
		Session ses = null;
		Transaction tx = null;

		cfg = new Configuration();
		cfg = cfg.configure("/com/dheerendra/cfgs/hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
		ses = factory.openSession();
		Insurance_Policy policy = new Insurance_Policy();
		policy.setPolicyId(125);
		policy.setPolicyName("Dheerendra");
		policy.setPremium(20);
		policy.setTenure(6342);
		try {
			tx = ses.beginTransaction();
			int id = (Integer) ses.save(policy);
			System.out.println();
			System.out.println("Generator id value :" + id);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ses.close();
		factory.close();
	}

}
