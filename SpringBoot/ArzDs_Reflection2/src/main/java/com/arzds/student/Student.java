package com.arzds.student;

public class Student implements IModel{

	public Student() {
		super();
		// TODO Auto-generated constructor stub

	System.out.println("Student COnsturctor");}

	public String getModelName() {
		// TODO Auto-generated method stub
		return "Student";
	}

	public IModel getModelObj() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public String toString() {
		return "Student Object";
	}
	

}
