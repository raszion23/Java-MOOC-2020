
public class Main {

    public static void main(String[] args) {
        Room r = new Room();
        Person first = new Person("first", 2);
        Person second = new Person("second", 1);
        Person third = new Person("third", 3);

        r.add(first);
        r.add(second);
        r.add(third);

        Person shortestPerson = r.take();
        System.out.println(shortestPerson); //expected:<second (1 cm)> but was:<first (2 cm)>
    }
}
