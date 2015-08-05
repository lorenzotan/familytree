package dbi;

import java.util.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import person.Person;

public class DBI {
    private static final String JDBC_DRIVER = "org.postgresql.Driver";
    private static final String DB_URL      = "jdbc:postgresql://localhost:5432/familytree";
    private static final String USER        = "historian";
    private static final String PW          = "familytree";

    private Connection c = null;
    private Statement s  = null;
    private ResultSet r  = null;

    public DBI() {
        try {
            Class.forName(JDBC_DRIVER);
            c = DriverManager.getConnection(DB_URL, USER, PW);
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": " + e.getMessage());
            System.exit(0);
        }
    }

    public HashMap<Integer, Person> getData() {
        HashMap<Integer, Person> relatives = new HashMap<>();

        try {
            String q = "select id, firstname, middlename, lastname, fatherid, motherid from person";
            r = s.executeQuery(q);
            System.out.println("Getting DB Records");

            while (r.next()) {
                Person relative    = new Person();
                relative.id        = r.getInt("id");
                relative.firstName = r.getString("firstname");
                relative.lastName  = r.getString("lastname");
                relative.fatherId  = r.getInt("fatherid");
                relative.motherId  = r.getInt("motherid");

                //System.out.println("Name: " + person.firstName + " " + person.lastName + "\tSize: " + people.size());

                relatives.put(relative.id, relative);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return relatives;
    }

    /*
    public ArrayList getData() {
        ArrayList<Person> people = new ArrayList<>();

        try {
            String q = "select id, firstname, middlename, lastname, fatherid, motherid from person";
            r = s.executeQuery(q);
            System.out.println("Records from DB");

            while (r.next()) {
                Person person    = new Person();
                person.id        = r.getInt("id");
                person.firstName = r.getString("firstname");
                person.lastName  = r.getString("lastname");
                person.fatherId  = r.getInt("fatherid");
                person.motherId  = r.getInt("motherid");

                System.out.println("Name: " + person.firstName + " " + person.lastName + "\tSize: " + people.size());

                people.add(person);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return people;
    }
    */

    public void addRelative(Person relative) {
        String fields = "id, firstName, lastName, fatherId, motherId";
        String values = "";
        String q = "insert into person (" + fields + ") values (" + values + ")";
        System.out.println(q);
        //try {
        //    String q = "insert into person (" + fields + ") values (" + values + ")";
        //    r = s.executeQuery(q);
        //    System.out.println("Adding " + relative.firstName + " " + relative.lastName);

        //} catch (Exception e) {
        //    System.out.println("Error: " + e);
        //}
    }

    public void read() {
        
    }

    public void update() {
        
    }

    public void remove() {
        
    }
}
