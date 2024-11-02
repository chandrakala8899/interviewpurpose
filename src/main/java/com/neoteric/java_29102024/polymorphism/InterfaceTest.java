package com.neoteric.java_29102024.polymorphism;

public class InterfaceTest {
    public static void main(String[] args) {
      UPIpayments phonePay = new PhonePay();
        Payment payment1 = phonePay.transfer("9908","8688",3000.0);
        System.out.println(payment1.getStatus());
        Payment payment2 =phonePay.transfer("9908","8688",5000.0);
        System.out.println(payment2.getStatus());
        Payment payment3 =phonePay.transfer("9908","8688",10000.0);
        System.out.println(payment3.getStatus());
        System.out.println(payment1.getTransactionId()+"   " + payment1.getStatus()+ "   " +payment1.getDate()+ "   ");

    }
}
