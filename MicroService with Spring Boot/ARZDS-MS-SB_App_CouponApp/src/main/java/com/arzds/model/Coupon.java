package com.arzds.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Coupon")
public class Coupon implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "CouponId")
	private Integer couponId;
	@Column(name = "couponCode", length = 30)
	private String couponCode;
	@Column(name = "couponDiscount")
	private Double couponDiscount;
	@Temporal(TemporalType.DATE)
	@Column(name = "couponExpiry")
	private Date couponExpiry;

	@JsonIgnore
	@Column(name = "couponValid")
	private Boolean isValid = true;
}
