package com.dheerendra.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dheerendra.domain.EmpDetails;
import com.dheerendra.utility.MysqlHibernateUtil;
import com.dheerendra.utility.OracleHibernateUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	public String transferEmployee(int eid) {
		
		Session oraSes=null;
		
		Session mySes=null;
		EmpDetails emp=null;
		Transaction tx=null;
		
		oraSes=OracleHibernateUtil.getSession();
		
		emp=oraSes.get(EmpDetails.class,eid);
		mySes=MysqlHibernateUtil.getSession();
		
		try {
			tx=mySes.beginTransaction();
			mySes.save(emp);
			
			tx.commit();
		}catch (Exception e) {
			tx.rollback();
			// TODO: handle exception
		}
		
		MysqlHibernateUtil.closeSession(oraSes);
		try {
			
			tx=oraSes.beginTransaction();
			
			oraSes.delete(emp);
			tx.commit();
			
		}catch (Exception e) {
			tx.rollback();
			
			// TODO: handle exception
		}
		OracleHibernateUtil.closeSession(mySes);
		
		return emp.getEid()+ " is successfully transfer "+emp.getFirstname();
	}

}
