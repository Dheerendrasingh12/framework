package com.arzds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.arzds.model.Product;
import com.arzds.service.impl.ProductServiceImpl;

@Controller
@RequestMapping("/home")
public class ProductController {
	@Autowired
	private ProductServiceImpl productServiceImpl;

	@RequestMapping("/req")
	public String showReq(Model map) {
		map.addAttribute("product", new Product());
		return "Home";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveData(@ModelAttribute Product product, Model model) {
		int id = productServiceImpl.saveProduct(product);
		model.addAttribute("message", "Product '" + id + "' Created");
		model.addAttribute("Product", new Product());
		return "Home";
	}

	@RequestMapping("/all")
	public String showAll(Model model) {
		List<Product> data = productServiceImpl.getAll();
		model.addAttribute("list", data);
		return "Data";
	}

	@RequestMapping("/delete")
	public String removeProduct(@RequestParam Integer id) {
		productServiceImpl.deleteProductById(id);
		return "redirect:all";
	}

	@RequestMapping(value = "edit")
	public String showEdit(@RequestParam Integer id, Model map) {
		Product product = productServiceImpl.getProductById(id);
		map.addAttribute("product", product);
		map.addAttribute("Mode", "EDIT");
		return "Home";

	}
}
