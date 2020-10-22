package Methods;

import java.util.Scanner;

public class TopNumber {
    public static void main (String[] args) {

        Scanner  scanner = new Scanner (System.in);

        int number = scanner.nextInt();


        for (int i = 1; i <=number; i++) {
            boolean divisible = false;
            boolean holdsOddDigit = false;
            int sum = 0;
            int temp = i;
            while (temp >0){
                 sum += temp % 10;
                 if ((temp % 10) % 2 != 0){
                     holdsOddDigit = true;
                 }
                 temp /= 10;
            }
            if (sum % 8 == 0){
            divisible = true;
            }
            if (divisible && holdsOddDigit){
                System.out.println (i);
            }
        }

    }
}
