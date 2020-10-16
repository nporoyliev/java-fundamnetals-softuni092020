package Methods;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main (String[] args) {


        Scanner scanner = new Scanner(System.in);

        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        System.out.printf ("%.0f",calculateArea (width, height));
    }

    private static double calculateArea (double width, double height) {
        return width * height;
    }
}
