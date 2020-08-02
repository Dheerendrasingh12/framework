package com.arzds.repo;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arzds.model.Coupon;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Integer> {
	public Coupon findByCouponCode(String code);

	@Query("from com.arzds.model.Coupon as c where c.couponCode =:code and c.couponExpiry >=:expDate")
	public Coupon findByCouponCodeAndCouponExpiry(String code, Date expDate);

}
