package com.arzds;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class)
				.addAnnotatedClass(Laptop.class);

		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(con.getProperties())
				.buildServiceRegistry();

		SessionFactory factory = con.buildSessionFactory(registry);
		Session session = factory.openSession();
		Alien alien = (Alien) session.get(Alien.class, 12);

		System.out.println(alien.getName() );
		Collection<Laptop> collection= alien.getLaptops();

		for (Laptop laptop : collection) {
			System.out.println(laptop);
		}

		Transaction transaction = session.beginTransaction();

		transaction.commit();
	}
}
