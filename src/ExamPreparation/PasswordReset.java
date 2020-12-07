package ExamPreparation;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String rawPassword  = scanner.nextLine();
        String input;

        while (!"Done".equals(input = scanner.nextLine())){
            String[] commands = input.split("\\s+");

            switch (commands[0]){
                case"TakeOdd":
                    String tempPassword ="";
                    for (int i = 1; i < rawPassword.length(); i+=2) {
                        tempPassword += rawPassword.charAt(i);
                    }
                    rawPassword = tempPassword;
                        System.out.println(rawPassword);
                    break;
                case"Cut":
                    int startIndex = Integer.parseInt(commands[1]);
                    int length = Integer.parseInt(commands[2]);
                    System.out.println(rawPassword.replaceFirst(rawPassword.substring(startIndex, startIndex + length),  ""));
                    break;
                case"Substitute":
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }

    }
}
