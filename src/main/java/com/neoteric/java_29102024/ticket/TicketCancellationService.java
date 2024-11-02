package com.neoteric.java_29102024.ticket;

public class TicketCancellationService implements TicketCancellation {

    @Override
    public double cancelTicket(int hoursAfterTicketBooking, double ticketPrice) {
        double accountBalance = 5000.0;
        double cancellationFeePercentage;

        if (hoursAfterTicketBooking >= 24) {
            cancellationFeePercentage = CancellationPolicy.AFTER_24_Hours.getCancellationFeePercentage();
        } else if (hoursAfterTicketBooking >= 8) {
            cancellationFeePercentage = CancellationPolicy.WITHIN_8_Hours.getCancellationFeePercentage();
        } else if (hoursAfterTicketBooking >= 4) {
            cancellationFeePercentage = CancellationPolicy.WITHIN_4_HOURS.getCancellationFeePercentage();
        } else {
            cancellationFeePercentage = CancellationPolicy.WITHIN_2_HOURS.getCancellationFeePercentage();
        }

        double cancellationFee = ticketPrice * cancellationFeePercentage;
        double refundAmount = ticketPrice - cancellationFee;
         double totalBalance = refundAmount+accountBalance;

        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Cancellation Fee Percentage: " + (cancellationFeePercentage * 100) + "%");
        System.out.println("Cancellation Fee: " + cancellationFee);
        System.out.println("Refund Amount: " + refundAmount);
        System.out.println(totalBalance);

        return refundAmount;
    }
    }

