
/**
12.Choose any object. Then define a class that describes such objects. Hide data about an object using data encapsulation. 
 */
public class Holidays
{
public static void main(String args[]) {
    Holiday holidays2020 = new Holiday();
    Holiday holidays2021 = new Holiday();
    
    holidays2020.setDestination("Bieszczady");
    holidays2020.setDurationInDays(7);
    holidays2020.setAccommodation("tent");
    
    holidays2021.setDestination("Majorka");
    holidays2021.setDurationInDays(10);
    holidays2021.setAccommodation("hotel");
    
    System.out.println(holidays2020.toString());
    System.out.println(holidays2021.toString());
}
}
