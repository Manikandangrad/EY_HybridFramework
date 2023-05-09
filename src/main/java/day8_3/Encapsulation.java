package day8_3;

public class Encapsulation {
    //Initialise the variable
    private int age = 10;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Create the method
    private String ageStatus() {
        String Status;
        if (age > 18) {
            Status = "Major";
        } else {
            Status = "Minor";
        }
        return Status;
    }
    public String getAgeStatus() {
        String getAgeStatus = ageStatus();
        return ageStatus();
    }
}



