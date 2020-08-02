package com.arzds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	private int custId;
	private String custName;
	private String cn;
	@Autowired
	private TeChnologies technologies;

	public int getCustId() {
		return custId;
	}

	public TeChnologies getTechnologies() {
		return technologies;
	}

	public void setTechnologies(TeChnologies technologies) {
		this.technologies = technologies;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	public void display() {
		System.out.println("Customer object created sucessfully");
		technologies.tech();
	}
}
