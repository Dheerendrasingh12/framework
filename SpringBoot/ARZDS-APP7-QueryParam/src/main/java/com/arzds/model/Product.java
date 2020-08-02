package com.arzds.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue
	private long prodId;
	private String prodName;
	private Double prodCost;
	private String prodCode;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(long prodId) {
		super();
		this.prodId = prodId;
	}

	public Product(String prodName, Double prodCost, String prodCode) {
		super();
		this.prodName = prodName;
		this.prodCost = prodCost;
		this.prodCode = prodCode;
	}

	public Product(long prodId, String prodName, Double prodCost, String prodCode) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCost = prodCost;
		this.prodCode = prodCode;
	}

	public long getProdId() {
		return prodId;
	}

	public void setProdId(long prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public Double getProdCost() {
		return prodCost;
	}

	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodCost=" + prodCost + ", prodCode="
				+ prodCode + "]";
	}

}
