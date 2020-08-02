package com.dheerendra.domain;

public class PhoneNumber {

	private long phone;
	private String numberType;


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public String getNumberType() {
		return numberType;
	}


	public void setNumberType(String numberType) {
		this.numberType = numberType;
	}


	public PhoneNumber() {
		System.out.println("PhoneNumber:0-param Constructor");
	}


	@Override
	public String toString() {
		return "PhoneNumber [phone=" + phone + ", numberType=" + numberType + "]";
	}

}
