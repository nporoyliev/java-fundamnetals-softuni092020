package Methods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        String password = scanner.nextLine ();

        passwordValidator (password);


    }

    private static void passwordValidator (String password) {

        boolean passwordLength = checkPasswordLength (password);
        boolean numbersOfDigits = checkMinimumCountOfDigits (password);
        boolean lettersAndDigits = checkForLetterAndDigits (password);

        if (password.length () == 0){
            passwordLength = false;
            numbersOfDigits = false;
            lettersAndDigits = false;
        }

        printResult(passwordLength, lettersAndDigits,numbersOfDigits);

    }

    private static void printResult (boolean passwordLength, boolean lettersAndDigits, boolean numbersOfDigits) {
        if (passwordLength && lettersAndDigits && numbersOfDigits){
            System.out.println ("Password is valid");
        }
        if (!passwordLength){
            System.out.println ("Password must be between 6 and 10 characters");
        }
        if (!lettersAndDigits){
            System.out.println ("Password must consist only of letters and digits");
        }
        if (!numbersOfDigits){
            System.out.println ("Password must have at least 2 digits");
        }
    }

    private static boolean checkMinimumCountOfDigits (String password) {
        int digCount = 0;
        for (int i = 0; i < password.length (); i++) {
            char currentChar = password.charAt (i);
            if (Character.isDigit (currentChar)){
                digCount++;
            }
            if (digCount >= 2){
                return true;
            }
        }
        return false;
    }

    private static boolean checkForLetterAndDigits (String password) {
        String n = "(\\w)*";
        return password.matches (n);
    }

    private static boolean checkPasswordLength (String password) {
        String checker = "(.){6,10}";
        return password.matches (checker);
    }
}
