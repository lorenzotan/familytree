import person.Person;
import dbi.DBI;
//import relationship.Relationship;
import java.util.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Set;

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
     * add/edit family member data
     */
    public static void main (String[] args) {
        HashMap<Integer, Person> people = new HashMap<>();
        //ArrayList<Person> people = new ArrayList<>();

        Person person = new Person();
        Person dne = null;

        DBI connect = new DBI();
        people = connect.getData();

        /* for ArrayList
        for (int i = 0; i < people.size(); i++) {
            person = people.get(i);
            System.out.println("Name: " + person.firstName);
        }
        */
        Set<Integer> keys = people.keySet();
        for (Integer key : keys) {
            people.get(key).father = people.containsKey(people.get(key).fatherId) ? people.get(people.get(key).fatherId) : null;
            people.get(key).mother = people.containsKey(people.get(key).motherId) ? people.get(people.get(key).motherId) : null;

            System.out.println("Name: " + people.get(key).firstName);

            if (people.get(people.get(key).fatherId) != null) {
                System.out.println("Dad: " + people.get(key).father.firstName);
            } else {
                System.out.println("Dad: Currently Unavailable");
            }

            if (people.get(people.get(key).motherId) != null) {
                System.out.println("Mom: " + people.get(key).mother.firstName);
            } else {
                System.out.println("Mom: Currently Unavailable");
            }
        }
    }

    public static void printTree() {
        
    }
}
