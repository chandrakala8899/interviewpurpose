package com.neoteric.java_29102024.polymorphism;

import java.util.*;
import java.util.function.BiPredicate;

public class PhonePay implements UPIpayments{

    static Map<String,Double> accountBalanceMap = new HashMap<>();
    static Map<String, ArrayList<Payment>> accountHistory = new HashMap<>();


  static {
      accountBalanceMap.put("9908",15000.0);
      accountBalanceMap.put("8688",10000.0);

  }


BiPredicate<String,Double> balanceCheck = (accounNumber,balance) -> {
    Double accountblance = accountBalanceMap.get(accounNumber);
    if (accountblance > balance) {
        return true;
    } else {
        return false;
    }
};
    BiPredicate<String,Double> dailyLimitCheck=(accountNumber,amount) ->{
        Double dailyLimit=10000.0;
        ArrayList<Payment> paymentHistoryList=accountHistory.get(accountNumber);
        if(paymentHistoryList!=null){
            Double totalTranscationAmount=0.0;
            for(int i=0;i<paymentHistoryList.size();i++){
                Payment pay= paymentHistoryList.get(i);
                totalTranscationAmount=totalTranscationAmount+pay.getAmount();
            }
            if(totalTranscationAmount<dailyLimit){
                return true;
            }else {
                return false;
            }
        }else {
            return true;
        }
    };

    @Override
    public Payment transfer(String fromMobileNumber, String toNumber, double amount) {
        Payment payment = new Payment();
        if(balanceCheck.test(fromMobileNumber,amount)) {
            if (dailyLimitCheck.test(fromMobileNumber, amount)) {
                Double fromAccountBalance = accountBalanceMap.get(fromMobileNumber);
                Double toAccountBalance = accountBalanceMap.get(toNumber);

                Double fromTotalBalance = fromAccountBalance - amount;
                Double toTotalBalance = toAccountBalance + amount;

                accountBalanceMap.put(fromMobileNumber, fromTotalBalance);
                accountBalanceMap.put(toNumber, toTotalBalance);

                payment.setStatus(PaymentStatus.COMPLETED.getMessage());
                payment.setTransactionId(UUID.randomUUID().toString());
                payment.setDate(new Date());
                payment.setUtrId(UUID.randomUUID().toString());
                payment.setAmount(amount);

                ArrayList<Payment> paymentArrayList = accountHistory.get(fromMobileNumber);
                if (paymentArrayList != null) {
                    paymentArrayList.add(payment);
                } else {
                    paymentArrayList = new ArrayList<Payment>();
                    paymentArrayList.add(payment);
                    accountHistory.put(fromMobileNumber, paymentArrayList);
                }
            }else {
                payment.setStatus(PaymentStatus.FAILED.getMessage());
                payment.setTransactionId(UUID.randomUUID().toString());
                payment.setDate(new Date());
                payment.setUtrId(UUID.randomUUID().toString());
            }

        } else {

            payment.setStatus(PaymentStatus.DAILY_LIMIT_EXCEEDED.getMessage());
            payment.setTransactionId(UUID.randomUUID().toString());
            payment.setDate(new Date());
            payment.setUtrId(UUID.randomUUID().toString());
        }
        return payment;
    }

    }

