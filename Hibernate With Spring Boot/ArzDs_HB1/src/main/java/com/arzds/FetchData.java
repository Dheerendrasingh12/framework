package com.arzds;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.arzds.model.Alien;

public class FetchData {
	public static void main(String[] args) {
		Alien alien = new Alien();
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(con.getProperties())
				.buildServiceRegistry();

		SessionFactory factory = con.buildSessionFactory(registry);
		Session ses = factory.openSession();

		Transaction txn = ses.beginTransaction();
		alien = (Alien) ses.get(Alien.class, 1);
		
		txn.commit();
		System.out.println(alien);
	}
}
