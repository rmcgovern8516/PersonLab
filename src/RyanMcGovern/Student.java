package RyanMcGovern;

import java.security.PublicKey;

public class Student extends Person{
    private String favTeach;
    private String school;
    private double GPA;
    public Student (String favTeach, String school, double GPA){
        super();
        super()
        this.favTeach = favTeach;
        this.school = school;
        this.GPA = GPA;
    }
    @Override
    public String getfavTeach(){

        return favTeach;
    }
    @Override
    public String getschool(){

        return school;
    }
    //@Override
    //public String toString(){

        //return familyName +","+firstName;
    //}
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
