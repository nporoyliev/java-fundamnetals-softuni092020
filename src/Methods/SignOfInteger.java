package Methods;

import java.util.Scanner;

public class SignOfInteger {
    public static void main (String[] args) {
     
        Scanner scan = new Scanner(System.in);
        
        int number = Integer.parseInt(scan.nextLine());

        System.out.printf ("The number %d is %s",number, signOfInteger(number));
    }

    private static String signOfInteger (int number) {

      if (number < 0 ){
          return "negative.";
      }
      if (number == 0){
          return "zero.";
      }
     return "positive.";

    }

}
