package ExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main (String[] args) {

        String barcodeRegex = "^@#+[A-Z]\\w{4,}[A-Z]@#+";
        String digitRegex = "\\d";
        Pattern barcodePattern = Pattern.compile (barcodeRegex);
        Pattern digitPattern = Pattern.compile (digitRegex);

        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt (scanner.nextLine ());

        while (n-- > 0) {
            String barcode = scanner.nextLine ();

            Matcher barcodeMatcher = barcodePattern.matcher (barcode);

            StringBuilder productGroup = new StringBuilder ();

            if (barcodeMatcher.find ()) {
                Matcher digitMatcher = digitPattern.matcher (barcode);

                while (digitMatcher.find ()) {
                    productGroup.append (digitMatcher.group ());
                }
                if (productGroup.length () == 0) {
                    productGroup.append ("00");
                }
                System.out.printf ("Product group: %s%n", productGroup);
            } else {
                System.out.println ("Invalid barcode");
            }
        }
    }
}
