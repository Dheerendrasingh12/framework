package com.dheerendra.domain;

public class Insurance_Policy {
	
	private int policyId;
	private String policyName;
	private int tenure;
	private int premium;
	public int getPolicyId() {
		return policyId;
	}
	public Insurance_Policy() {
		System.out.println("o-param constructor");
	}
	@Override
	public String toString() {
		return "Insurance_Policy [policyId=" + policyId + ", policyName=" + policyName + ", tenure=" + tenure
				+ ", premium=" + premium + "]";
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public int getPremium() {
		return premium;
	}
	public void setPremium(int premium) {
		this.premium = premium;
	}

}
