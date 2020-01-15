package com.example.DB_backend_qualit_recode.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.DB_backend_qualit_recode.model.Customer;
import com.example.DB_backend_qualit_recode.service.CustomerService;

@RestController()
@RequestMapping("/api/v1/customers")
public class CustomerController {
	private CustomerService customerService;

	CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@PostMapping
	public Customer create(@RequestBody Customer customer) {
		return customerService.create(customer);
	}
}

