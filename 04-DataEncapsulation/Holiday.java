
/**
12.Choose any object. Then define a class that describes such objects. Hide data about an object using data encapsulation. 
 */
public class Holiday
{
    private String destination;
    private int durationInDays;
    private String accommodation;
    
    public void setDestination(String destination){
        this.destination = destination;
    }
    public void setDurationInDays(int durationInDays){
        this.durationInDays = durationInDays;
    }
    public void setAccommodation(String accommodation){
        this.accommodation = accommodation;
    }
    
    public String getDestination(){
        return destination;
    }
    public int getDurationInDays(){
        return durationInDays;
    }
    public String getAccommodation(){
        return accommodation;
    }
    
    public String toString(){
        return "Holiday destination: " + getDestination() + ", duration: " + getDurationInDays() + " days, accommodation: " + getAccommodation();
    }
}
