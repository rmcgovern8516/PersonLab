package RyanMcGovern;

public class Teacher extends Person{
    private String subject;
    private String title;

    public Teacher(String firstName, String familyName, String subject, String title) {
        super(firstName, familyName);
        this.subject = subject;
        this.title = title;
    }

    public String getSubject(String subject){return this.subject;}
    public String getTitle(String title){return this.title;}

    public void setSubject(String subject){this.subject = subject;}
    public void setTitle(String title){this.title = title;}


}
