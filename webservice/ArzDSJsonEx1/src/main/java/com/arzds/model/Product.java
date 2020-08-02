package com.arzds.model;

import java.util.List;

public class Product {
private int productId;
private String productName;
private List<Model> model;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public List<Model> getModel() {
	return model;
}
public void setModel(List<Model> model) {
	this.model = model;
}

}
