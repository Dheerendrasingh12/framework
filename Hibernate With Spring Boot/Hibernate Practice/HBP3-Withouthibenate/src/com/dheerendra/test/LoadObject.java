package com.dheerendra.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dheerendra.domain.EmpDetails;

public class LoadObject {

	public static void main(String[] args) {
		
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		EmpDetails details=null;
		
		cfg=new Configuration();
		cfg.addFile("src/com/dheerendra/cfgs/Employee.hbm.xml");
		
		factory=cfg.buildSessionFactory();
		ses=factory.openSession();
		
		details=ses.load(EmpDetails.class, 2);
		if(details!=null) {
			System.out.println(details.getFname()+"  "+details.getNo());
		}
		else {
			
			System.out.println("Record not found ");
		}
		factory.close();
		ses.close();
				}

}
