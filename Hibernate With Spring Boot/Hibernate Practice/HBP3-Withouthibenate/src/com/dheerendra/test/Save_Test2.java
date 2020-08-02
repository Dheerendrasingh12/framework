package com.dheerendra.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dheerendra.domain.EmpDetails;

public class Save_Test2 {

	public static void main(String[] args) {
		
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		EmpDetails details=null;
		
		cfg=new Configuration();
		
		cfg=new Configuration();
		cfg.setProperty("hibernate.connection.driver_class","oracle.jdbc.driver.OracleDriver");
		cfg.setProperty("hibernate.connection.url","jdbc:oracle:thin:@localhost:1521:orcl");
		cfg.setProperty("hibernate.connection.username","scott");
		cfg.setProperty("hibernate.connection.password","root");
		cfg.setProperty("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
		cfg.setProperty("hibernate.show_sql","true");
		//add mapping file
		cfg.addFile("src/com/dheerendra/cfgs/Employee.hbm.xml");
			
		factory =cfg.buildSessionFactory();
		ses=factory.openSession();
		
		details=new EmpDetails();
		
		details.setNo(03);
		details.setFname("k");
		details.setLname("Dhakad");
		details.setMail("K@singh.com");
		
		ses.save(details);
		
		ses.flush();
		ses.close();
		factory.close();
		
		
	
	}
}
