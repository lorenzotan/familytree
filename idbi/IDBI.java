package idbi;

import java.util.*;
import person.Person;

public interface IDBI {
    public HashMap<Integer, Person> getData();
    public void addRelative(Person p);
}
