package com.arzds.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.arzds.exception.ApiError;
import com.arzds.exception.CouponNotFoundException;
import com.arzds.exception.ValidationError;

@RestControllerAdvice
public class ExceptionController {
	@Autowired
	private ApiError apiError;

	@ExceptionHandler(value = CouponNotFoundException.class)
	public ResponseEntity<ApiError> noCouponFound() {
		ApiError error = new ApiError();
		error.setErrorCodes("400");
		error.setErrorDesc(" No Coupon Found");
		error.setErrorDate(new Date());
		return new ResponseEntity<ApiError>(apiError, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = ValidationError.class)
	public ResponseEntity<ApiError> validationError() {
		apiError.setErrorCodes("401");
		apiError.setErrorDesc("Please Provide valid Details");
		apiError.setErrorDate(new Date());
		return new ResponseEntity<ApiError>(apiError, HttpStatus.BAD_REQUEST);
	}
}
