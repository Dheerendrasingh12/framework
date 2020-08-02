package com.arzds;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
	@RequestMapping("/show")
	public String showHome(Model model) {
		model.addAttribute("msg", new Date());
		return "Home";
	}

	@RequestMapping("/one/{id}")
	public String showOnePage(@PathVariable Integer id, Model model) {
		System.out.println("In Controrler");
		Product product = new Product();
		product.setProdCode("Sedan");
		product.setProdCost(500000000);
		product.setProdId(id);
		model.addAttribute(product);

		return "ProductOne";
	}
}
