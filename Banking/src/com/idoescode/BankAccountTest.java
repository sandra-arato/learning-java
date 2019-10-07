package com.idoescode;

import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount account = new BankAccount("John", 0);
        account.deposit(2);
        assertEquals(account.getBalance(), 2, 0);
    }

    @org.junit.Test
    public void withdraw() {
    }

}