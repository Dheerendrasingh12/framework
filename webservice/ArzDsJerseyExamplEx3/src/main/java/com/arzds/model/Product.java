package com.arzds.model;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;
import javax.json.bind.annotation.JsonbTransient;
import javax.ws.rs.PathParam;

@JsonbPropertyOrder({ "pname", "price" })
public class Product {
	@JsonbTransient
	private @PathParam("prodId") int id;
	@JsonbProperty
	private @PathParam("price") String pname;
	@JsonbProperty()
	private @PathParam("mrp") double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", price=" + price + "]";
	}

}
