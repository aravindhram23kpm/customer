package com.aracindh.spring.customerModule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.aracindh.spring.customerModule.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

   
	Customer findByCustomerId(Long customerId);

}
