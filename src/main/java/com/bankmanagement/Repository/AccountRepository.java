package com.bankmanagement.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bankmanagement.Model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
	

}
