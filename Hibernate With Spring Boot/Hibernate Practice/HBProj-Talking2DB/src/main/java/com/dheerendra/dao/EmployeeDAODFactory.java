package com.dheerendra.dao;

public class EmployeeDAODFactory {

	public static EmployeeDAO getInstance() {
		return new EmployeeDAOImpl();
	}
}
