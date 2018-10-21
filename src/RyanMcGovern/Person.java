package RyanMcGovern;

public abstract class Person {
    private String type;
    public Person(String type){
        this.type = type;
    }
    public abstract String getFirstName();
    public abstract String getFamilyName();
    public abstract String toString();
    public abstract boolean equals();
}
