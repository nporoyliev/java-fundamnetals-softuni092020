package Arrays;

import java.util.Scanner;

public class MaxSquenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] line = scan.nextLine().split(" ");
        int [] nums = new int[line.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(line[i]);
        }
        int mLen =1;
        int count = 1;
        int bInd = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]){
                count++;
            }else {
                count=1;
            }
            if (count>mLen){
                mLen=count;
                bInd = nums[i+1];
            }
        }

        for (int i = 0; i < mLen; i++) {
            System.out.print(bInd + " ");
        }
    }
}
