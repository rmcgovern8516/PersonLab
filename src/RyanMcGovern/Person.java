package RyanMcGovern;

public class Person {
    private String firstName;
    private String familyName;
    public Person(String firstName, String familyName){
        this.firstName = firstName;
        this.familyName = familyName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getFamilyName(){
        return familyName;
    }
    public boolean equals(Person p){
        if(p.getFamilyName().equals(p.getFirstName())){
            return true;
        }
        return false;
    }
}
