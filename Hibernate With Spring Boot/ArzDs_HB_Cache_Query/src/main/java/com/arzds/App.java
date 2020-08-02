package com.arzds;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.arzds.model.Alien;
import com.arzds.model.Laptop;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Alien alien = null;
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class)
				.addAnnotatedClass(Laptop.class);

		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(con.getProperties())
				.buildServiceRegistry();

		SessionFactory factory = con.buildSessionFactory(registry);

		Session session = factory.openSession();

		session.beginTransaction();

		Query query = session.createQuery("from Alien ");
		query.setCacheable(true);
		alien = (Alien) query.uniqueResult();
		session.getTransaction().commit();
		session.close();
		System.out.println(alien);
		Session session2 = factory.openSession();

		session2.beginTransaction();

		Query query2 = session2.createQuery("from Alien ");
		query2.setCacheable(true);
		alien = (Alien) query2.uniqueResult();
		session2.getTransaction().commit();
		session2.close();
		System.out.println(alien);
	}
}
