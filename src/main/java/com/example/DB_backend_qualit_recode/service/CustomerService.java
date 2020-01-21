package com.example.DB_backend_qualit_recode.service;

import java.util.List;
import java.util.Optional;

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
	
	public List <Customer> findAll() {
		return customerRepository.findAll();
	}

	public Optional<Customer> findById(long id) {
		return customerRepository.findById(id);
	}
	public Customer update(long id, Customer customer) {
		Optional<Customer> currentCustomer = customerRepository.findById(id);
		if(currentCustomer.isPresent()) {
			
			currentCustomer.get().setName(customer.getName());
			currentCustomer.get().setCPF(customer.getCPF());
			currentCustomer.get().getAccounts().addAll(customer.getAccounts());
			return customerRepository.save(currentCustomer.get());
		}else {
			return null;
			/*throw new ResourceNotFoundException("Customer", "Client",  "O Client com id: "+id+"Não Encontrado!" );*/
		}
	}

}
