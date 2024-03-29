package com.arzds.service;

import java.util.List;

import com.arzds.model.Coupon;

public interface CouponService {
	public Coupon saveCoupon(Coupon coupon);

	public Coupon updateCoupon(Coupon coupon);

	public Coupon getCouponbyId(Integer id);

	public Coupon getCouponByCode(String code);

	public void deleteCouponById(Integer id);

	public List<Coupon> getAllCoupon();

	public boolean isExist(Integer id);

	public boolean isExpired(String code);
}
