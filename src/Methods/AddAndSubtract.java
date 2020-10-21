package Methods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        sum(first, second);
        subtract(third, sum (first,second) );
    }

    private static void subtract (int third, int sum) {
        System.out.println (sum - third );
    }


    private static int sum (int first, int second) {
        return first + second;
    }
}
