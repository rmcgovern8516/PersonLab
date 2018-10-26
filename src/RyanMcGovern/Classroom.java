package RyanMcGovern;
import RyanMcGovern.Student;
import RyanMcGovern.Person;
import RyanMcGovern.Teacher;
import RyanMcGovern.Runner;

import static RyanMcGovern.Runner.Students;

public class Classroom {
    private String[] students[];
    private Teacher teacher;

    public Classroom(String[] Students, Teacher) {
        this.students[]= Students;
        this.teacher = Teacher;
    }

    public double classAverage(){
        double aver= 0;
        for (int n=0; n<students.length; n++) {
            aver = aver + Student.getGPA();
            aver = aver / students.length;
        }
        return aver;
    }

    public String getSubject(){
        String sub= "";
        sub= Teacher.getSubject();
        return sub;
    }

    public String printClass(){
        String print= "";
        print= "Teacher: " + teacher + "Class: " ;
        for (int n=0; n<students.length; n++){
            print= print + students[n] + ", ";
        }
        return print;
    }

}