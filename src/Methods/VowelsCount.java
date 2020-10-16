package Methods;

import java.util.Scanner;

public class VowelsCount {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        int vowelsCount = countVowels (scanner);

        System.out.println (vowelsCount);

    }

    private static int countVowels (Scanner scanner) {

        char[] charInput = scanner.nextLine ().toLowerCase ().toCharArray ();
        int vowelsCount = 0;


        for (int index = 0; index < charInput.length; index++) {
            if (charInput[index] == 'a' ||
                    charInput[index] == 'o' ||
                    charInput[index] == 'e' ||
                    charInput[index] == 'i' ||
                    charInput[index] == 'u') {
                vowelsCount++;
            }
        }

        return vowelsCount;
    }
}
