
/**
15.Create a library of methods for the calculation of basic statistics:
a.Number of items within the specified range <x,y>
b.Sum of numbers in the given range  <x,y>
c.Arithmetic mean of the numbers in the given range  <x,y>
Then create a program that calculates and displays the basic statistics for integers in the range <5,10>
 */
public class Stats15
{
public static long countNoOfItems(long x,long y){
    long counter = 0;
    for (long i = x; i < y+1; i++) {
        counter += 1;
    }
    return counter;
}

public static long sumNumbers(long x,long y){
    long sum = 0;
    for (long i = x; i < y+1; i++) {
        sum += i;
    }
    return sum;
}

public static double findMean(long x,long y){
    double mean = sumNumbers(x,y) / countNoOfItems(x,y);
    return mean;
}
}
