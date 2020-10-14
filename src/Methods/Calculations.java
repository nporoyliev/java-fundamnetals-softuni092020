package Methods;

import java.util.Scanner;

public class Calculations {
    public static void main (String[] args) {

        Scanner scan = new Scanner (System.in);

        String command = scan.nextLine ();

        int first = scan.nextInt ();
        int second = scan.nextInt ();

        System.out.println (calculation (command, first, second));
    }

    private static int calculation (String command, int first, int second) {
        int result = 0;
        switch (command) {
            case "add":
                result = first + second;
                break;
            case "multiply":
                 result = first * second;
                break;
            case "subtract":
                result = first - second;
                break;
            case "divide":
                result = first / second;
                break;
        }
        return result;
    }
}
