package com.dheerendra.domain;

public class LucyCoupon {
	
	private String no;
	private String productName;
	private int productId;
	private float productAmt;
	public LucyCoupon() {
		System.out.println("0-param constructor");
	}
	@Override
	public String toString() {
		return "LucyCoupon [no=" + no + ", productName=" + productName + ", productId=" + productId
				+ ", productAmt=" + productAmt + "]";
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public float getProductAmt() {
		return productAmt;
	}
	public void setProductAmt(float productAmt) {
		this.productAmt = productAmt;
	}}
