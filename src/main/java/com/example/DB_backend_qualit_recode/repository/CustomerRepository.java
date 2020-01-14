package com.example.DB_backend_qualit_recode.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DB_backend_qualit_recode.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	List<Customer> findByNameContaining(String name);

	List<Customer> findByCPFContaining(String CPF);
}
