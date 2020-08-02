package com.dheerendra.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dheerendra.bo.StudentBO;
import com.dheerendra.utility.HibernateUtil;

public class StudentDAOImp implements StudentDAO{

	@Override
	public int insert(StudentBO bo) {
		Session ses=null;
		Transaction tx=null;
		int no=0;
		ses=HibernateUtil.getSession();
		try {
			tx=ses.beginTransaction();
			no=(int) ses.save(bo);
			tx.commit();
		}catch (Exception e) {
		tx.rollback();
			// TODO: handle exception
		}
		
		HibernateUtil.closeSession(ses);
		return no;
	}

	}
