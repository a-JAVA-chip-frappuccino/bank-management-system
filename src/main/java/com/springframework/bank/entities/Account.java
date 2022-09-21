package com.springframework.bank.entities;

import javax.persistence.*;

@Entity
@Table(name = "accounts")
public class Account {

    //TODO: implement joining element here for two tables?
    @Id
    private Long id;
    
    private String type;
    private float balance;
    private float interestRate;
    private String statement;
    private String transactHistory;

    // constructor

    public Account(String type, float balance, float interestRate, String statement, String transactHistory) {
        this.type = type;
        this.balance = balance;
        this.interestRate = interestRate;
        this.statement = statement;
        this.transactHistory = transactHistory;
    }

    // getters and setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getInterestRate() {
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

    public String getTransactHistory() {
        return transactHistory;
    }

    public void setTransactHistory(String transactHistory) {
        this.transactHistory = transactHistory;
    }
}

