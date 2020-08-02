package com.arzds;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.arzds.modle.Laptop;
import com.arzds.modle.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Laptop laptop = new Laptop();
		laptop.setId(1002);
		laptop.setLname("Dell");
		Student student = new Student();
		student.setMarks(100);
		student.setName("ArzDs");
		student.setRollNo(12);
		student.getLaptop().add(laptop);
		laptop.getStud().add(student);

		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Laptop.class);

		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(con.getProperties())
				.buildServiceRegistry();

		SessionFactory factory = con.buildSessionFactory(registry);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(student);
		session.save(laptop);

		transaction.commit();

	}
}
