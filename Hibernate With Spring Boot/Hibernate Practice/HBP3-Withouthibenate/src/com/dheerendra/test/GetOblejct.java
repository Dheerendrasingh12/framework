package com.dheerendra.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;

import com.dheerendra.domain.EmpDetails;

public class GetOblejct {

	public static void main(String[] args) {
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		EmpDetails details=null;
		
		cfg=new Configuration();
		cfg.addFile("src/com/dheerendra/cfgs/Employee.hbm.xml");
		
		factory=cfg.buildSessionFactory();
		ses=factory.openSession();
		details=ses.get(EmpDetails.class, 1);
		
		if(details!=null) {
			System.out.println(details.getNo()+"  "+details.getFname()+"  "+details.getLname()+" "+details.getMail());
		}
		else {
			System.out.println("Record not found");
		}
		
		ses.close();
		factory.close();
	}

}
