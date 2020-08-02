package com.arzds.controller;

import java.util.List;

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

import com.arzds.exception.CouponNotFoundException;
import com.arzds.exception.ValidationError;
import com.arzds.model.Coupon;
import com.arzds.service.CouponService;
import com.arzds.validation.CouponValidator;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/home/coupon")
public class Controller {
	@Autowired
	private CouponService couponService;

	@Autowired
	private CouponValidator couponValidator;

	@PostMapping("/save")
	public ResponseEntity<String> saveCoupon(@RequestBody Coupon coupon, Errors errors) {
		couponValidator.validate(coupon, errors);
		if (!errors.hasErrors()) {
			couponService.saveCoupon(coupon);
			return new ResponseEntity<String>("Coupon has been Added Succesfully ", HttpStatus.OK);
		} else
			throw new ValidationError("Please Provide Valid Details");
	}

	@GetMapping("/check/{code}")
	public String checkCouponExipryDate(@PathVariable String code) {
		return couponService.isExpired(code) ? "is not Expired" : "Expired";
	}

	// fallback Method
	public Coupon getCouponException(Integer id) {
		throw new CouponNotFoundException("No Coupon Found for " + id);
	}

	@GetMapping("/getOne/{id}")
	@HystrixCommand(fallbackMethod = "getCouponException")
	public Coupon getById(@PathVariable Integer id) {
		Coupon coupon = couponService.getCouponbyId(id);
		if (coupon != null)
			return coupon;
		else
			throw new CouponNotFoundException("No COupon Found");
	}

//fallbackMethod
	public Coupon  getCouponCodeException(String code) {
		throw new CouponNotFoundException("No Coupon Found");
	}

	@GetMapping("/getByCode/{code}")
	@HystrixCommand(fallbackMethod = "getCouponCodeException")
	public Coupon getByCode(@PathVariable String code) {
		Coupon coupon = couponService.getCouponByCode(code);
		if (coupon != null) {
			return coupon;
		} else
			throw new CouponNotFoundException("No Coupon Found");
	}

	@GetMapping("getAll")
	public ResponseEntity<List<Coupon>> getAllCoupon() {
		return new ResponseEntity<List<Coupon>>(couponService.getAllCoupon(), HttpStatus.OK);
	}

	@PostMapping("/update")
	public ResponseEntity<String> updateCoupon(@RequestBody Coupon coupon, Errors errors) {
		if (couponService.isExist(coupon.getCouponId())) {
			couponValidator.validate(coupon, errors);
			if (!errors.hasErrors()) {
				couponService.saveCoupon(coupon);
				return new ResponseEntity<String>("Coupon has been Updated Sucessfully", HttpStatus.OK);
			} else {
				throw new CouponNotFoundException("No Coupon Found");
			}
		} else {
			throw new CouponNotFoundException("No COupon Found");
		}
	}

@DeleteMapping("/delete/{id}")
public ResponseEntity<String> delete(@PathVariable Integer id){
	if(couponService.isExist(id)) {
		couponService.deleteCouponById(id);
		return new ResponseEntity<String>("Coupon Has Been Deleted Sucessfull",HttpStatus.OK);
		
	}else
		throw new CouponNotFoundException("No Coupon Found");
	
}
}