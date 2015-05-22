package person;

public class Person {
    Person father;
    Person mother;
    Person[] child;

    public int id;
    public String FirstName;
    public String LastName;
    public int fatherId;
    public int motherId;

    public Person() {
        System.out.println("Constructor of Person");
    }
}
