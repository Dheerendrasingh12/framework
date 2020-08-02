package com.arzds.controller;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.arzds.model.Customer;
import com.arzds.repository.CustomerRepo;

@Controller
public class FormCtrl {
	@Autowired
	CustomerRepo repo;

	@RequestMapping("/")
	public String myHome() {
		return "custForm";
	}

	@RequestMapping("/details")
	public String myHome(Customer customer) {
		repo.save(customer);
		return "custForm";
	}

	@RequestMapping("/getdetails")
	public String getDetails() {
		return "viewCustomer";
	}

	@PostMapping("/getdetails")
	public ModelAndView viewDetails(@RequestParam int custId) {
		ModelAndView view = new ModelAndView("Retrive");
		Customer customer = repo.findById(custId).orElse(null);
		view.addObject(customer);
		return view;
	}

	@RequestMapping("/customers")
	@ResponseBody
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getCustomers() {

		return repo.findAll();
	}

	@RequestMapping("/customers/{custId}")
	@ResponseBody
	@Consumes(MediaType.APPLICATION_JSON)
	public Optional<Customer> getCustById(@PathVariable("custId") int custId) {
		return repo.findById(custId);
	}

	@RequestMapping("/cust/{custId}")
	@ResponseBody
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity<Object> getCustomersById(@PathVariable("custId") int custId) {
		return new ResponseEntity<Object>(repo.findById(custId).toString(), HttpStatus.OK);
	}

	@PostMapping("/customers")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer saveCustomers(@RequestBody Customer customer) {

		repo.save(customer);
		return customer;
	}

	@DeleteMapping("/customers/{custId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer deleteCustomers(@PathVariable("custId") int custId) {
		Customer customer = repo.getOne(custId);
		repo.delete(customer);

		return customer;
	}
	@PutMapping("/customers")
	@Consumes(MediaType.APPLICATION_JSON)
	public Customer updateCustomers(@RequestBody Customer customer) {
		repo.save(customer);
		return customer;
	}
}
