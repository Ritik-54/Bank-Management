package com.bankmanagement.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.bankmanagement.Model.Account;
import com.bankmanagement.Service.AccountService;


@RestController
   public class AccountController {
	
	@Autowired
	AccountService accountService;
	@PostMapping("/createAccount")
	public String createAccount(@RequestBody Account account)
	{
		accountService.createAccount(account);
		return "Created";
		
	}
	
	@GetMapping ("/getAccount/{aId}")
	public Account getAccount(@PathVariable ("aId") int aId)
	{
		//Account a = (Account) accountService.getAccount(aId)
		//return a;
		return (Account) accountService.getAccount(aId);
		
	}
	
	
	
}
