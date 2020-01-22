package com.example.DB_backend_qualit_recode.service;

import java.util.List;
import java.util.Optional;

import org.springframework.dao.EmptyResultDataAccessException;

import com.example.DB_backend_qualit_recode.model.Account;
import com.example.DB_backend_qualit_recode.repository.AccountRepository;

public class AccountService {
	private AccountRepository accountRepository;

	AccountService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	public Account create(Account account) {
		return accountRepository.save(account);
	}
	
	public List <Account> findAll() {
		return accountRepository.findAll();
	}

	public Optional<Account> findById(long id) {
		return accountRepository.findById(id);
	}
	public Account update(long id, Account account) {
		Optional<Account> currentAccount = accountRepository.findById(id);
		if(currentAccount.isPresent()) {
			
			currentAccount.get().setName(account.getName());
			currentAccount.get().setCPF(account.getCPF());
			currentAccount.get().getAccount().addAll(account.getAccount());
			return accountRepository.save(currentAccount.get());
		}else {
			return null;
			/*throw new ResourceNotFoundException("Customer", "Client",  "O Client com id: "+id+"Não Encontrado!" );*/
		}
	
	}
	public void delete(long id) {
		try {
		accountRepository.deleteById(id);
		}catch (EmptyResultDataAccessException e) {
		}
	}


}
