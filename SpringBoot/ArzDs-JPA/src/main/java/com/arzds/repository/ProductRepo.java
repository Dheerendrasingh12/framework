package com.arzds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arzds.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
