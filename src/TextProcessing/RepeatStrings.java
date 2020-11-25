package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings {
    public static void main (String[] args) {


        String[] words = new Scanner (System.in).nextLine ().split ("\\s+");

        List<String> repeatedWords = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            repeatedWords.add(repeat (words[i], words[i].length ()));
        }

        System.out.println (String.join ("", repeatedWords));
    }


    private static String repeat (String word, int count) {
            String[] repeatArr = new String[count];
        for (int i = 0; i < count; i++) {
            repeatArr[i] = word;
        }

        return String.join ("", repeatArr);
    }
}
