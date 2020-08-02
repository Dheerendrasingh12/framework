package com.arzds;

import org.springframework.stereotype.Component;

@Component
public class TeChnologies {

	private int techId;
	private String techName;
	public int getTechId() {
		return techId;
	}
	public void setTechId(int techId) {
		this.techId = techId;
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		this.techName = techName;
	}
	public void tech() {
		System.out.println("Object Technologies created Sucessfully");
	}
}
