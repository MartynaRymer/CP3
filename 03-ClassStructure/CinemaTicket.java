/**
7.Define a class CinemaTicket to describe cinema tickets.
The ticket attributes are: cinema name, film title, row, seat, and price.
Since the name of cinema is the same for all tickets, use a static field.
Then define a method to display ticket data.
Try to create two tickets and display ticket details.
12.Modify the class describing cinema tickets. 
Add a constructor that creates a ticket for the specified movie, with row and seat numbers. 
Assume that in the first two rows the ticket price is PLN 10, and in the remaining rows, PLN 25. 
Then write a program that, in the Morning Star Cinema, creates two tickets for the movie “Gladiator”, 
the first one is in row 2 and the second one in row 7. Print the created tickets.
*/
public class CinemaTicket
{
    static String cinemaName;
    String filmTitle;
    int row;
    int seat;
    double price;


    public CinemaTicket(String movie, int rowNo, int seatNo){
        this.filmTitle = movie;
        this.row = rowNo;
        this.seat = seatNo;
        if ((rowNo == 1) || (rowNo ==2)){
            this.price = 10;
        } else{
            this.price = 25;
        }
    }


    void displayTicketDetails(){
        System.out.println("Cinema name is: " + cinemaName + "\n"
        + "Film title is: " + filmTitle + "\n"
        + "Row is: " + row + "\n"
        + "Seat is: " + seat + "\n"
        + "Price is: " + price);
    
    }


}