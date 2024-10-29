package com.neoteric.java_29102024;

import java.util.Date;

public class Account {
    public  String accountHolderName;
    public  String pan;
    public  String adhar;
    public Date date;
    public  String nriProof;

    public Account(String accountHolderName, String pan, String adhar, Date date) {
        this.accountHolderName = accountHolderName;
        this.pan = pan;
        this.adhar = adhar;
        this.date = date;
    }
    public Account(String accountHolderName, String pan, String adhar, Date date,String nriProof) {
      this(accountHolderName, pan, adhar, date);
      this.nriProof = nriProof;
    }


}
