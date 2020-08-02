package com.arzds.validation;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.arzds.exception.ApiError;
import com.arzds.model.Coupon;

@Component
public class CouponValidator implements Validator {
	@Autowired
	private ApiError apiError = new ApiError();

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return clazz.equals(Coupon.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		Coupon coupon = (Coupon) target;
		if (StringUtils.isEmpty(coupon.getCouponId())) {
			errors.reject("couponId");
			apiError.getValidationError().add("Please provide  Coupon Id");
		}
		if (StringUtils.isEmpty(coupon.getCouponCode())) {
			errors.reject("couponCode");
			apiError.getValidationError().add("Please Provide Coupon Code");
		}
		if (StringUtils.isEmpty(coupon.getCouponDiscount())) {
			errors.reject("couponDiscount");
			apiError.getValidationError().add("Please Provide Coupon Discount");

		} else {
			if (coupon.getCouponDiscount() < 0) {
				errors.reject("couponDiscount");
				apiError.getValidationError().add("Please Provide valid coupon Discount");
			}
		}
		if (StringUtils.isEmpty(coupon.getCouponExpiry())) {
			errors.reject("expDate");
			apiError.getValidationError().add("Please provide COupon Expiry Date");
		} else {
			if (coupon.getCouponExpiry().before(new Date())) {
				errors.reject("expDate");
				apiError.getValidationError().add("Please Provide Valid Coupon Expiry Date");
			}
		}
	}

}
