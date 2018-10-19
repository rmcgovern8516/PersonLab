package RyanMcGovern;

public abstract class Person {
    private String firstName;
    private String familyName;
    public Person(String firstName, String familyName){
        this.firstName = firstName;
        this.familyName = familyName;
    }
    public abstract String getFirstName();
    public abstract String getFamilyName();
    public void String toString(){

    }

}
