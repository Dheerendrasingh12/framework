package com.arzds.model;

import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Employee {
	@JsonIgnore //if Run ListMapTest otherwise it will print this key and value =0
	private int empId;
	@JsonIgnore //if Run ListMapTest
	private String empName;
	private double empSal;
	@JsonIgnore
	private String empPwd;
	private Address address;
	private List<Address> empList;
	private Map<String, Integer> empMap;
	
	
	
	public List<Address> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Address> empList) {
		this.empList = empList;
	}
	public Map<String, Integer> getEmpMap() {
		return empMap;
	}
	public void setEmpMap(Map<String, Integer> empMap) {
		this.empMap = empMap;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getEmpPwd() {
		return empPwd;
	}
	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}


}
