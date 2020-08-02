package com.arzds;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
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
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Laptop.class);
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(con.getProperties())
				.buildServiceRegistry();

		SessionFactory factory = con.buildSessionFactory(registry);
		Session session = factory.openSession();
		session.beginTransaction();
		/*
		 * SQLQuery query =
		 * session.createSQLQuery("select * from student where marks> :marks");
		 * query.addEntity(Student.class); query.setParameter("marks", 60);
		 * List<Student> studentList = query.list();
		 * 
		 * for (Student student : studentList) { System.out.println(student); }
		 */

		SQLQuery query = session.createSQLQuery("select name,marks from student where marks> :marks");
		// query.addEntity(Student.class);
		query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		query.setParameter("marks", 60);
		List studentList = query.list();

		for (Object student : studentList) {
			Map data = (Map) student;
			System.out.println(data.get("name") + "  " + data.get("marks                                                                                                                                                    "));
		}

		session.getTransaction().commit();

	}
}
