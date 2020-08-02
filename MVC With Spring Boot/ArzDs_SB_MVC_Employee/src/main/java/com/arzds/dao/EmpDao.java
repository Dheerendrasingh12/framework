package com.arzds.dao;

import org.springframework.stereotype.Repository;

@Repository
public class EmpDao {
	private static final String Get_All_Emp_Details = "SELECT EMP_ID,EMP_NAME,EMP_SAL FROM EMPLOYEE";
	private JdbcTemplate jt;
}
