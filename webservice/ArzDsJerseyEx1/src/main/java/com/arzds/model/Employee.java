package com.arzds.model;

import javax.ws.rs.QueryParam;

public class Employee {

	private @QueryParam("emiId") int empId;
	private @QueryParam("eName") String ename;
	private @QueryParam("eSal") double eSal;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double geteSal() {
		return eSal;
	}
	public void seteSal(double eSal) {
		this.eSal = eSal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", eSal=" + eSal + "]";
	}
	
	
}
