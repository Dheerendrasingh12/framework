package com.dheerendra.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dheerendra.domain.Insurance_Policy;

public class GetOperation {

	public static void main(String[] args) {
		SessionFactory factory=null;
		Session ses=null;
		Insurance_Policy policy=null;
		
		factory=new Configuration().configure("/com/dheerendra/cfgs/hibernate.cfg.xml").buildSessionFactory();
			ses=factory.openSession();
		policy=ses.get(Insurance_Policy.class,1);
		if(policy!=null) {
			System.out.println(policy.getPolicyId()+" "+policy.getPolicyName()+" "+policy.getTenure()+" "+policy.getPremium()  );
		}
		else
			System.out.println("object not found");
		
			ses.close();
			factory.close();
	}

}
