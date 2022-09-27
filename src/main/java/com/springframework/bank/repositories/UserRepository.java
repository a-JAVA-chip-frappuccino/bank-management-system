package com.springframework.bank.repositories;

import com.springframework.bank.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    
}
