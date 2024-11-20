package com.neoteric.java_29102024.Exceptions;

public class DailyTransactionLimitException extends  Exception{
    public  DailyTransactionLimitException(String message){
        super(message);
    }
}
