package com.arzds.model;

public class Admin {
private int aid;
private String aName;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getaName() {
	return aName;
}
public void setaName(String aName) {
	this.aName = aName;
}
@Override
public String toString() {
	return "Admin [aid=" + aid + ", aName=" + aName + "]";
}

}
