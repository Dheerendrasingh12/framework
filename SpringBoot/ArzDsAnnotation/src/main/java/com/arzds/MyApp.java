package com.arzds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.arzds.model.Admin;
import com.arzds.model.Product;

@SpringBootApplication
public class MyApp implements CommandLineRunner {
	@Autowired
	private Product prod;
	@Autowired
	private Admin admin;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("from Starter " + prod);
		System.out.println("from Starter " + admin);
	}

	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}

	@Bean
	public Product getObject() {
		Product product = new Product();
		product.setProdId(03);
		product.setProdName("DsArz");
		return product;
	}

}
