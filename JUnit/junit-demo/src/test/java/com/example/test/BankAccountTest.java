package com.example.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.BankAccount;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        System.out.println("Setting up test...");
        account = new BankAccount(1000);
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up after test...");
        account = null;
    }

    @Test
    public void testDeposit() {

      
        double amount = 500;

   
        account.deposit(amount);

        
        assertEquals(1500.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {

       
        double amount = 300;

       
        account.withdraw(amount);

        
        assertEquals(700.0, account.getBalance(), 0.001);
    }
}