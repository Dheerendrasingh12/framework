package com.dheerendra.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dheerendra.domain.EmpDetails;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg=cfg.configure("/com/dheerendra/cfgs/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session ses = factory.openSession();
/*
		EmpDetails ed=ses.load(EmpDetails.class,1);
		//EmpDetails ed=(EmpDetails)ses.get(EmpDetails.class,1);
		if(ed!=null){
			System.out.println(ed.getNo()+" "+ed.getFname()+" "+ed.getLname()+" "+ed.getMail());
		}
		else
			System.out.println("Record not Found");
*/		
		EmpDetails ed = new EmpDetails();
		ed.setNo(4);
		ed.setFname("so");
		ed.setLname("Singh");
		ed.setMail("Sonu@gmail.com");

		Transaction tx = null;
		try{
			tx=ses.beginTransaction();
			ses.save(ed);
		//	ses.persist(ed);
			tx.commit();
			System.out.println("Object SuccessFully Saved");
			
		}catch(Exception e){
			tx.rollback();
		}
		ses.close();
		factory.close();
	}

}
