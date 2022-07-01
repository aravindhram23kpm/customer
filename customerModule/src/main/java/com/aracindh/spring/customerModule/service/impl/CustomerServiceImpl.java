package com.aracindh.spring.customerModule.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aracindh.spring.customerModule.entity.Customer;
import com.aracindh.spring.customerModule.repository.CustomerRepository;
import com.aracindh.spring.customerModule.service.CustomerRequirementService;
import com.aracindh.spring.customerModule.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository customerRepository;
	@Transactional
	public Customer saveCustomer(Customer customer) {
		log.info("Inside saveCustomer of CustomerSreviceImpl");
		System.out.println(customer);
		return customerRepository.save(customer);
	}
	
	public Customer findCustomerById(Long customerId) {
		log.info("Inside findCustomerById of CustomerSreviceImpl");
		return customerRepository.findByCustomerId(customerId);
	}

}
