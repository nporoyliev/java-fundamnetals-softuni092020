package TextProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractFile {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        List<String> file = Arrays.asList(line.substring(line.lastIndexOf("\\") + 1).split("\\."));
        String nFile = String.join(".", file.subList(0, file.size()-1));
        String ext = file.get(file.size()-1);


        System.out.println("File name: " + nFile);
        System.out.println("File extension: " + ext);

  //   if (matcher.find ()) {
  //       String[] split1 = matcher.group (1).split ("\\.");
  //       System.out.println ("File name: " + split1[0]);
  //       System.out.println ("File extension: " + split1[1]);
  //


    }
}
