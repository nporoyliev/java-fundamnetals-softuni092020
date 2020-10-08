package Arrays;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class ArrayRotation {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        Deque<String> deque = new ArrayDeque<> ();

        String[] split = scanner.nextLine ().split ("\\s+");

        Collections.addAll (deque, split);
        int n = scanner.nextInt ();

        for (int i = 0; i < n; i++) {
        String s = deque.poll ();
        deque.add (s);
        }

        while(!deque.isEmpty ()){
            System.out.print (deque.poll () + " ");
        }

    }
}
