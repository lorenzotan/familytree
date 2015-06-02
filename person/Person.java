package person;

public class Person {
    public Person father;
    public Person mother;
    public Person[] child;

    public int id;
    public String firstName;
    public String lastName;
    public int fatherId;
    public int motherId;

    public Person() {
        //System.out.println("Constructor of Person");
    }

    public Person(int id,
        String fName, String lName,
        int fatherId, int motherId
    ) {
        this.id        = id;
        this.firstName = fName;
        this.lastName  = lName;
        this.fatherId  = fatherId;
        this.motherId  = motherId;

        System.out.println("Constructor of Person");
    }

}
