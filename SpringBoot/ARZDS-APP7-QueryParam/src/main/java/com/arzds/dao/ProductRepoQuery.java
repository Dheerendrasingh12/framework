package com.arzds.dao;

import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arzds.model.Product;

@Repository
public interface ProductRepoQuery extends JpaRepository<Product, Long> {
	@Query("SELECT P FROM PRODUCT P WHERE P.PRODCODE=:prod1 OR P.PRODCODE=:prod2")
	public List<Product> getAllProduct(String prod1, String prod2);

	@Query("SELECT P.PRODID,P.PRODNAME FROM PRODUCT P WHERE P.PRODCODE IN (:prod1)")
	public List<Object[]> getAllProdData(String prod1);

	@Modifying
	@Transactional
	@Query("UPDATE PRODUCT P SET P.PRODCODE =:prodCode WHERE P.PRODID=:prodId")
	void updateProduct(String prodCode, long prodId);

	/*
	 * @Modifying
	 * 
	 * @Transactional
	 * 
	 * @Query("DELETE FROM PRODUCT P WHERE P.PRODID=:prodId") void
	 * deleteProduct(long prodId);
	 */
}