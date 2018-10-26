package RyanMcGovern;

public class Teacher extends Person{
    private String subject;
    private String title;

    public Teacher(String firstName, String familyName, String subject, String title) {
        super(firstName, familyName);
        this.subject = subject;
        this.title = title;
    }

    public  String getSubject(){return this.subject;}
    public String getTitle(){return this.title;}

    public void setSubject(){this.subject = subject;}
    public void setTitle(){this.title = title;}


}
