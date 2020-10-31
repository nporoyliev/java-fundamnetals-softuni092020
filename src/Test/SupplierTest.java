package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {

    public static Supplier<List<Person>> generateRandomPerson = () -> {
        List<Person> people = new ArrayList<> ();
        for (int i = 0; i < 100; i++) {
            people.add (new Person (Character.toString (i), new Random ().nextInt (100)));
        }
        return people;
    };

    public static class Person {
        String id;
        int age;

        public Person (String id, int age) {
            this.id = id;
            this.age = age;
        }
    }

    public static void main (String[] args) {


    }
}
