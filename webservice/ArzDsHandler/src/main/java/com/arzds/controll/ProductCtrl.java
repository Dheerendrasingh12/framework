package com.arzds.controll;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arzds.model.Product;

@RestController
public class ProductCtrl {
	@Value("${spring.application.name}")
	private String appName;
	@Value("${server.port}")
	private String portNo;

	private static Map<String, Product> products = new HashMap<>();
	static {
		Product honey = new Product();
		honey.setId("1");
		honey.setName("Honey");
		products.put(honey.getId(), honey);

		Product almond = new Product();
		almond.setId("2");
		almond.setName("Almond");
		products.put(almond.getId(), almond);
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public ResponseEntity<Object> getProductDetails() {
		System.out.println("Product Controller");
		return new ResponseEntity<Object>(products.values(), HttpStatus.OK);
	}

	@RequestMapping("/")
	public String getAppDetails() {
		return ("ArzDs ---->> App Name: " + appName + " PortNo :" + portNo);
	}
}