package com.neoteric.java_29102024.polymorphism;

import java.util.Date;

public class Payment {
    private String status;
    private String transactionId;
    private String utrId;
    private Date date;
    private  double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getUtrId() {
        return utrId;
    }

    public void setUtrId(String utrId) {
        this.utrId = utrId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    }
