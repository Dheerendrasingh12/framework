package com.dheerendra.dao;

public interface OtoMDAOFactory {
	
	public static OtoMDAO getInstance() {
		return new OtoMDAOImpl();
		
	}

}
