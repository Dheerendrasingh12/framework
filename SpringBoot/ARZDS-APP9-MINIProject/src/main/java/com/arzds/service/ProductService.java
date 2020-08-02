package com.arzds.service;

import java.util.List;

import com.arzds.model.Product;

public interface ProductService {
	public int saveProduct(Product prod);

	public List<Product> getAll();

	public void deleteProductById(int id);

	public Product getProductById(int id);
}
