import person.Person;
import dbi.DBI;
//import relationship.Relationship;
import java.util.HashMap;

public class FamilyTree {
    String FirstName;
    String LastName;
    int fatherId;
    int motherId;

    /*
     * get data from database
     * create person object per record
     * create person tree based on the data
     * output tree
     * set a point of reference
     * search tree based on reference (parents, kids, grandkids, cousins, etc)
     */
    public static void main (String[] args) {
        //HashMap<Person> person = new HashMap<Person>();

        Person person = new Person();

        DBI connect = new DBI();
        connect.getData();
        
    }

    //private static Person 
}
