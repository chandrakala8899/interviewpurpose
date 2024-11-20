package com.neoteric.java_29102024.ticket;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TickerController {
    Logger logger = LogManager.getLogger(TickerController.class);
@GetMapping("/ticket")
    public TicketCancellationService tickercancellation(){
    logger.info("TicketController:ticketcancellation  {} " );

    TicketCancellationService ticketCancellationService = new TicketCancellationService();
    ticketCancellationService.cancelTicket(4,100);

    return ticketCancellationService ;
}


}
