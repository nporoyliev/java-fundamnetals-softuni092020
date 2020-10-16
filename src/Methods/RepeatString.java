package Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        int count = Integer.parseInt (scanner.nextLine ());

        repeatString (count, string);
    }

    private static void repeatString (int count, String string) {
        for (int i = 0; i < count; i++) {
            System.out.print (string);
        }
    }
}
