package com.arzds.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	private int empId;
	private String empName;
	private double empSal;

	public Employee(String empName, int empId, double empSal) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSal = empSal;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
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

}
