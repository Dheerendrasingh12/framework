package com.dheerendra.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dheerendra.domain.LucyCoupon;

public class MallApp {

	public static void main(String[] args) {
		Configuration cfg = null;
		SessionFactory factory = null;
		Session ses = null;
		Transaction tx = null;
		
		cfg=new Configuration();
		cfg=cfg.configure("/com/dheerendra/cfgs/hibernate.cfg.xml");
		
		factory=cfg.buildSessionFactory();
		ses=factory.openSession();
		
		LucyCoupon coupon=new LucyCoupon();
		coupon.setProductName("Samsung");
		coupon.setProductId(12);
		coupon.setProductAmt(29364);
		try {
			tx=ses.beginTransaction();
			String id=(String)ses.save(coupon);
			System.out.println("Generated Id value "+id);
			tx.commit();
		}
		catch (Exception e) {
			tx.rollback();
			System.out.println("Failed to generated");
			// TODO: handle exception
		}
		ses.close();
		factory.close();
	}

}
