package com.neoteric.java_29102024.ticket;

public class TicketCancellationTest {
    public static void main(String[] args) {
        TicketCancellation cancellation = new TicketCancellationService();
        double refundAmount = cancellation.cancelTicket(2,100.0);
        System.out.println(   " Refund Amount " + refundAmount );
    }
}
