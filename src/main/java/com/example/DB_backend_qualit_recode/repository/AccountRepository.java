package com.example.DB_backend_qualit_recode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DB_backend_qualit_recode.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
