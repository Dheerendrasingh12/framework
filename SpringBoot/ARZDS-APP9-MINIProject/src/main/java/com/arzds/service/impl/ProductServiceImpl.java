package com.arzds.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arzds.dao.ProductRepo;
import com.arzds.model.Product;
import com.arzds.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepo repo;

	@Transactional
	@Override
	public int saveProduct(Product prod) {
		// TODO Auto-generated method stub
		prod = repo.save(prod);
		return prod.getGst();
	}

	@Transactional
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Transactional
	@Override
	public void deleteProductById(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Transactional
	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		Optional<Product> product = repo.findById(id);
		Product p = product.get();
		return p;
	}

}
