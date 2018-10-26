package RyanMcGovern;

import jdk.internal.dynalink.beans.StaticClass;

public class Runner {

    public static Iterable<? extends Student> Students;
    public static Teacher t1;

    public static void Students(){
        Student s1 = new Student("Bob", "Bob", "Mr.Levin", "BTHS", 3.2);
        Student s2 = new Student("Sam", "Robertson", "Mr.Levin", "BTHS",2.7);
        Teacher t1= new Teacher("Nathan", "Fowell", "Compsci", "Mr");
        Student[] Students = {s1, s2};
    }
    public static void main(String[] args) {
        // write your code here
        Runner.Students();
        for(Student p : Students ){
            System.out.println(p);
            System.out.println("My first name is "+p.getFirstName());
            System.out.println("My family name is "+p.getFamilyName());
            System.out.println("My GPA name is "+p.getGPA());
            System.out.println("Is my family name the same as my first name? "+p.equals());
        }
    }
}