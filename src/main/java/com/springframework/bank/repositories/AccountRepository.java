package com.springframework.bank.repositories;

import com.springframework.bank.entities.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
    
}
