package Methods;

import java.util.Scanner;

public class MathOperations {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        int first = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int second = Integer.parseInt(scanner.nextLine());

        double result = calculate (first, operator, second);
        System.out.printf ("%.0f", result);
    }

    private static double calculate (int first, String operator, int second) {
        double result = 0;
        switch (operator){
            case "+":
                result =  first + second;
                break;
            case"-":
                result = first - second;
                break;
            case"/":
                result = first / second;
                break;
            case"*":
                result =  first * second;
                break;
        }
        return result;
    }
}
