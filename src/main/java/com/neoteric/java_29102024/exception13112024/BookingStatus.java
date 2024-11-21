package com.neoteric.java_29102024.exception13112024;

public enum BookingStatus {
    SUCCESS("Booking Successful"),
    FAILURE("Booking Failed - Network Issue");

    private final String message;

    BookingStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
