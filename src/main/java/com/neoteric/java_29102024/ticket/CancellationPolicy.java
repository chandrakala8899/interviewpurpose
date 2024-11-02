package com.neoteric.java_29102024.ticket;

public enum CancellationPolicy {
    WITHIN_2_HOURS(0.0),         // Full refund
    WITHIN_4_HOURS(0.25),        // 25% cancellation fee
    WITHIN_8_Hours(0.50),          // 50% cancellation fee
    AFTER_24_Hours(1.0);            // No refund

    private  double cancellationFeePercentage;

    CancellationPolicy(double cancellationFeePercentage) {
        this.cancellationFeePercentage = cancellationFeePercentage;
    }

    public double getCancellationFeePercentage() {
        return cancellationFeePercentage;
    }
}
