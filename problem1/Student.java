package problem1;

public class Student extends Person {
    protected String myIdNum; // Student ID number
    protected double myGPA; //Grade point average
    
    public Student(String name, int age, String gender, String idNum, double gpa){ //use super class constructor
        super(name, age, gender);
        //initialize what's new to student
        myIdNum = idNum;
        myGPA = gpa;
    }
    
}
