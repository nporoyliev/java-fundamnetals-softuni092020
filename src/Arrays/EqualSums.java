package Arrays;

import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] line = scan.nextLine().split(" ");
        int [] nums = new int[line.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(line[i]);
        }
        boolean ind = false;
        for (int i = 0; i < nums.length; i++) {
            int lsum = 0, rsum =0;
            for (int j = i-1; j >=0 ; j--) {
                lsum += nums[j];
            }
            for (int j = i+1; j < nums.length; j++) {
                rsum += nums[j];
            }
            if (lsum==rsum){
                System.out.print(i);
                ind=true;
                break;
            }
        }
        if (ind != true){
            System.out.println("no");
        }
    }
}
