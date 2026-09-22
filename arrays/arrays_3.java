package arrays;

import java.util.*;

public class arrays_3 {

    public static int majorityElement(int[] nums) {
        // iterate thru the map - O(NlogN)

        // 2nd approach - moore's voting algorithm
        //ideology - a majority element would never be completely cancelled
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

    public static void segregate0and1(int[] arr) {
		int i = 0, temp;
		for (int j = 0; j < arr.length; j++) {
              if (arr[j] == 0) {
                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
                  i++;
              }
          }
	}
    

    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);

        mysc.close();
    }
}
