package com.arzds;

import javax.ws.rs.QueryParam;

public class Employee {
	private @QueryParam("empId") int id;
	private @QueryParam("empName") String name;
	private @QueryParam("empSal") double empSal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", empSal=" + empSal + "]";
	}

}
