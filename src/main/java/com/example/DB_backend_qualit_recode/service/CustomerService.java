package com.example.DB_backend_qualit_recode.service;

import org.springframework.stereotype.Service;
import com.example.DB_backend_qualit_recode.model.Customer;
import com.example.DB_backend_qualit_recode.repository.CustomerRepository;

@Service
public class CustomerService {
	private CustomerRepository customerRepository;

	CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public Customer create(Customer customer) {
		return customerRepository.save(customer);
	}

}
