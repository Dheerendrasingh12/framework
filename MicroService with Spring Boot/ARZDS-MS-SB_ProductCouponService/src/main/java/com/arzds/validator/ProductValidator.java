package com.arzds.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.arzds.exception.ApiError;
import com.arzds.model.Product;
@Component
public class ProductValidator implements Validator {
@Autowired
private ApiError apierror;
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return clazz.equals(Product.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		Product product=(Product) target;
		if(StringUtils.isEmpty(product.getProdCode())) {
			errors.reject("prodCode");
			apierror.getValidateError().add("Please Provice Product Code");
		}
		if(StringUtils.isEmpty(product.getProdId())) {
			errors.reject("prodId");
			apierror.getValidateError().add("Please Provice Product Id");
		}
		if(StringUtils.isEmpty(product.getProdCost())) {
			errors.reject("prodCost");
			apierror.getValidateError().add("Please Provice Product Cost");
		}
	}

}
