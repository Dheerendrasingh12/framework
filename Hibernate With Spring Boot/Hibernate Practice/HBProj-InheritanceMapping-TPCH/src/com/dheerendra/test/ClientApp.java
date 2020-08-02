package com.dheerendra.test;

import com.dheerendra.dao.InhDAO;
import com.dheerendra.dao.InhDAOFactory;
import com.dheerendra.utility.HibernateUtil;

public class ClientApp {
	
	public static void main(String[] args) {
		InhDAO dao=InhDAOFactory.getInstance();
		
		dao.saveData();
		
		dao.displayData();
		
		HibernateUtil.closeSessionFactory();
	}

}
