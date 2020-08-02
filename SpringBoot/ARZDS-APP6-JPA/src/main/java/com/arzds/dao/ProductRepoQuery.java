package com.arzds.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arzds.model.Product;

public interface ProductRepoQuery extends JpaRepository<Product, Long> {
	Product findByProdCode(String prodCode);

	List<Product> findByProdCodeLike(String pc);

	List<Product> findByProdCodeIsNull();

	List<Product> findByProdCodeGreaterThan(double cost);

	List<Product> findByProdCostIn(Collection<Double> cost);

	List<Product> findByProdIdOrProdCost(Long pid, double cost);

	List<Product> findByProdIdBetween(Long pid1, Long pid2);

	List<Product> findByProdCostLessThanOrderByProdCode(double cost);

}