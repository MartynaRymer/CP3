
/**
22.Define a class Room that represents a hotel room. The class should contain the attributes: number, beds, occupied, and guestName.
Add constructors: Room(number) (creates a room with two beds) and Room(number,beds).
Next, define methods for room manipulation: checkin(guestName), checkout(), isOccupied(), and displayStatus().
Then write a program in which create three rooms with two beds, two rooms with three beds and one room with one bed. Store all room objects in an array:
Room[] rooms = new Room[6];
Then follow the steps below:
a.Display status of a single room (room number, number of beds, occupied, guest name). Display data in a single row.
b.Display a report with a list of rooms (room number, number of beds, occupied, guest name)
c.Display a report with a list of rooms, limited to rooms with the specified number of beds
d.Display a report on how many rooms are vacant and how many are occupied
e.Display a report on how many vacant beds are available
Create a separate static method for each report. Pass a list of rooms (an array) to the defined static methods.

23.Modify the Room class. Define toString() method that returns information about the room status.
Replace the displayStatus() method with the defined toString() method. Tip: find out in the manual how to define and use the toString() method.

 */
public class Room
{
    int number;
    int beds;
    boolean occupied;
    String guestName = "";


    public Room(int number)
    {
        this.number = number;
        this.beds = 2;
    }
    public Room(int number,int beds)
    {
        this.number = number;
        this.beds = beds;
    }
    
    public void checkin(String guestName)
    {
        this.guestName = guestName;
        isOccupied();
    }
    
    public void checkout()
    {
        this.guestName = "";
        isOccupied();
    }
    
    public void isOccupied(){
        this.occupied = !this.occupied;
    }
    
    public void displayStatus(){  
        System.out.println("Room " + number + " has " + beds + " beds, is " + ((occupied == false) ? "not occupied" : "occupied")
        + ((guestName == "") ? "" : " and guest name is: " + guestName));    
    } 
    
    
    public String toString(){
        return "Room " + number + " has " + beds + " beds, is " + ((occupied == false) ? "not occupied" : "occupied")
        + ((guestName == "") ? "" : " and guest name is: " + guestName);  
     }  
    
    //b.Display a report with a list of rooms (room number, number of beds, occupied, guest name)

    public static void reportB(Room [] rooms){
        for (int i=0; i < rooms.length;i++){
        System.out.println("Room " + rooms[i].number + " Beds: " + rooms[i].beds + " Occupied: " + rooms[i].occupied
        + " Guest name: " + rooms[i].guestName);   
    }
    }
    //c.Display a report with a list of rooms, limited to rooms with the specified number of beds
    public static void reportC(Room [] rooms, int beds){
        for (int i=0; i < rooms.length;i++){
            if (rooms[i].beds==beds){
                System.out.println("Room " + rooms[i].number + " Beds: " + rooms[i].beds + " Occupied: " + rooms[i].occupied
                + " Guest name: " + rooms[i].guestName);  
            }
    }
    }    
    //d.Display a report on how many rooms are vacant and how many are occupied
    public static void reportD(Room [] rooms){
        int vacant = 0;
        for (int i=0; i < rooms.length;i++){
            if (rooms[i].occupied == false){
                vacant += 1;
            }
        }
        System.out.println("There are " + (rooms.length - vacant) + " rooms occupied and " + vacant + " vacant.");
    }
    
    //e.Display a report on how many vacant beds are available
    public static void reportE(Room [] rooms){
        int vacantBeds = 0;
        for (int i=0; i < rooms.length;i++){
            if (rooms[i].occupied){
                vacantBeds += (rooms[i].beds - 1);}
            else{
                vacantBeds += rooms[i].beds;
            }
        }
        System.out.println("There are " + vacantBeds + " vacant beds.");
    }    
}
