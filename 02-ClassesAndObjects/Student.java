/*
7.In the Java programming language, define a Student class. Pay attention to the class name and the file where the class is defined. 
10.In the Student class, add methods (method headers only) that represent the behaviors of the object:
a.sayHello()
b.displayName()
c.displayAge()
Then enter the statements in the methods to display the appropriate information.
11.Create three Student class objects. Assign values to the object fields. Then call the methods.
12.Add the following fields and methods to the Student class to represent object attributes and behaviors:
a.Object attributes: (1) student ID card, (2) whether the student ID card is valid or not, (3) semester number, (4) average grade
b.Object bahaviors: (1) display the student’s name, semester number and average grade, (2) change the status of student ID card (valid/invalid), (3) display the student’s name, ID card number and whether the ID card is valid
Then create two Student class objects, assign them some values and call methods.
 */
public class Student
{
    String name;
    int age;
    String studentId;
    boolean isValidId;
    int semesterNumber;
    double averageGrade;
    
    public Student(String name) {
      this.name = name;
   }
   
    void sayHello(){
        System.out.println("Hello");
    }
    
    void displayName(){
        System.out.println("Name is: " + name);
    }
    
    void displayAge(){
        System.out.println("Age is: " + age);
    }
       
    void displayPrimaryInfo(){
        System.out.println("Name is: " + name + ", semester number is: " + semesterNumber + ", average grade is: " + averageGrade);
    }
    
    void changeIdStatus(){
        isValidId = !isValidId;
    }
    
    void displayMoreInfo(){
        System.out.println("Name is: " + name + ", Id card number is: " + studentId + " and it is " 
        + ((isValidId == false) ? "not valid" : "valid"));
    }
}
