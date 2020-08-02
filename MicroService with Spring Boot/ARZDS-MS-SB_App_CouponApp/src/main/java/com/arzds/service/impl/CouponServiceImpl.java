package com.arzds.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arzds.model.Coupon;
import com.arzds.repo.CouponRepository;
import com.arzds.service.CouponService;

@Service
public class CouponServiceImpl implements CouponService {
	@Autowired
	private CouponRepository repo;

	@Override
	@Transactional
	public Coupon saveCoupon(Coupon coupon) {
		// TODO Auto-generated method stub
		return repo.save(coupon);
	}

	@Override
	@Transactional
	@CachePut(value = "coupon-cache", key = "#coupon.couponId")
	public Coupon updateCoupon(Coupon coupon) {
		// TODO Auto-generated method stub
		return repo.save(coupon);
	}

	@Override
	@Cacheable(value = "coupon-cache", key = "#couponId")
	@Transactional(readOnly = true)
	public Coupon getCouponbyId(Integer id) {
		// TODO Auto-generated method stub
		Optional<Coupon> optional = repo.findById(id);
		return optional.isPresent() ? optional.get() : null;
	}

	@Override
	@Transactional(readOnly = true)
	public Coupon getCouponByCode(String code) {
		// TODO Auto-generated method stub
		Coupon coupon = repo.findByCouponCode(code);
		return coupon;
	}

	@Override
	@Transactional
	@CacheEvict(value = "coupon-cache", key = "#couponId")
	public void deleteCouponById(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

	}

	@Override
	@Transactional(readOnly = true)
	public List<Coupon> getAllCoupon() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public boolean isExist(Integer id) {
		// TODO Auto-generated method stub
		return repo.existsById(id);
	}

	@Override
	public boolean isExpired(String code) {
		// TODO Auto-generated method stub
		Coupon coupon = repo.findByCouponCodeAndCouponExpiry(code, new Date());
		return coupon != null ? true : false;
	}

}
