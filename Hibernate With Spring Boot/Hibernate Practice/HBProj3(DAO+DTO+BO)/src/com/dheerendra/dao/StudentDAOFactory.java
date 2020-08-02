package com.dheerendra.dao;


public class StudentDAOFactory{
	
	public static StudentDAO getInstance() {
		return new StudentDAOImp();
	}
}
