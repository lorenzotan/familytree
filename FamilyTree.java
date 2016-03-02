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
        printTree();
        //addPerson();
    }

    public static void addPerson() {
        Person relative = new Person();
        //relative.id = 
        relative.firstName = "Edwina";
        relative.lastName  = "Tan";
        relative.fatherId  = 1;
        relative.motherId  = 2;
        DBI connect = new DBI();
        connect.addRelative(relative);
    }

    public static void printTree() {
        HashMap<Integer, Person> people = new HashMap<>();

        DBI connect = new DBI();
        people = connect.getData();

        Set<Integer> keys = people.keySet();
        for (Integer key : keys) {
            people.get(key).father = people.containsKey(people.get(key).fatherId) ? people.get(people.get(key).fatherId) : null;
            people.get(key).mother = people.containsKey(people.get(key).motherId) ? people.get(people.get(key).motherId) : null;

            System.out.println("Name: " + people.get(key).firstName);

            if (people.get(people.get(key).fatherId) != null) {
                System.out.println("\tDad: " + people.get(key).father.firstName);
            } else {
                System.out.println("\tDad: Currently Unavailable");
            }

            if (people.get(people.get(key).motherId) != null) {
                System.out.println("\tMom: " + people.get(key).mother.firstName);
            } else {
                System.out.println("\tMom: Currently Unavailable");
            }
        }
    }
}
