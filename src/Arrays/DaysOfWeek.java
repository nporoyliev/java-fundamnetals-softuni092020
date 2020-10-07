package Arrays;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main (String[] args) {


        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scanner = new Scanner (System.in);
        int day = scanner.nextInt ();

        if (day >= 1 && day <= daysOfWeek.length){
            System.out.println (daysOfWeek[day -1]);
        } else {
            System.out.println ("Invalid day!");
        }
    }
}
