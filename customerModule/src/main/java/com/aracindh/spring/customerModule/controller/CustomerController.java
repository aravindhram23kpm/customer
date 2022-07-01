package com.aracindh.spring.customerModule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aracindh.spring.customerModule.entity.Customer;
import com.aracindh.spring.customerModule.service.CustomerService;
import com.aracindh.spring.customerModule.service.impl.CustomerServiceImpl;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/customers")
@Slf4j
public class CustomerController {

	@Autowired
	private CustomerService customerService;

//	public CustomerController (CustomerService customerService) {
//		this.customerService = customerService;
//	}
	@PostMapping("/cusotmer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		log.info("Inside saveCustomer method of CustomerController");
		System.out.println(customer);
		return customerService.saveCustomer(customer);
	}
	
//	@GetMapping("/")
//	public Customer 

	@GetMapping("/{id}")
	public Customer findCustomerById(@PathVariable("id") Long customerId) {
		log.info("Inside findCustomerById method of CustomerController");
		return customerService.findCustomerById(customerId);
	}

}
