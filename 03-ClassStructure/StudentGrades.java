
/**
17.The following definition of the StudentGrades class allows the storage of a student's grades.
public class StudentGrades {

    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
}
Complete the class with methods that:
a.calculates of the lowest grade
b.calculates of the highest grade
c.calculates of the number of grades
d.calculates of the grade point average
e.displays student’s record with student’s name, a list of the student's grades, number of grades, lowest grade, highest grade, and grade point average
Then, write a program that creates grades for two students:
f.Amanda: 3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5
g.James: 2.0, 3.0, 2.0, 4.5, 4.5
Tip: pass student's grades to the constructor, as an array, in curly brackets, e.g. StudentGrades({5.0, 3.5}).


18.Add the constructor StudentGrades(String name, int numberOfGrades) to the StudentGrade class, which allows you to randomly
create the given number of student grades. Tip: use the random number generator, which is available in the Random class.
See the manual for more information.
19.Add the constructor StudentGrades(String name) that allows you to enter student’s grades from the keyboard.
Tip: use the Scanner class. See the manual for more information.

 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudentGrades {

    String studentName;
    double[] grades;
    double[] randGradesArray;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
    
    StudentGrades(String name, int numberOfGrades) {
        this.randGradesArray = new double[numberOfGrades];
        Random rand = new Random();
        for (int i = 0;i<numberOfGrades;i++){
            double newGrade = 2.0 + (rand.nextDouble() * (3.5));
            this.randGradesArray[i] = Math.round(newGrade * 2) / 2.0;
        }

    }
    
    StudentGrades(String name){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade");
        double grade = sc.nextDouble();
    
        sc.close();  
    
    }
    
    
    
    
    
    
    double calculateLowestGrade(){
        double min = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }
    
    double calculateHighestGrade(){
        double max = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }
    
    int calculateNoOfGrades(){
        return grades.length;
    }
    
    double calculateAverageGrade(){
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
        sum += grades[i];
        }
        return sum / calculateNoOfGrades();
    }
    
    void displayRecord(){
        System.out.println("Student's name is: " + studentName);
        System.out.println("The grades are: " + Arrays.toString(grades));
        System.out.println("There are " + calculateNoOfGrades() + " grades");
        System.out.println("The lowest grade is: " + calculateLowestGrade());
        System.out.println("The highest grade is: " + calculateHighestGrade());
        System.out.println("The average of grades is: " + calculateAverageGrade());
    }
}