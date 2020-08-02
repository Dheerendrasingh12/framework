package com.arzds.service;

import java.util.List;

import com.arzds.model.Product;

public interface ProductService {
	public Product saveProduct(Product product);

	public Product updateProduct(Product product);

	public Product getProdById(int id);

	public void deleteProd(int id);

	public List<Product> getAllProduct();

	public boolean isExist(int id);

	public double calculateDiscount(double cost, double disc);
}
