
/**
 * File: Room.java
 * Author: Anthony Francis
 * Date: Mar 19, 2020
 * Purpose:
 */
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> people;

    public Room() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        if (!people.contains(person)) {
            people.add(person);
        }
    }

    public boolean isEmpty() {
        if (people.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.people;
    }

    public Person shortest() {
        if (this.people.isEmpty()) {
            return null;
        }

        Person shortest = this.people.get(0);

        for (Person person : this.people) {
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take() {
        if (this.people.isEmpty()) {
            return null;
        }
        
        Person shortest = this.shortest();
        this.people.remove(shortest());
        

        return shortest;
    }
}
