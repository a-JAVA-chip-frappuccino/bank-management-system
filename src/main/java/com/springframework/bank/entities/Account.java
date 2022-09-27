package com.springframework.bank.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    private Long id;
    
    private String type;
    private double balance;
    private double interestRate;
    private String statement;

    @ManyToMany(mappedBy = "users")
    private Set<Account> accounts = new HashSet<>();

    // constructor

    public Account() {}

    public Account(String type, double balance, double interestRate, String statement) {
        this.type = type;
        this.balance = balance;
        this.interestRate = interestRate;
        this.statement = statement;
    }

    // getters and setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    // overriding methods

    @Override
    public String toString() {
        return "Account Type: " + type + "\n"
                + "Account Balance: " + balance + "\n"
                + "Interest Rate: " + interestRate + "\n"
                + "Bank Statement: " + statement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Account account = (Account) o;

        //TODO: translate to non-ternary syntax
        return id != null ? id.equals(account.id) : account.id == null;
    }

    @Override
    public int hashCode() {
        //TODO: translate to non-ternary syntax
        return id != null ? id.hashCode() : 0;
    }
}

