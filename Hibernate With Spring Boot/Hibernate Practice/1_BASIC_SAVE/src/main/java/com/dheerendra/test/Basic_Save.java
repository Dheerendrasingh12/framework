package com.dheerendra.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dheerendra.domain.EmpDetails;

public class Basic_Save
{
    public static void main( String[] args )
    {
    	Configuration cfg=null;
    	SessionFactory factory=null;
    	Session ses=null;
    	EmpDetails emp=null;
    	Transaction tx=null;
    	int idVal=0;
    	
    	cfg=new Configuration();
    	cfg=  	cfg.configure("/com/dheerendra/cfgs/hibernate.cfg.xml");
    
    	factory=cfg.buildSessionFactory();
    	ses=factory.openSession();
    	emp=new EmpDetails();
    	
    	emp.setNo(12);
    	emp.setFname("Dheerendra");
    	emp.setLname("Singh");
    	emp.setMail("Dheerendra@gmail.com");
    	try {
    		tx=ses.beginTransaction();
    		idVal=(int) ses.save(emp);
    		System.out.println("Object save ");
    		
    		
    		
    	}catch (Exception e) {
    		tx.rollback();
    		System.out.println("sorry");
			// TODO: handle exception
		}
    	ses.close();
    	factory.close();
    }
}
