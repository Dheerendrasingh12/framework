package com.dheerendra.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dheerendra.domain.Customer;
import com.dheerendra.domain.Employee;
import com.dheerendra.domain.Person;
import com.dheerendra.utility.HibernateUtil;

public class InhDAOImpl implements InhDAO {

	@Override
	public void saveData() {
		Session ses=HibernateUtil.getSession();
		
		Person per=new Person();
		
		per.setId(12);
		per.setName("Dheerendra");
		per.setCompany("Google");
		Employee emp=new Employee();
		emp.setDepartment(101);
		emp.setSalary(91212);
		emp.setId(13);
		emp.setName("K");
		emp.setCompany("Microsoft");
		
		Customer cus=new Customer();
		cus.setId(14);
		cus.setName("Singh");
		cus.setCompany("Wipro");
		cus.setAddress("hyd");
		
		Transaction tx=null;
		try {
			
			tx=ses.beginTransaction();
			ses.save(per);
			ses.save(emp);
			ses.save(cus);
			
			tx.commit();
			System.out.println("Object successfuly saved");
			
		}catch (Exception e) {
			tx.rollback();
			// TODO: handle exception
		}
		
		HibernateUtil.closeSession(ses);
	}

	@Override
	public void displayData() {
		Session ses=HibernateUtil.getSession();
		Query query1=ses.createQuery("from Person");
		List<Person> list1=query1.list();
		for(Person per:list1) {
			System.out.println(per);
		}
		
		System.out.println("---------------------------");
		Query query2=ses.createQuery("from Customer");
		List<Customer> list2=query2.list();
		for(Customer cus:list2) {
			System.out.println(cus);
		}
		
		System.out.println("--------------------");
		Query query3=ses.createQuery("from Employee");
		List<Employee> list3=query3.list();
		for(Employee emp:list3) {
			System.out.println(emp);
		}
	
		HibernateUtil.closeSession(ses);
	}

}
