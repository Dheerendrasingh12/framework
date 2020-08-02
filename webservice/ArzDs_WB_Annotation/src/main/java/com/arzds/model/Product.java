package com.arzds.model;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;
import javax.json.bind.annotation.JsonbTransient;
import javax.ws.rs.PathParam;

@JsonbPropertyOrder({ "pname", "pcost" })
public class Product {
	@JsonbTransient
	private @PathParam("prodId") int pid;
	@JsonbProperty("product-name")
	private @PathParam("prodName") String pname;
	@JsonbProperty("product-mrp")
	private @PathParam("prodCost") double pcost;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPcost() {
		return pcost;
	}

	public void setPcost(double pcost) {
		this.pcost = pcost;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + "]";
	}

}
