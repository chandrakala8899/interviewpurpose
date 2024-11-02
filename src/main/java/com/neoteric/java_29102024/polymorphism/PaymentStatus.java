package com.neoteric.java_29102024.polymorphism;

public enum PaymentStatus {

    COMPLETED(1, "Payment completed successfully"),
    FAILED(2, "Payment failed"),
    PENDING(3, "Payment in progress"),
    DAILY_LIMIT_EXCEEDED(4, "Daily limit exceeded");

    private final int code;
    private final String message;

    PaymentStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }


    public String getMessage() {
        return message;
    }


}
