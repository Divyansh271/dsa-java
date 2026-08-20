package arrays;

import java.util.*;

public class arrays_1 {
    public static int largestElementInArray(int[] myarr) {
        int max = myarr[0];
        for (int ele : myarr) {
            if (ele > max) {
                max = ele;
            }
        }
        return max;
    }

    public static int secondLargestElementInArray(int[] myarr) {
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < myarr.length; i++) {
            if (myarr[i] > max) {
                secondMax = max;
                max = myarr[i];
            }
        }
        return secondMax;

    }

    public static void checkIfArraySorted(int[] myarr) {
        boolean check = true;
        for (int i = 0; i < myarr.length - 1; i++) {
            if (myarr[i + 1] <= myarr[i]) {
                check = false;
            }
        }
        if (check) {
            System.out.println("Array is Sorted.");
        } else {
            System.out.println("Array is not Sorted.");
        }
    }

    public static int[] removeDuplicatesFromSorted(int[] myarr) {
        int n = myarr.length;
        int[] retarr = new int[n];
        retarr[0] = myarr[0];
        int i = 0, j = 1;
        while (i < n - 1) {
            if (myarr[i] != myarr[i + 1]) {
                retarr[j] = myarr[i + 1];
                j++;
            }
            i++;
        }
        return retarr;

    }

    public static int[] shiftBykPlaces(int[] myarr, int k) {
        int temp;
        if (k > 0) {
            for (int i = 0; i < myarr.length - 1; i++) {
                temp = myarr[i];
                myarr[i] = myarr[i + 1];
                myarr[i + 1] = temp;
            }
            shiftBykPlaces(myarr, k - 1);
        }

        // alt way
        k = k % myarr.length;
        // reverse from a to a+k and add it at the end of a+k+1 to a+n.
        return myarr;
    }

    public static int[] moveZeroesToEnd(int[] myarr) {
        // int temp;
        // for (int i = 0; i < myarr.length; i++) {
        // if (myarr[i] == 0){
        // for (int j = i; j < myarr.length-1; j++) {
        // temp = myarr[j];
        // myarr[j] = myarr[j+1];
        // myarr[j+1] = temp;
        // }
        // }
        // }
        // return myarr;

        // ALT WAY - 2 pointer way
        int i = 0, temp;
        for (int j = 0; j < myarr.length; j++) {
            if (myarr[j] == 0) {
                if (myarr[i] != 0) {
                    i = j;
                }
            } else if (myarr[i] == 0) {
                temp = myarr[i];
                myarr[i] = myarr[j];
                myarr[j] = temp;
                i++;
            }
        }
        return myarr;
    }

    public static boolean linearSearchArray(int[] myarr, int n) {
        boolean check = false;
        for (int i : myarr) {
            if (i == n) {
                check = true;
                break;
            }
        }
        return check;
    }

    public static int[] unionOf2SortedArrays(int[] myarr1, int[] myarr2) {
        int n1 = myarr1.length;
        int n2 = myarr2.length;
        int[] ret_arr = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (myarr1[i] < myarr2[j]) {
                if (k == 0 || ret_arr[k - 1] != myarr1[i]) {
                    ret_arr[k++] = myarr1[i];
                }
                i++;
            } else if (myarr1[i] > myarr2[j]) {
                if (k == 0 || ret_arr[k - 1] != myarr2[j]) {
                    ret_arr[k++] = myarr2[j];
                }
                j++;
            } else { // myarr1[i] == myarr2[j]
                if (k == 0 || ret_arr[k - 1] != myarr1[i]) {
                    ret_arr[k++] = myarr1[i];
                }
                i++;
                j++;
            }
        }

        while (i < n1) {
            if (k == 0 || ret_arr[k - 1] != myarr1[i]) {
                ret_arr[k++] = myarr1[i];
            }
            i++;
        }
        while (j < n2) {
            if (k == 0 || ret_arr[k - 1] != myarr2[j]) {
                ret_arr[k++] = myarr2[j];
            }
            j++;
        }
        return Arrays.copyOf(ret_arr, k);
    }

    public static int[] intersectionOf2SortedArrays(int[] myarr1, int[] myarr2) {
        int n1 = myarr1.length;
        int n2 = myarr2.length;

        int[] ret_arr = new int[Math.min(n1, n2)];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {

            if (myarr1[i] < myarr2[j]) {
                i++;
            }

            else if (myarr1[i] > myarr2[j]) {
                j++;
            }

            else { // myarr1[i] == myarr2[j]

                if (k == 0 || ret_arr[k - 1] != myarr1[i]) {
                    ret_arr[k++] = myarr1[i];
                }

                i++;
                j++;
            }
        }

        return Arrays.copyOf(ret_arr, k);
    }

    public static void main(String[] args) {
        int[] arr1 = { 12, 46, 23, 9, 65, 31, 89, 34, 3 };
        int[] arr2 = { 3, 5, 5, 45, 63, 63, 79 };
        int[] arr_zeroes = { 0, 23, 0, 56, 4, 0, 13 };
        int[] sorted_arr_1 = { 2, 5, 8, 13, 13, 19 };
        int[] sorted_arr_2 = { 1, 4, 7, 7, 11, 16, 21, 21, 25 };

        System.out.println(largestElementInArray(arr1));
        System.out.println(secondLargestElementInArray(arr1));

        checkIfArraySorted(arr1);
        checkIfArraySorted(arr2);

        int[] arr3 = removeDuplicatesFromSorted(arr2);
        for (int i : arr3) {
            System.out.print(i + " ");
        }
        System.out.println("");

        int[] arr4 = shiftBykPlaces(arr1, 3);
        for (int i : arr4) {
            System.out.print(i + " ");
        }
        System.out.println("");

        int[] arr_zeroes2 = moveZeroesToEnd(arr_zeroes);
        for (int i : arr_zeroes2) {
            System.out.print(i + " ");
        }
        System.out.println("");

        System.out.println(linearSearchArray(arr1, 89));

        int[] sortedUnionArr = unionOf2SortedArrays(sorted_arr_1, sorted_arr_2);
        for (int i : sortedUnionArr) {
            System.out.print(i + " ");
        }
        System.out.println("");

    }
}
