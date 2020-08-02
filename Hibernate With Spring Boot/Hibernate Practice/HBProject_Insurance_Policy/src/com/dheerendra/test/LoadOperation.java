package com.dheerendra.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dheerendra.domain.Insurance_Policy;
import com.dheerendra.domain.Interface_InsurancePolicy;

import javassist.tools.rmi.ObjectNotFoundException;

public class LoadOperation {

	public static void main(String[] args) {
	
		SessionFactory factory=null;
		Session ses=null;
		Interface_InsurancePolicy ipolicy=null;
		factory=new Configuration().configure("/com/dheerendra/cfgs/hibernate.cfg.xml").buildSessionFactory();
		ses=factory.openSession();
		
		try {
			ipolicy =ses.load(Insurance_Policy.class,12);
			System.out.println(ipolicy.getPolicyId()+" "+ipolicy.getPolicyName()+" "+ipolicy.getPremium()+" "+ipolicy.getTenure() );
			
		}
		catch(Exception onfe){
			System.out.println("Record not found");
		}

		//close objs
		ses.close();
		factory.close();
	}

}
