package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main (String[] args) {

    Scanner scanner = new Scanner (System.in);

    String type = scanner.nextLine();

    switch (type){
        case "int":
            int first = Integer.parseInt(scanner.nextLine());
            int second = Integer.parseInt(scanner.nextLine());
            System.out.println (getMax(first,second));
            break;
        case "char":
            char firstChar = scanner.nextLine ().charAt (0);
            char secondChar = scanner.nextLine ().charAt (0);
            System.out.println ((char)getMax (firstChar,secondChar));
            break;
        case "string":
            String firstString = scanner.nextLine();
            String secondString = scanner.nextLine();
            System.out.println (getMax(firstString,secondString));
            break;
    }

    }

    private static String getMax (String firstString, String secondString) {
        int result = firstString.compareTo (secondString);
        if (result >= 0){
            return firstString;
        } else {
            return secondString;
        }
    }

    private static int getMax (int first, int second) {
        return Math.max(first,second);
    }
}
