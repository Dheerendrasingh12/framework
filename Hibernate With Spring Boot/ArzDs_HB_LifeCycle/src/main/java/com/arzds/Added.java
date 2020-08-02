package com.arzds;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.arzds.model.Laptop;

/**
 * Hello world!
 *
 */
public class Added {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class);
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(con.getProperties())
				.buildServiceRegistry();

		SessionFactory fac = con.buildSessionFactory(registry);
		Session session = fac.openSession();
		session.beginTransaction();
		Random ran = new Random();
		for (int i = 100; i < 110; i++) {
			Laptop laptop = new Laptop();
			laptop.setLapId(i);
			laptop.setName("Name " + i);
			laptop.setPrice(ran.nextDouble()*100000);
			session.save(laptop);
		}
		session.getTransaction().commit();

	}
}
