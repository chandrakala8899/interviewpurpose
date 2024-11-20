package com.neoteric.java_29102024.abstractpractice;

import java.util.UUID;

public class CorporateAccountimpl implements CorporateAccount{


    @Override
    public Account createAccount(String itr, String pan) {
        Account account = new Account();
        account.setAccount(UUID.randomUUID().toString());
        account.setBalance(10000.0);
        account.setAdhar(account.getAdhar());
        account.setPan(account.getPan());
        SBISccountDBSService.accountmap.put(account.getAccount(),account);
        return null;
    }
}
