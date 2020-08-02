package com.dheerendra.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dheerendra.domain.PhoneNumber;
import com.dheerendra.domain.User;
import com.dheerendra.utility.HibernateUtil;

public class OtoMDAOImpl implements OtoMDAO{

	@Override
	public void saveData() {
		Session ses=null;
		User user=null;
		PhoneNumber ph1=null,ph2=null,ph3=null,ph4=null;
		Transaction tx=null;
		ses=HibernateUtil.getSession();
		user=new User();
		user.setUserId(12);
		user.setFistName("Dheerendra Singh");
		ph1=new PhoneNumber();
		ph1.setPhone(99999999);
		ph1.setNumberType("office1");
		
		ph2=new PhoneNumber();
		ph2.setPhone(88888888);
		ph2.setNumberType("residence");
		
		Set<PhoneNumber>childs=new HashSet<PhoneNumber>();
		
		childs.add(ph1);
		childs.add(ph2);
		user.setPhones(childs);
		
		User user1=new User();
		user1.setUserId(1002);
		
		user1.setFistName("gourav");
		ph3=new PhoneNumber();
		ph3.setPhone(77777777);
		ph3.setNumberType("office");
		
		ph4=new PhoneNumber();
		ph4.setPhone(66666666);
		ph4.setNumberType("home");
		
		Set<PhoneNumber> childs1=new HashSet<>();
		childs1.add(ph3);
		childs1.add(ph4);
		try {
			tx=ses.beginTransaction();
			ses.save(user1);
			ses.save(user);
			tx.commit();
			System.out.println("Object are saved");
			
		}catch (Exception e) {
			tx.rollback();
			System.out.println("Object are not saved ");
		}
		HibernateUtil.closeSession(ses);
		
	}

	@Override
	public void loadData() {
		// TODO Auto-generated method stub
		
	}
	

}
