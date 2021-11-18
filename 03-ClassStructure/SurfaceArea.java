/**
8.Define a class SurfaceArea that contains static methods to calculate the surface area for: circle, rectangle and triangle.
Validate the created methods.
/**
11.Using the class to calculate the area of geometric figures, write a program that creates the calculation and displays:
a.area of a rectangle with sides 4 and 5
b.area of a circle with a radius of 3
c.area of a triangle with base 3 and height 4
 */


public class SurfaceArea
{
    static double circleArea(double r){
        double area = Math.PI * r * r;
        double rounded = Math.round(area * 100) / 100.00;
        return rounded;
    }
    
    static float rectangleArea(float a,float b){
        return a*b;
    }
    
    static float triangleArea(float a,float h){
        return a*h/2;
    }
    
    public static void main(String[] args) {
        System.out.println(circleArea(3));
        System.out.println(rectangleArea(4,5));
        System.out.println(triangleArea(3,4));
    }
}
