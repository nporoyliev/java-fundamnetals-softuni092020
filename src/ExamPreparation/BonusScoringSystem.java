package ExamPreparation;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int studentCount = Integer.parseInt (scanner.nextLine ());
        double lectureCount = Double.parseDouble(scanner.nextLine());
        double additionalBonusCount = Double.parseDouble(scanner.nextLine());

        double maxTotalBonus = 0;
        int attedndenceCount = 0;

        while(studentCount-- >0){
            int studentAttendance = Integer.parseInt (scanner.nextLine ());
            double currentBonus = (studentAttendance / lectureCount) * (5 + additionalBonusCount);
            if (maxTotalBonus < currentBonus){
                maxTotalBonus = currentBonus;
                attedndenceCount = studentAttendance;
            }
        }
        System.out.printf ("Max Bonus: %.0f.%n", Math.ceil (maxTotalBonus));
        System.out.printf ("The student has attended %d lectures.", attedndenceCount);
    }
}
