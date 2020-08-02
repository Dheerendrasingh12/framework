package com.arzds.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arzds.dao.EmpDao;
import com.arzds.model.Employee;

@Service
public class EmpService {
	@Autowired
	private EmpDao dao;

	public List<Employee> getAllEmp() {
		return dao.getAllEmp();
	}

}
