package com.arzds.service;

import java.util.List;

import com.arzds.model.Employee;

public interface EmpService {
	public int saveEmp(Employee employee);

	public List<Employee> getEmp();

	public int update(Employee employee);

	public int delete(int id);

	public Employee getEmpById(int id);

	public boolean isPresent(int id);
}
