package com.dheerendra.dao;

public class InhDAOFactory {

	public static InhDAO getInstance() {
		return new InhDAOImpl();
	}
}
