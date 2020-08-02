package com.dheerendra.test;

import com.dheerendra.dao.OtoMDAO;
import com.dheerendra.dao.OtoMDAOFactory;
import com.dheerendra.dao.OtoMDAOImpl;

public class ClientApp {

	public static void main(String[] args) {
		
		OtoMDAO dao=OtoMDAOFactory.getInstance();
		dao.saveData();
		
	}
}
