package com.arzds.dao.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.arzds.dao.ProductRepository;
import com.arzds.model.Product;
@Order(50)
@Component
public class BasicOperationImpl implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		productRepository.save(new Product("Pencil", 200.00, "A"));
		productRepository.save(new Product("Mobile", 69000.00, "B"));
		productRepository.save(new Product("Laptop", 112000.00, "B"));

		System.out.println("---------------------FIND---------------------------");

		Optional<Product> optional = productRepository.findById((long) 2);
		if (optional.isPresent())
			System.out.println(optional.get());
		else
			System.out.println("No Data Found");

		System.out.println("---------------------FIND-All --------------------------");
		productRepository.findAll().forEach(System.out::println);

		System.out.println("---------------------FIND-All --------------------------");
		/*
		 * productRepository.deleteById(3l); productRepository.deleteAll();
		 * productRepository.deleteAllInBatch();
		 */}

}
