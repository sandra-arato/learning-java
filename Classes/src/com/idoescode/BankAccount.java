package com.idoescode;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;

    public BankAccount() {
        // this is how you set up default options
        // if params are not passed in into the constructor
        this("00000", 0, "Default name");
    }
    // setting for all during initialisation
    public BankAccount(String number, double balance, String customerName) {
        this.balance = balance;
        this.number = number;
        this.customerName = customerName;
    }

    // setting just customer number, others are default
    public BankAccount(String customerName) {
        this("next available number", 0, customerName);
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getNumber() {
        return number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
