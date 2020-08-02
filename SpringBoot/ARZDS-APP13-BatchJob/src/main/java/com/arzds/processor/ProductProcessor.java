package com.arzds.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.arzds.model.Product;

@Component
public class ProductProcessor implements ItemProcessor<Product, Product> {

	@Override
	public Product process(Product item) throws Exception {
		// TODO Auto-generated method stub
		item.setProdGst(item.getProdCost() * 0.12);
		item.setProdDisc(item.getProdCost() * 0.25);
		return item;
	}

}
