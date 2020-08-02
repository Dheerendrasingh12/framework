package com.arzds;

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
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory fac = con.buildSessionFactory(reg);
		Session ses = fac.openSession();

		Transaction txn = ses.beginTransaction();
		Alien alien = (Alien) ses.get(Alien.class, 12);
		System.out.println(alien);
		alien = (Alien) ses.get(Alien.class, 10);
		System.out.println(alien);
		alien = (Alien) ses.get(Alien.class, 12);
		System.out.println(alien);

		Session ses2 = fac.openSession();
		ses2.beginTransaction();
		alien = (Alien) ses2.get(Alien.class, 10);
		System.out.println(alien);
		alien = (Alien) ses2.get(Alien.class, 12);
		System.out.println(alien);
		System.out.println(ses2.getCacheMode());
		ses2.getTransaction().commit();

		txn.commit();
	}

}
