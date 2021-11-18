/**
13.Define a class Person for person’s record. The class should contain the attributes: name, weight (kg) and height (cm).
Add constructors:
a.Person(name)
b.Person(name,weight,height)
Then add methods that represents the object's behaviors:
c.setWeightAndHeight(weight,height)
d.calculateBMI() – calculates Body Mass Index
e.displayRecord() – displays full info (name, weight, height, and BMI)
The correct BMI value is 18.5 to 24.9. When displaying a person’s record, if the BMI is too low, display the message:
"BMI too low". When the index is too high, display the message: "BMI too high".
Write a program, create three persons and display their records.
 */
public class Person
{
    String name;
    double weight;
    double height;
    
    public Person(String name)
    {
        this.name = name;
    }
    public Person(String name,double weight,double height)
    {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    
    void setWeightAndHeight(double weight,double height){
        this.weight = weight;
        this.height = height;
    }
    
    double calculateBMI(){
        double bmi = Math.round((weight / Math.pow(height,2)) * 100) / 100.00;
        return bmi;
    }
    
    void displayRecord(){
        double bmi = calculateBMI();
        System.out.println("Name is: " + name + ", weight is: " + weight + ", height is: " + height + ", BMI is: " + bmi);
        if (bmi < 18.5) {
        System.out.println("BMI too low");
        }else if (bmi >24.9){
        System.out.println("BMI too high");
        }
    }
}