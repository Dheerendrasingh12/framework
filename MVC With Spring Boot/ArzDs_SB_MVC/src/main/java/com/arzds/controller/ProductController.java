package com.arzds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arzds.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;

	@RequestMapping("/product")
	public String getAllProduct(Model model) {
		model.addAttribute("products", productService.getAllProduct());
		return "product";
	}
}
