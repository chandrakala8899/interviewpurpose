package com.neoteric.java_29102024.exception13112024;

public class TicketBookingTest {
    public static void main(String[] args) {
        Account account = new Account(500.00);
        TicketService ticketService = new TicketService(account);

        System.out.println("Initial Balance: " + account.getBalance());
        ticketService.bookTicket(100.00);
        System.out.println("Final Balance: " + account.getBalance());

    }
}
