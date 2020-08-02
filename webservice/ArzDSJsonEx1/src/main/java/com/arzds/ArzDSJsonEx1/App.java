package com.arzds.ArzDSJsonEx1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

import com.arzds.model.Margin;
import com.arzds.model.Model;
import com.arzds.model.Product;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Margin margin = new Margin();
		margin.setMarginCode("H1A5G");
		margin.setMarginId(69);
		Margin margin1 = new Margin();
		margin1.setMarginCode("ACA5G");
		margin1.setMarginId(69);

		Margin margin2 = new Margin();
		margin2.setMarginCode("H162T");
		margin2.setMarginId(69);

		Map<Integer, Margin> marginMap = new HashMap<Integer, Margin>();
		marginMap.put(1, margin);
		marginMap.put(1, margin1);
		marginMap.put(1, margin2);

		Model model = new Model();
		model.setMarginMap(marginMap);
		model.setModelCode("HP-Laptop");
		model.setModelId(1001);
		Model model1 = new Model();
		Map<Integer, Margin> marginMap1 = new HashMap<Integer, Margin>();
		model1.setMarginMap(marginMap1);
		model1.setModelCode("Dell-Laptop");
		model1.setModelId(1002);

		List<Model> modelList = Arrays.asList(model, model1);

		Product product = new Product();
		product.setModel(modelList);
		product.setProductId(1);
		product.setProductName("Laptop");

	try {
		ObjectMapper mapper=new ObjectMapper();
		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(product));
	}catch (Exception e) {
		// TODO: handle exception
	}
	}
}
