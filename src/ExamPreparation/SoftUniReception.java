package ExamPreparation;

import java.util.Scanner;

public class SoftUniReception {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        double firstEmployeeEfficiency = scanner.nextDouble ();
        double secondEmployeeEfficiency = scanner.nextDouble ();
        double thirdEmployeeEfficiency = scanner.nextDouble ();

        double totalEfficiency = firstEmployeeEfficiency + secondEmployeeEfficiency + thirdEmployeeEfficiency;

        int totalStudentCount = scanner.nextInt();
        int finalTime =0;

        while(totalStudentCount >0){
            totalStudentCount -= totalEfficiency;
            finalTime++;

            if (finalTime % 4 == 0){
                finalTime++;
            }
        }
        System.out.printf ("Time needed: %.0fh.",Math.ceil(finalTime));




    }
}
