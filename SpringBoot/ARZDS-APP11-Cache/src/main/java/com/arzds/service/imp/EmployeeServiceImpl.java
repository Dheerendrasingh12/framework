package com.arzds.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arzds.dao.EmployeeDao;
import com.arzds.modle.Employee;
import com.arzds.service.EmployeeService;
import com.hazelcast.core.ReadOnly;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao empTemplate;

	@Override
	@Transactional
	public Integer saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return empTemplate.save(employee).getEmpId();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return empTemplate.findAll();

	}

	@Override
	@Transactional(readOnly = true)
	@Cacheable(value = "emp-cache", key = "#empId#")
	public Employee getById(Integer empId) {
		// TODO Auto-generated method stub
		Optional<Employee> optional = empTemplate.findById(empId);
		if (optional.isPresent())
			return optional.get();

		return null;
	}

	@Override
	@Transactional
	@CacheEvict(value = "emp-cache", key = "#empId")
	public void deleteEmp(Integer empId) {
		// TODO Auto-generated method stub
		empTemplate.deleteById(empId);
	}

	@Override
	@Transactional
	@CachePut(value = "emp-cache", key = "#empId")
	public void updateEmp(Employee employee) {
		// TODO Auto-generated method stub
		empTemplate.save(employee);
	}

}
