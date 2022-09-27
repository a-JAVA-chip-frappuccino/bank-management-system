package com.springframework.bank.bootstrap;

import com.springframework.bank.entities.Account;
import com.springframework.bank.entities.User;
import com.springframework.bank.repositories.AccountRepository;
import com.springframework.bank.repositories.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AccountRepository accountRepository;
    private final UserRepository userRepository;

    public BootstrapData(AccountRepository accountRepository, UserRepository userRepository) {
        this.accountRepository = accountRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started Running in Bootstrap!");

        Account bellaBucks = new Account("Savings", 3000.00, 0.06, "Deposit: HOTEL");
        User bellaSwan = new User("XXvampyXX", "EDwarD<3");
        bellaBucks.getAccounts().add(bellaSwan);
        bellaSwan.getUsers().add(bellaBucks); 
        //publisher.getBooks().add(ddd);

        AccountRepository.save(bellaBucks);
        UserRepository.save(bellaSwan);

        System.out.println("Finished Running in Bootstrap!");
    }
}