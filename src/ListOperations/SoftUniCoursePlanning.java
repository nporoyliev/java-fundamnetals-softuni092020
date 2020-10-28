package ListOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner ( System.in );

        List<String> courses = Arrays.stream ( scanner.nextLine ( ).split ( ", " ) )
                .collect ( Collectors.toList ( ) );

        String input = scanner.nextLine ( );

        while (!input.equals ( "course start" )) {

            String[] tokens = input.split ( ":" );

            switch (tokens[0]) {
                case "Add":
                    String lessonTitle = tokens[1];
                    if ( !courses.contains ( lessonTitle ) ) {
                        courses.add ( lessonTitle );
                    }
                    break;
                case "Insert":
                    if ( !courses.contains ( tokens[1] ) ) {
                        courses.add ( Integer.parseInt ( tokens[2] ), tokens[1] );
                    }
                    break;
                case "Remove":
                    courses.remove ( tokens[1] );
                    break;
                case"Swap":
                    if (courses.contains ( tokens[1] ) && courses.contains ( tokens[2])){

                        int indexOfFirst = courses.indexOf ( tokens[1] );
                        int indexOfSecond = courses.indexOf ( tokens[2] );
                        String temp = courses.get ( indexOfFirst );

                        courses.set ( indexOfFirst, tokens[2] );
                        courses.set ( indexOfSecond, temp );
                    }
                    break;
                case "Exercise":
                    if ( courses.contains ( tokens[1]) ){
                        int indexOfLesson = courses.indexOf ( tokens[1]);
                        courses.add ( indexOfLesson + 1, tokens[1] + "-Exercise" );
                    } else {
                        courses.add ( tokens[1] );
                        courses.add ( tokens[1] + "-Exercise" );
                    }
                    break;
            }
            input = scanner.nextLine ( );
        }

        printCourses ( courses );
    }

    private static void printCourses ( List<String> courses ) {
        AtomicInteger counter = new AtomicInteger(1);
        courses.stream ()
                .forEach ( course -> {
                    System.out.println (counter + "." + course );
                    counter.incrementAndGet ();
                } );
    }
}
