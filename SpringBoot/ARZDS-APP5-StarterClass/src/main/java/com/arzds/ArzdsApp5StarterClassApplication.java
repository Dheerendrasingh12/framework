package com.arzds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.arzds.model.Admin;
import com.arzds.model.Product;

@SpringBootApplication
public class ArzdsApp5StarterClassApplication implements CommandLineRunner {
	@Autowired
	private Admin admin;
	@Autowired
	private Product product;


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Admin Obj " + admin);
		System.out.println("Product Obj " + product);

	}

public static void main(String[] args) {
	SpringApplication.run(ArzdsApp5StarterClassApplication.class, args);
}

	@Bean
	public Product prodObj() {
		Product product = new Product();
		product.setProdId(03);
		product.setProdName("Mobile");
		return product;
	}
}
