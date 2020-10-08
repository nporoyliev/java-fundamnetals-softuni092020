package Arrays;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] line = scan.nextLine().split(" ");
        int [] nums = new int[line.length];
        int sum = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(line[i]);
        }
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int num = nums[i] + nums[j];
                if (sum == num){
                    System.out.println(nums[i]+" "+ nums[j]);
                }
            }
        }

    }
}
