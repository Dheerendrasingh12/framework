package com.arzds.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.arzds.dao.ProductRepoQuery;
import com.arzds.model.Product;
@Order(60)
@Component
public class ProdRepoQueryImpl implements CommandLineRunner {
	@Autowired
	private ProductRepoQuery productRepo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stu
		Product product = productRepo.findByProdCode("A");
		System.out.println(product.toString());
		productRepo.findByProdCodeLike("B").forEach(System.out::println);
		;
		productRepo.findByProdCodeIsNull().forEach(System.out::println);
		productRepo.findByProdCodeGreaterThan(80000.00).forEach(System.out::println);
		// productRepo.findByProdCostIn(new Co5000.00).forEach(System.out::println);;
		productRepo.findByProdIdBetween(2l, 3l).forEach(System.out::println);
		;
		productRepo.findByProdCostLessThanOrderByProdCode(80000.00).forEach(System.out::println);

	}

}
