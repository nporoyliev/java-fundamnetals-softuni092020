package Arrays;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main (String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[n * 2];

        for (int i = 0; i < n * 2; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if ( i % 2 == 0 ){
                System.out.print (numbers[i] + " ");
                i += 2;
            } else {
                System.out.print (numbers[i] + " ");
            }
        }
        System.out.println ();
        for (int i = 1; i < numbers.length; i++) {
            if ( i % 2 != 0 ){
                System.out.print (numbers[i] + " ");
            } else {
                System.out.print (numbers[i] + " ");
                i += 2;
            }
        }
    }
}
