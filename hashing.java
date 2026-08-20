import java.util.*;

public class hashing {
    public static void main(String[] args) {
        //HashMap hsmp = new HashMap<>();

        Scanner mysc = new Scanner(System.in);
        int n = mysc.nextInt();

        int[] arr1 = new int[n];
        int[] hash1  = new int[n+5];

        for (int i = 0; i < n; i++) {
            arr1 [i] = mysc.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            hash1[arr1[i]] = mysc.nextInt();
        }
        for (int i : hash1) {
            System.out.print(i+", ");
        }
        mysc.close();
    }
}
