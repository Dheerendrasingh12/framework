package com.arzds.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.arzds.model.Product;
import com.arzds.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	private Map<Integer, Product> allProduct;

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return new ArrayList<>(allProduct.values());
	}

	private void addProduct() {
		allProduct = new HashMap<>();
		Product product = new Product();
		product.setId(1);
		product.setDescription("utensil");
		product.setPrice(new BigDecimal(800));
		product.setUrl("www.google.com/utensil");
		allProduct.put(product.getId(), product);

		product = new Product();
		product.setId(2);
		product.setDescription("induction cooktop");
		product.setPrice(new BigDecimal(1657));
		product.setUrl("www.google.com/induction-cooktop");
		allProduct.put(product.getId(), product);
		product = new Product();
		product.setId(3);
		product.setDescription("noise earbuds x3");
		product.setPrice(new BigDecimal(4800));
		product.setUrl("www.google.com/noisx3");
		allProduct.put(product.getId(), product);
		product = new Product();
		product.setId(4);
		product.setDescription("Apple se");
		product.setPrice(new BigDecimal(40000));
		product.setUrl("www.google.com/applese");
		allProduct.put(product.getId(), product);
		product = new Product();
		product.setId(5);
		product.setDescription("Iphone 12");
		product.setPrice(new BigDecimal(52000));
		product.setUrl("www.google.com/iphone12");
		allProduct.put(product.getId(), product);
		product = new Product();
		product.setId(6);
		product.setDescription("royal Enfield");
		product.setPrice(new BigDecimal(198000));
		product.setUrl("www.google.com/stealth black royal enfield");
		allProduct.put(product.getId(), product);
	}

	public ProductServiceImpl() {
		addProduct();
		// TODO Auto-generated constructor stub
	}

}
