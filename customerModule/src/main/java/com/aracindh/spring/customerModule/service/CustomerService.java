package com.aracindh.spring.customerModule.service;

import org.springframework.stereotype.Service;

import com.aracindh.spring.customerModule.entity.Customer;

@Service
public interface CustomerService {
	public Customer saveCustomer(Customer customer);
	public Customer findCustomerById(Long customerId);
	
}
