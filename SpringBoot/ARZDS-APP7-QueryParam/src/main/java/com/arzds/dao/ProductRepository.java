package com.arzds.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arzds.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
