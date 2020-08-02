package com.arzds.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Coupon implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private Integer couponId;
	private String couponCode;
	private Double couponDiscount;
	private Date expDate;

	@JsonIgnore
	private Boolean isValid = true;
}
