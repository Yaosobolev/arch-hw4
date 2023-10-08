package TicketBuyServiceProject;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import TicketBuyServiceProject.Models.Customer;
import TicketBuyServiceProject.Models.Ticket;
import TicketBuyServiceProject.Services.CashProvider;
import TicketBuyServiceProject.Services.TicketProvider;

public class Main {
    public static void main(String[] args) {

        CashProvider cp1 = new CashProvider(23423340, false);
        TicketProvider tp1 = new TicketProvider();
        List<Ticket> tickets = new ArrayList<>();
        List<Ticket> tickets1 = new ArrayList<>();
        Ticket ticket1;
        Customer customer1 = new Customer(0, cp1, tickets, tp1);

        Date date = new Date(0);

        tickets1 = customer1.searchTicket(date); 
        ticket1 = customer1.selectTicketFromList(tickets1); 
        Boolean what = customer1.autoriseUserbyTelephoneNumber("89130020012"); 
                                                                               
        System.out.println(what);
        if (customer1.buyTicket(ticket1))
            System.out.printf("Билет %d куплен", ticket1.getRootNumber());

        tickets1 = customer1.searchTicket(date); 
        ticket1 = customer1.selectTicketFromList(tickets1); 
        what = customer1.autoriseUserbyTelephoneNumber("89130020012"); 
                                                                       
        System.out.println(what);
        if (customer1.buyTicket(ticket1)) 
            System.out.printf("Билет %d куплен", ticket1.getRootNumber());

    }
}
