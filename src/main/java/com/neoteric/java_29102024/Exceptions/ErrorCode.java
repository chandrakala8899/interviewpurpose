package com.neoteric.java_29102024.Exceptions;

public enum ErrorCode {
    ACCOUNT_NOT_FOUND("Account not found ","100"),
    IN_SUFFICEINT_FUNDS("Insufficent Exceptions ","101"),
    DAILY_LIMIT_EXCEED("Dialy Limit Exceeded ","103  ");

  private String code;
  private String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    ErrorCode(String message, String code){
        this.message = message;
       this.code= code;

    }
}
