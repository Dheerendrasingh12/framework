package com.arzds.dao.impl;

import java.util.List;
import java.util.Objects;

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
		List<Product> listData = productRepo.getAllProduct("A", "B");
		for (Product product : listData) {
			System.out.println(product.toString());
		}
		List<Object[]> list = productRepo.getAllProdData("B");
		for (Object[] objects : list) {
			System.out.println(objects.toString());
		}
		productRepo.getAllProdData("A").stream().map((ob) -> ob[0] + "," + ob[1]).forEach(System.out::println);

		productRepo.updateProduct("TC", 1l);
		//productRepo.deleteProduct(2l);
		productRepo.deleteAllInBatch();
	}

}
