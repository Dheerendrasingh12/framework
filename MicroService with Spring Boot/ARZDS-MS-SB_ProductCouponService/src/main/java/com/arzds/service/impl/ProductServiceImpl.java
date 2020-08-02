package com.arzds.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arzds.model.Product;
import com.arzds.repo.ProductRepository;
import com.arzds.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository repo;

	@Override
	@Transactional
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

	@Override
	@Transactional
	@CachePut(value = "product-cache", key = "#product.prodId")
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

	@Override
	@Transactional(readOnly = true)
	@Cacheable(value = "product-cache", key = "#prodId")
	public Product getProdById(int id) {
		// TODO Auto-generated method stub
		Optional<Product> optional = repo.findById(id);
		return optional.isPresent() ? optional.get() : null;
	}

	@Override
	@Transactional
	@CacheEvict(value = "product-cache", key = "#prodId")
	public void deleteProd(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public boolean isExist(int id) {
		// TODO Auto-generated method stub
		return repo.existsById(id);
	}

	@Override
	public double calculateDiscount(double cost, double disc) {
		// TODO Auto-generated method stub
		double dCost = cost * disc / 100;

		return (cost - dCost);
	}

}
