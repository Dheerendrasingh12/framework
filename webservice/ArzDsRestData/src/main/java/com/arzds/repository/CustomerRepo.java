package com.arzds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.arzds.model.Customer;

@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
