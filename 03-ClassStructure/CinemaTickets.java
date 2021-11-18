/**
10.Using a Motto (CinemaTicket) class describing cinema tickets, write a program that creates two tickets. Print the created tickets.
12.Modify the class describing cinema tickets. 
Add a constructor that creates a ticket for the specified movie, with row and seat numbers. 
Assume that in the first two rows the ticket price is PLN 10, and in the remaining rows, PLN 25. 
Then write a program that, in the Morning Star Cinema, creates two tickets for the movie “Gladiator”, 
the first one is in row 2 and the second one in row 7. Print the created tickets. 
*/


public class CinemaTickets{
public static void main(String args[]) {
    CinemaTicket TicketOne = new CinemaTicket("Gladiator",2,3);
    CinemaTicket TicketTwo = new CinemaTicket("Gladiator",7,5);


    CinemaTicket.cinemaName = "Morning Star Cinema";


    TicketOne.displayTicketDetails();
    TicketTwo.displayTicketDetails();
}
}