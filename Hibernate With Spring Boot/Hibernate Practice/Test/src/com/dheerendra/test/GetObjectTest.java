package com.dheerendra.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dheerendra.domain.EmpDetails;

public class GetObjectTest {

	public static void main(String[] args) {
		Configuration cfg=null;
		SessionFactory facory=null;
		Session ses= null;
		EmpDetails emp=null;
		cfg=new Configuration();
		cfg=cfg.configure("/com/dheerendra/cfgs/hibernate.cfg.xml");
		facory =cfg.buildSessionFactory();
		
		ses=facory.openSession();
		
		
		emp=ses.get(EmpDetails.class, 1);
		
		if(emp!=null) {
			System.out.println(emp.getNo()+"  "+emp.getFname()+"  "+emp.getLname()+" "+emp.getMail());
		}
		else {
			System.out.println("Record not Found");
		}
	
	}
}