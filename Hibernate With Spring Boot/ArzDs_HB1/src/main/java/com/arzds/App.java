package com.arzds;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.arzds.model.Alien;
import com.arzds.model.Laptop;
import com.arzds.model.Name;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Alien alien = new Alien();
		alien.setId(12);
		alien.setColor("Red");
		Name name = new Name();
		name.setFname("corna");
		name.setlName("virus");
		alien.setName(name);
		Laptop laptop = new Laptop();
		laptop.setId(1212);
		laptop.setLname("Apple");
		alien.getLaptops().add(laptop);

		laptop.setAlien(alien);

		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class)
				.addAnnotatedClass(Laptop.class);

		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(con.getProperties())
				.buildServiceRegistry();

		SessionFactory factory = con.buildSessionFactory(registry);
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(laptop);
		session.save(alien);
		txn.commit();

	}
}