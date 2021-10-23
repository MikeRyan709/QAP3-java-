package problem1;

public class Teacher extends Person {
    protected String mySubject;
    protected double mySalary;

    public Teacher(String name, int age, String gender, String subject, double salary){
        super(name, age, gender); // accessing the parent class
        //initialize what's new to Teacher class
        mySubject = subject;
        mySalary = salary;
    }
// getters and setters as per task 3c
    public String getSubject(){
        return this.mySubject;
    }

    public double getSalary() {
        return this.mySalary;
    }

    public void setSubject(String subject) {
        this.mySubject = subject;
    }

    public void setSalary(double salary){
        this.mySalary = salary;
    }
//toString using the super refrence as per task 3d
    public String toString() {
        return super.toString() + ", Subject: " + mySubject + ", Salary: " + mySalary;
    }
    
}
