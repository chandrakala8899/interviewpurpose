package com.neoteric.java_29102024.Exceptions;

public class ExceptionTest {
    public static void main(String[] args) {
        BankSevice bankSevice = new BankSevice();
        try{
        bankSevice.transfer("2244","3355",7000.0);

      }catch (Exception e){
            System.out.println(" Error " + e.getMessage());

        }
        }
    }

