package RyanMcGovern;

import jdk.internal.dynalink.beans.StaticClass;

public class Runner {

    public static void main(String[] args) {
        // write your code here
        Student student1 = new Student("Bob", "Bob", 3.5);
        Student student2 = new Student("Sam", "Robertson", 2.7);
        Student[] students = {student1, student2};
        for(Student p : students ){
            System.out.println(p);
            System.out.println("My first name is "+p.getFirstName());
            System.out.println("My family name is "+p.getFamilyName());
            System.out.println("My GPA name is "+p.getGPA());
            System.out.println("Is my family name the same as my first name? "+p.equals());
        }
    }
}