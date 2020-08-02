package com.arzds.model;

import javax.persistence.Embeddable;

@Embeddable
public class Name {
	private String fname;
	private String lName;
	private String mName;

	@Override
	public String toString() {
		return "Name [fname=" + fname + ", lName=" + lName + ", mName=" + mName + "]";
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

}
