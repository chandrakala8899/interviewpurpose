package com.neoteric.java_29102024.abstractpractice;

public interface CorporateAccount extends  AccountService{
    Account createAccount(String itr,String pan);
}
