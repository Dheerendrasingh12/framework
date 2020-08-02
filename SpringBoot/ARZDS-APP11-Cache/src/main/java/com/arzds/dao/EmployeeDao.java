package com.arzds.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arzds.modle.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
