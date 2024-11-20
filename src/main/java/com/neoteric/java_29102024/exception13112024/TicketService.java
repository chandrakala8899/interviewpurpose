package com.neoteric.java_29102024.exception13112024;

public class TicketService {
    private Account account;

    public TicketService(Account account) {
        this.account = account;
    }

    public void bookTicket(double amount){
        try {
             account.deductAmount(amount);
            throw new NetworkIsuueException(BookingStatus.FAILURE.getMessage());
        } catch (NetworkIsuueException e) {
            System.out.println(e.getMessage());
            account.refundAmount(amount);
        }
    }
}

