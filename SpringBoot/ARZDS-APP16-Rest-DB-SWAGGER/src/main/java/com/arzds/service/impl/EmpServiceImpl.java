package com.arzds.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arzds.dao.EmpRepository;
import com.arzds.model.Employee;
import com.arzds.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpRepository repo;

	@Transactional
	@Override
	public int saveEmp(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee).getEmpId();
	}

	@Transactional
	@Override
	public List<Employee> getEmp() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Transactional
	@Override
	public int update(Employee employee) {
		// TODO Auto-generated method stub
			return repo.save(employee).getEmpId();
	}

	@Transactional
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
			repo.deleteById(id);
			return 1;
	}

	@Transactional(readOnly = true)
	@Override
	public Employee getEmpById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> optional = repo.findById(id);
		if (optional.isPresent())
			return optional.get();

		return null;

	}

	@Transactional(readOnly = true)
	@Override
	public boolean isPresent(int id) {
		// TODO Auto-generated method stub
		return repo.existsById(id);
	}

}
