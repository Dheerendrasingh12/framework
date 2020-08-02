package com.arzds.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.arzds.model.Employee;

@Repository
public class EmpDao {
	private static final String Get_All_Emp_Details = "SELECT EMP_ID,EMP_NAME,EMP_SAL FROM EMPLOYEE";
	private JdbcTemplate jt;

	public List<Employee> getAllEmp() {
		setJt();
		List<Employee> data = jt.query(Get_All_Emp_Details, new RowMapper() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Employee employee = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3));
				return employee;
			}
		});
		return data;
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/arzds");
		dataSource.setUsername("root");
		dataSource.setPassword("root");

		return dataSource;
	}

	public void setJt() {
		this.jt = new JdbcTemplate(dataSource());
	}

}
