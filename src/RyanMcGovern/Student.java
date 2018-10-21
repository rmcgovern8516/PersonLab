package RyanMcGovern;

import java.security.PublicKey;

public class Student extends Person{
    private String firstName;
    private String familyName;
    private double GPA;
    public Student (String firstName, String familyName, double GPA){
        super("Student");
        this.firstName = firstName;
        this.familyName = familyName;
        this.GPA = GPA;
    }
    @Override
    public String getFirstName(){
        return firstName;
    }
    @Override
    public String getFamilyName(){
        return familyName;
    }
    @Override
    public String toString(){
        return familyName +","+firstName;
    }
    @Override
    public boolean equals(){
        if(getFamilyName().equals(getFirstName())){
            return true;
        }
        return false;
    }
    public double getGPA(){
        return GPA;
    }
}
