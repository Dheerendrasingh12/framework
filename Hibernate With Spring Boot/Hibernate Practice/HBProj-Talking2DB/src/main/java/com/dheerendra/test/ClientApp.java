package com.dheerendra.test;

import com.dheerendra.dao.EmployeeDAO;
import com.dheerendra.dao.EmployeeDAODFactory;
import com.dheerendra.utility.MysqlHibernateUtil;
import com.dheerendra.utility.OracleHibernateUtil;

public class ClientApp {

	public static void main(String[] args) {
		EmployeeDAO dao=EmployeeDAODFactory.getInstance();
		
		System.out.println(dao.transferEmployee(126));
	
		OracleHibernateUtil.closeSessionFactory();
		MysqlHibernateUtil.closeSeesionFactory();
	}
}
