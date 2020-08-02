package com.dheerendra.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dheerendra.domain.EmpDetails;

public class SaveTest {
	public static void main(String[] args) {
		
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		EmpDetails details=null;
		
		cfg=new Configuration();
		
		cfg.addFile("src/com/dheerendra/cfgs/Employee.hbm.xml");
		
		factory=cfg.buildSessionFactory();
		ses=factory.openSession();
		
		details=new EmpDetails();
		details.setNo(5);
		details.setFname("Dheerendra");
		details.setLname("Singh");
		details.setMail("Dheerendra@12.com");
		ses.save(details);
		ses.flush();
		
		ses.close();
		factory.close();
	}
}
