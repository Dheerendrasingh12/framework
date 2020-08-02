package com.arzds.model;

import lombok.Data;

@Data
public class Product {
	private int prodId;
	private String prodName;
	private double prodCost;
	private double prodGst;
	private double prodDisc;
	
}
