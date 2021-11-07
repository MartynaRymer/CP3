
/*
17.Design a simple counter. The initial value of the counter is 0.
The counter can be increased or decreased by one, and increased and decreased by 10.
It is possible to reset the counter to its initial value. Then define a class for counters. Create two counters.
Set the first counter to 23 and the second one to -47*/
public class Counter
{
    int initialValue = 0;
    int currentValue = initialValue;
    /**
     * Constructor for objects of class Counter
     */
    public Counter(){}
        
    void increaseByOne(){
        currentValue += 1;
    }
    
    void decreaseByOne(){
        currentValue -= 1;
    }
    
    void increaseByTen(){
        currentValue += 10;
    }
    
    void decreaseByTen(){
        currentValue -= 10;
    }
    
    void resetCounter(){
        currentValue = initialValue;
    }
    
    void displayValue(){
        System.out.println("The counter value is " + currentValue);
    }
    
}
