/**
15.Create a library of methods for the calculation of basic statistics:
a.Number of items within the specified range <x,y>
b.Sum of numbers in the given range  <x,y>
c.Arithmetic mean of the numbers in the given range  <x,y>
Then create a program that calculates and displays the basic statistics for integers in the range <5,10>
 */
public class CalculateStats{
public static void main(String args[]) {
    System.out.println("Number of items in range <5,10> is: " + Stats15.countNoOfItems(5,10));
    System.out.println("Sum of items in range <5,10> is: " + Stats15.sumNumbers(5,10));
    System.out.println("Arithmetic mean of items in range <5,10> is: " + Stats15.findMean(5,10));
}
}