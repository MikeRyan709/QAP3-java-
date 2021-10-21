class Person {
    protected String myName; //name of the person
    protected int myAge; //age of the person
    protected String myGender; //"M" for male, "F" for female, "NB" for non-binary
    
    public Person(String name, int age, String gender){
        myName = name;
        myAge = age;
        myGender = gender; 
    }
    //initialize getters and setters as per task 2
    public String getName() {
        return this.myName;
    }

    public int getAge() {
        return this.myAge;
    }
    public String getGender() {
        return this.myGender;
    }
    public void setName(String name) {
        this.myName = name;
    }

    public void setAge(int age) {
        this.myAge = age;
    }

    public void setGender(String gender) {
        this.myGender = gender;
    }


    public String toString() {
        return myName + ", Age: " + myAge + ", Gender: " + myGender;
    }
}