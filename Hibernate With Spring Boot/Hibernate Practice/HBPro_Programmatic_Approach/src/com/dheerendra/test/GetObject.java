		package com.dheerendra.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dheerendra.domain.EmpDetails;

public class GetObject {
	public static void main(String[] args) {
		
		Configuration cfg=null;
		SessionFactory factory=null;
		Session ses=null;
		EmpDetails details=null;
		Transaction tx=null;
		
		cfg=new Configuration();
		
		cfg.setProperty("hibernate.connection.driver_class", "oracle.jdbc.driver.OracleDriver");
		cfg.setProperty("hibernate.connection.url", "jdbc:oracle:thin:@localhost:1521:orcl");
		cfg.setProperty("hibernate.connection.username", "scott");
		cfg.setProperty("hibernate.connection.password", "root");
		
		cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		
		cfg.setProperty("hibernate.show_sql", "true");
		cfg.setProperty("hibernate.format_sql", "true");
		
		cfg.addFile("src/com/dheerendra/cfgs/Employee.hbm.xml");
		
		factory =cfg.buildSessionFactory();
		ses=factory.openSession();
		
		details=ses.get(EmpDetails.class, 2);
		
		if(details!=null) {
			System.out.println(details);
		}else
			System.out.println("Record not founde");
		ses.close();
		factory.close();
	}
	
	
}
