package com.arzds.service;

import java.util.List;

import com.arzds.modle.Employee;

public interface EmployeeService {
	public Integer saveEmployee(Employee employee);

	public List<Employee> getAllEmp();

	public Employee getById(Integer empId);

	public void deleteEmp(Integer empId);

	public void updateEmp(Employee employee);
}
