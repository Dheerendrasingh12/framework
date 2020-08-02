package com.arzds.controller;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arzds.client.CouponRestCLient;
import com.arzds.exception.ProductNotFoundException;
import com.arzds.exception.ValidationError;
import com.arzds.model.Coupon;
import com.arzds.model.Product;
import com.arzds.service.ProductService;
import com.arzds.validator.ProductValidator;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import lombok.Delegate;

@RestController
@RequestMapping("/home/product")
public class ProductController {
	@Autowired
	private ProductService prodService;
	@Autowired
	private CouponRestCLient cLient;
	@Autowired
	private ProductValidator validator;

	@PostMapping("/save")
	public ResponseEntity<String> saveProduct(@RequestBody Product product, Errors errors) {
		validator.validate(product, errors);
		if (!errors.hasErrors()) {
			String res = cLient.checkExpired(product.getCoupon().getCouponCode());

			Coupon coupon = cLient.getById(product.getCoupon().getCouponCode());
			if (coupon == null) {
				return new ResponseEntity<>("Coupon Not Found", HttpStatus.OK);
			} else if (StringUtils.equalsIgnoreCase(res, "Expired")) {
				return new ResponseEntity<String>("Coupon Has been Expired", HttpStatus.OK);
			} else {
				double dis = coupon.getCouponDiscount();
				if (product.getCoupon().getIsValid()) {
					dis = 0;
				}
				double cost = product.getProdCost();
				product.setFinalCost(prodService.calculateDiscount(cost, dis));
				prodService.saveProduct(product);
				return new ResponseEntity<String>("Product has been added sucessfully", HttpStatus.OK);
			}
		} else {
			throw new ValidationError(" Please Provide Valid details");
		}
	}

	@GetMapping("/apply")
	public ResponseEntity<Double> applyCoupon(double cost, double disc) {
		return new ResponseEntity<Double>(prodService.calculateDiscount(cost, disc), HttpStatus.OK);
	}

	public ResponseEntity<Product> getProductException(int id) {
		throw new ProductNotFoundException("No Product Found");
	}

	@GetMapping("/getById/{id}")
	@HystrixCommand(fallbackMethod = "getProductException")
	public ResponseEntity<Product> getProdById(@PathVariable int id) {
		Product product = prodService.getProdById(id);
		if (product != null)
			return new ResponseEntity<Product>(product, HttpStatus.OK);
		else
			throw new ProductNotFoundException("No Product Found");
	}

	@GetMapping("/all")
	public ResponseEntity<List<Product>> getAllProd() {
		return new ResponseEntity<List<Product>>(prodService.getAllProduct(), HttpStatus.OK);
	}

	@PostMapping("/update")
	public ResponseEntity<String> updateProd(@RequestBody Product product, Errors errors) {
		if (prodService.isExist(product.getProdId())) {
			validator.validate(product, errors);
			if (!errors.hasErrors()) {
				prodService.updateProduct(product);
				return new ResponseEntity<String>("Product has been saved sucessfully", HttpStatus.OK);
			} else
				throw new ValidationError("Please Provide valid Details");

		} else
			throw new ProductNotFoundException("No Product found");

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> removeProduct(@PathVariable Integer id) {
		if (prodService.isExist(id)) {
			prodService.deleteProd(id);
			return new ResponseEntity<String>("Product Deleted Sucessfully", HttpStatus.OK);
		} else
			throw new ProductNotFoundException("No product found");
	}
}
