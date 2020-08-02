package com.arzds.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arzds.dao.EmployeeRepo;
import com.arzds.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo repo;

	public int save(Employee emp) {
		repo.save(emp);
		return 1;
	}

	public int update(Employee p) {
		repo.save(p);
		return 1;
	}

	public void delete(int id) {
		repo.deleteById(id);

	}

	public Employee getEmployeeById(int id) {
		Optional<Employee> optional = repo.findById(id);
		Employee emp = optional.get();
		return emp;
	}

	public List<Employee> getEmployeeloyees() {
		return repo.findAll();
	}
}
