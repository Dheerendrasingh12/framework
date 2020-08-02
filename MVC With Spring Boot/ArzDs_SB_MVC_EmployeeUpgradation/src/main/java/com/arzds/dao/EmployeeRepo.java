package com.arzds.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arzds.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
