package Methods;

import java.util.Scanner;

public class Grades {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        double grade = scanner.nextDouble();

        System.out.println (evaluateGrade (grade));
    }

    private static String evaluateGrade (double grade) {
        if (grade < 3){
            return "Fail";
        }

        if (grade >= 3 && grade < 3.5){
            return "Poor";
        }
        if (grade >= 3.5 && grade < 4.5){
            return "Good";
        }
        if (grade >= 4.5 && grade < 5.5){
            return "Very good";
        }
        return "Excellent";
    }
}
