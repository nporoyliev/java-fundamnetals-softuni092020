package FinalExamFundamentals;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem03 {
    public static class Person {
        String name;
        public int received;
        public int sent;


        public Person (String name, int sent, int received) {
            this.name = name;
            this.sent = sent;
            this.received = received;

        }

        public void increaseSent () {
            this.sent++;
        }

        public void increaseReceived () {
            this.received++;
        }


    }

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        int capacity = Integer.parseInt (scanner.nextLine ());

        Map<String, Person> persons = new HashMap<> ();

        String input;
        while (!"Statistics".equals (input = scanner.nextLine ())) {
            String[] tokens = input.split ("\\=");
            String command = tokens[0];
            switch (command) {
                case "Add":

                    String name = tokens[1];
                    int sent = Integer.parseInt (tokens[2]);
                    int received = Integer.parseInt (tokens[3]);

                    if (!persons.containsKey (name)) {
                        persons.put (name, new Person (name, sent, received));
                    }
                    break;
                case "Message":
                    String sender = tokens[1];
                    String receiver = tokens[2];
                    if (persons.containsKey (sender) && persons.containsKey (receiver)) {
                        persons.get (sender).increaseSent ();
                        persons.get (receiver).increaseReceived ();

                        if (persons.get (sender).received + persons.get (sender).sent == capacity) {
                            System.out.printf ("%s reached the capacity!%n", sender);
                            persons.remove (sender);
                        }
                        if (persons.get (receiver).received + persons.get (receiver).sent == capacity) {
                            System.out.printf ("%s reached the capacity!%n", receiver);
                            persons.remove (receiver);
                        }
                    }
                    break;
                case "Empty":
                    String user = tokens[1];
                    if (user.equals ("All")) {
                        persons.clear ();
                    } else if (persons.containsKey (user)) {
                        persons.remove (user);
                    }
                    break;
            }

        }
        System.out.println ("Users count: " + persons.size ());
        persons.entrySet ().stream ()
                .sorted ((first, second) -> {
                    int result = second.getValue ().received - first.getValue ().received;
                    if (result == 0) {
                        result = first.getValue ().name.compareTo (second.getValue ().name);
                    }
                    return result;
                })
                .forEach (user -> {
                    System.out.printf ("%s - %d%n", user.getValue ().name, user.getValue ().sent + user.getValue ().received);
                });

    }
}
