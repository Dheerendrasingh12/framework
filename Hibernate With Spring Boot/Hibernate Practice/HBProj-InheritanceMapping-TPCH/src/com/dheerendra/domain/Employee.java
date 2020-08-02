package com.dheerendra.domain;

public class Employee extends Person{
	private double salary;
	private int department;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", department=" + department + "]";
	}
	

}
