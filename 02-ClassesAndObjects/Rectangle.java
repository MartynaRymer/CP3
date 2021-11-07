/*16.Define a class for describing rectangles.
Then create two objects that represents rectangles with dimensions of 3x4 and 2x7 respectively.
Display their dimensions, perimeters and surface areas.*/
public class Rectangle
{
    double side1;
    double side2;
    
    public Rectangle(double side1,double side2){
        this.side1 = side1;
        this.side2 = side2;
    }
    
    void displayDimension(){
        System.out.println("The dimension is " + side1 + "x" + side2);
    }
    
    void displayPerimeter(){
        double perimeter = 2 * side1 + 2 * side2;
        System.out.println("The perimeter is: " + perimeter);
    }
    
    void displayArea(){
        double area = side1 * side2;
        System.out.println("The area is: " + area);
    }
}