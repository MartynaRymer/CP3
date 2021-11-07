public class Students {
    public static void main(String args[]) {
        Student StudentOne = new Student("Jan Kowalski");
        Student StudentTwo = new Student("Janina Nowak");


        StudentOne.age = 24;
        StudentOne.studentId = "12345";
        StudentOne.isValidId = true;
        StudentOne.semesterNumber = 1;
        StudentOne.averageGrade = 5.0;


        StudentTwo.age = 34;
        StudentTwo.studentId = "52645";
        StudentTwo.isValidId = true;
        StudentTwo.semesterNumber = 3;
        StudentTwo.averageGrade = 4.9;


        StudentOne. sayHello();
        StudentOne. displayName();
        StudentOne. displayAge();
        StudentOne. displayPrimaryInfo();
        StudentOne. displayMoreInfo();
        StudentOne. changeIdStatus();
        StudentOne. displayMoreInfo();
    }
}
