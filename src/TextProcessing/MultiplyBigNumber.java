package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        int mult = Integer.parseInt(scan.nextLine());
        if (mult==0){
            System.out.println(0);
        }else {
            int rem = 0;
            List<Integer> result = new ArrayList<> ();
            for (int i = num.length()-1; i >=0; i--) {
                int res = (num.charAt(i) -'0') * mult;
                res += rem;
                rem = res / 10;
                result.add(res % 10);
            }
            if (rem != 0){
                result.add(rem);
            }
            for (int i = result.size()-1; i >=0 ; i--) {
                System.out.print(result.get(i));

            }
            System.out.println();
        }
    }
}
