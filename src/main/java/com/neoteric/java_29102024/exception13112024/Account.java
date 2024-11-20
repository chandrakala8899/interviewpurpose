package com.neoteric.java_29102024.exception13112024;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deductAmount(double amount) {
        balance -= amount;
        System.out.println("Amount deducted: " + amount);
    }

    public void refundAmount(double amount) {
        balance += amount;
        System.out.println("Amount refunded: " + amount);
    }
}

