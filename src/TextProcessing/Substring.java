package TextProcessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Substring {
    public static void main (String[] args) {

        String word = "abc";
        String text = "abctabctq";
        String result = "";

        text = replaceStringWithReplaceMethod (word, text);

        text = getStringWithSplit (word, text);

        System.out.println (text);
    }


    private static String replaceStringWithReplaceMethod (String word, String text) {
        while (text.contains (word)) {
            text = text.replace (word, "");
        }
        return text;
    }

    private static String getStringWithSplit (String word, String text) {
        while (text.contains (word)) {
            String[] temp = text.split (word);
            text = String.join ("", temp);
        }
        return text;
    }
}

