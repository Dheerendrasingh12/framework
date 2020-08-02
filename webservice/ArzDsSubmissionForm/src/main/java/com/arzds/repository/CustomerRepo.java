package com.arzds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.arzds.model.Customer;

/*public interface CustomerRepo extends CrudRepository<Customer, Integer> {

}
*/
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
