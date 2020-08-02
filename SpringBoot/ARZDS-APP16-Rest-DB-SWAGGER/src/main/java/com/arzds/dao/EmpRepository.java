package com.arzds.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arzds.model.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer>{

}
