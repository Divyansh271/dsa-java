package arrays;

import java.util.*;

public class arrays_2 {

    public static int findMissingNum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (n * (n + 1) / 2 - sum);
    }

    public static int maxConsecutiveOnes(int[] myarr) {
        int temp = 0, max = 0;
        for (int i : myarr) {
            if (i == 1) {
                temp++;
                if (temp > max) {
                    max = temp;
                }
            } else {
                temp = 0;
            }
        }
        return max;
    }

    public static int singleAppearanceInArray(int[] myarr) {
        // brute force - compare them in a nested loop. O(n**2)

        // better way - but fails when negative numbers and VERY large numbers in a
        // small array. use hashmap
        int max = 0;
        for (int i : myarr) {
            if (i > max) {
                max = i;
            }
        }
        int[] hsmp = new int[max + 1];
        for (int i : myarr) {
            hsmp[i]++;
        }
        for (int i = 0; i < hsmp.length; i++) {
            if (hsmp[i] == 1) {
                max = i;
                break;
            }
        }
        return max;
    }

    public static int largestSubarrayWithSumK(int[] myarr, int k) {
        // 1st attempt
        // int i = 0, j = 0, count = 0, temp_sum = 0;
        // while (j < myarr.length){
        // for (int l = i; l < j+1; l++) {
        // temp_sum+=myarr[l];
        // }
        // if (temp_sum > k){
        // i++;
        // }else if (temp_sum < k){
        // j++;
        // } else {
        // if(1+j-i > count){
        // count = 1+j-i;
        // }
        // i++;
        // j++;
        // }
        // temp_sum = 0;
        // }
        // return count;

        // 2nd attempt - a bit more optimised - O(2N)
        int i = 0, j = 0, count = 0, temp_sum = myarr[i];
        while (j < myarr.length) {
            if (temp_sum > k) {
                temp_sum -= myarr[i];
                i++;
            } else if (temp_sum < k) {
                if (j != myarr.length - 1) {
                    j++;
                    temp_sum += myarr[j];
                }
            } else {
                if (1 + j - i > count) {
                    count = 1 + j - i;
                }
                if (j != myarr.length - 1) {
                    temp_sum -= myarr[i];
                    i++;
                    j++;
                    temp_sum += myarr[j];
                } else {
                    break;
                }
            }
        }
        return count;

        // these subarrays can be counted as well
    }

    public static boolean twoSumCheck(int[] myarr, int n) {
        // ONLY CHECK if 2 elements from the list give the sum n

        // brute force method
        // int i =0, j = 0;
        // boolean check = false;
        // for (i = 0; i < myarr.length; i++) {
        // for (j = 0; j < myarr.length; j++) {
        // if (myarr[i] + myarr[j] == n){
        // check = true;
        // break;
        // }
        // }
        // }
        // return check;

        // better way - cut what's repeating
        // int i =0, j = 0;
        // boolean check = false;
        // for (i = 0; i < myarr.length; i++) {
        // for (j = i+1; j < myarr.length; j++) {
        // if (myarr[i] + myarr[j] == n){
        // check = true;
        // break;
        // }
        // }
        // }
        // return check;

        // optimal way
        boolean check = false;
        HashMap<Integer, Integer> hsmp = new HashMap<>();
        for (int i = 0; i < myarr.length; i++) {
            if (hsmp.containsKey(n - myarr[i])) {
                check = true;
                break;
            } else {
                hsmp.put(myarr[i], i);
            }
        }
        return check;
    }

    public static int[] sort0s1s2s(int[] nums) {
        // 1st method
        // int count0=0, count1=0, count2=0;
        // for (int i : nums) {
        // if (i == 0){
        // count0 ++;
        // } else if (i == 1){
        // count1 ++;
        // }else {
        // count2 ++;
        // }
        // }
        // for (int i = 0; i < count0; i++) {
        // nums[i] = 0;
        // }
        // for (int i = 0; i < count1; i++) {
        // nums[i+count0] = 1;
        // }
        // for (int i = 0; i < count2; i++) {
        // nums[i+count0+count1] = 2;
        // }
        // return nums;

        // 2nd method
        // int i = 0, j = 1, k = nums.length - 1;
        // int temp;
        // while (j <= k) {
        // if (nums[j] == 0 && i != j) {
        // if (nums[i] == 0) {
        // i++;
        // temp = nums[i];
        // nums[i] = nums[j];
        // nums[j] = temp;
        // } else {
        // temp = nums[i];
        // nums[i] = nums[j];
        // nums[j] = temp;
        // i++;
        // }
        // } else if (nums[j] == 2 && j != k) {
        // if (nums[k] == 2) {
        // k--;
        // temp = nums[k];
        // nums[k] = nums[j];
        // nums[j] = temp;
        // } else {
        // temp = nums[k];
        // nums[k] = nums[j];
        // nums[j] = temp;
        // k--;
        // }
        // } else {
        // j++;
        // }
        // }

        // 3: Dutch Flag Algo
        int i = 0, j = 0, k = nums.length - 1, temp;

        while (j <= k) {
            if (nums[j] == 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            } else if (nums[j] == 2) {
                temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                k--;
            } else {
                j++;
            }
        }
        return nums;

    }

    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);

        // To find the missing number in 0 to N
        // System.out.println("Enter the number of elements:");
        // int n = mysc.nextInt();
        // int[] arr1 = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr1[i] = mysc.nextInt();
        // }
        // System.out.println(findMissingNum(arr1));

        // System.out.println("Enter the number of elements:");
        // int n = mysc.nextInt();
        // int[] arr1 = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr1[i] = mysc.nextInt();
        // }
        // System.out.println(singleAppearanceInArray(arr1));

        // System.out.println("Enter the number of elements:");
        // int n = mysc.nextInt();
        // System.out.println("Enter the sum u want..?");
        // int k = mysc.nextInt();
        // System.out.println("Enter array numbers:");
        // int[] arr1 = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr1[i] = mysc.nextInt();
        // }
        // System.out.println(largestSubarrayWithSumK(arr1, k));
        // mysc.close();

        // System.out.println("Enter the number of elements:");
        // int n = mysc.nextInt();
        // System.out.println("Enter the sum u want..?");
        // int k = mysc.nextInt();
        // System.out.println("Enter array numbers:");
        // int[] arr1 = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr1[i] = mysc.nextInt();
        // }
        // System.out.println(largestSubarrayWithSumK(arr1, k));

        // System.out.println("Enter the number of elements:");
        // int n = mysc.nextInt();
        // System.out.println("Enter the sum u want..?");
        // int k = mysc.nextInt();
        // System.out.println("Enter array numbers:");
        // int[] arr1 = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr1[i] = mysc.nextInt();
        // }
        // System.out.println(twoSumCheck(arr1, k));

        System.out.println("Enter the number of elements:");
        int n = mysc.nextInt();
        System.out.println("Enter array numbers:");
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = mysc.nextInt();
        }
        for (int i : sort0s1s2s(arr1)) {
            System.out.print(i + " ");
        }
        mysc.close();
    }
}
