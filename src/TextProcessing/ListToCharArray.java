package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListToCharArray {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        String line = scanner.nextLine ();

        List<Character> characterList = new ArrayList<> ();



        while (!line.equals ("end")) {
            characterList.add (line.charAt (0));

            line = scanner.nextLine ();
        }

        getCharArray (characterList);
    }

    private static void getCharArray (List<Character> characterList) {
        char[] letterArray = new char[characterList.size ()];
        for (int i = 0; i < characterList.size (); i++) {
            letterArray[i] = characterList.get (i);
        }
    }
}
