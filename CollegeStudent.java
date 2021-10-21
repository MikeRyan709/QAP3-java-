public class CollegeStudent extends Student {
    protected String myMajor; // Students Major
    protected int myYear; // accidenmic year the student in in eg. year 1, year 2 etc...
    
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major){
        super(name, age, gender, idNum, gpa);
        //initialize uninheritated variables
        myMajor = major;
        myYear = year;
    }
    //Getters and settters as per task 4c
    public String getMajor(){
        return this.myMajor;
    }

    public int getYear() {
        return this.myYear;
    }

    public void setmajor(String major) {
        this.myMajor = major;
    }

    public void setYear(int year) {
        this.myYear = year;
    }
//toString using the super refrence as per tast 4d
    public String toString() {
        return super.toString() + ", Major: " + myMajor + ", Year: " + myYear;
    }
}
