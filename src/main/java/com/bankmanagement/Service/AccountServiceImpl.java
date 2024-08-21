package com.bankmanagement.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bankmanagement.Model.Account;
import com.bankmanagement.Repository.AccountRepository;


@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountRepository accountRepository;
	
	
	@Override
	public void createAccount(Account account) {
		accountRepository.save(account);
		
	}

	@Override
	public AccountService getAccount(int aId) {
		
		
		return (AccountService) accountRepository.findById(aId).get();
	}

}
