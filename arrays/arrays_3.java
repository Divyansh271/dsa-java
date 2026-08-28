package arrays;

import java.util.*;

public class arrays_3 {

    public static int majorityElement(int[] nums) {
        // iterate thru the map - O(NlogN)

        // 2nd approach - moore's voting algorithm
        int majority = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                majority = nums[i];
            } else if (nums[i] == majority) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }

    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);

        mysc.close();
    }
}
