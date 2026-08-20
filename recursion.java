import java.util.Scanner;

public class recursion {
    public static void reverseAnArray(int [] arr1, int i) {
        if (i<arr1.length/2)
        {int temp = arr1[i];
        arr1 [i] = arr1 [arr1.length - i-1];
        arr1 [arr1.length - i-1] = temp;
        reverseAnArray(arr1, i+1);}
    }
    public static void sortAnArray (){
        //
    }
    public static int getFibonacciOf (int i){
        if (i == 0){
            return 0;
        }
        if (i == 1){
            return 1;
        }
        else {
            return getFibonacciOf(i-1)+getFibonacciOf(i-2) ;
        }
    }

    public static void main(String[] args) {
        // int[] arr1 = {4,523,542,56,42,45,65,-5};
        // for (int i : arr1) {
        //     System.out.print(i+", ");
        // }
        // System.out.println("");
        // reverseAnArray(arr1, 0);
        // for (int i : arr1) {
        //     System.out.print(i+", ");
        // }    
        System.out.println(getFibonacciOf( 5));
        }
}
