package com.idoescode;

import java.util.Arrays;

public class BankAccount {
    private String firstName;
    private double balance;

    public BankAccount(String firstName, double balance) {
        this.firstName = firstName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
