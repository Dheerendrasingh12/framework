package com.arzds;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.arzds.model.Laptop;
import com.arzds.model.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Laptop.class);
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();

		SessionFactory factory = configuration.buildSessionFactory(registry);

		Session session = factory.openSession();
		session.beginTransaction();

		/*
		 * Query query = session.createQuery("from Student where marks >50");
		 * List<Student> students = query.list(); for (Student student : students) {
		 * System.out.println(student);
		 * 
		 * }
		 * 
		 *//*
			 * Query query =
			 * session.createQuery("select rollNo,name,marks from Student where  marks>60");
			 * List<Object[]> stu = (List<Object[]>) query.list(); for (Object[] objects :
			 * stu) { for (Object objects2 : objects) { System.out.print(objects2 +" "); }
			 * System.out.println(); }
			 * 
			 */
		int whereClause = 60;
		Query query = session.createQuery(" select sum(marks) from Student where marks> :whereClause");
		query.setParameter("whereClause", whereClause);
		Long sum = (Long) query.uniqueResult();
		System.out.println("sum " + sum);

		session.getTransaction().commit();
		session.close();

	}
}
