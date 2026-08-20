package patterns;
import java.util.Scanner;

//numeric and alphabetic patterns

public class pattern_2 {

    public static void pyramid_bin (int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if((i+j)%2==0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }

    public static void numeric_twin_towers (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1);
            }
            for (int j = 0; j < 2*(n-i-1); j++) {
                System.out.print(" ");
            }
            for (int j = i+1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void numeric_stairs (int n){
        int step = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(step+" ");
                step++;
            }
            System.out.println("");
        }
    }

    public static void alphabetic_stairs (int n){
        for (int i = 0; i < n; i++) {
            int step = 65;
            for (int j = 0; j <= i; j++) {
                System.out.print((char)step+" ");
                step++;
            }
            System.out.println("");
        }
    }
    
    public static void alphabetic_pyramid (int n){
        //my way
        // for (int i = 0; i < n; i++) {
        //     int step = 65;
        //     for (int j = 0; j < n - 1 - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < i + 1; j++) {
        //         System.out.print((char)(step+j));
        //     }
        //     for (int j = i; j > 0; j--) {
        //         System.out.print((char)(step + j -1));
        //     }
        //     System.out.println("");
        // }

        //aliter 1
        
        for (int i = 0; i < n; i++) {
            int step = 65;
            for (int j = 0; j < n - 1 - i; j++) {           //do it later
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                int breakpt = n-i-1;
                System.out.print((char)(step));
                if (j>breakpt) {
                    step++;
                } else {
                    step --;
                }
            }
        }
    }

    public static void rev_alphabetic_triangle (int n){
        for (int i = 0; i < n; i++) {
            int step = 64+n;
            for (int j = 0; j < i+1; j++) {
                System.out.print((char)(step-i+j));
            }
            System.out.println("");
        }
    }
    
    public static void numeric_square (int n){
        //my way
        // for (int i = 0; i < n; i++) {
        //     int boy = n;
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(boy+" ");
        //         if( i>j ){
        //             boy--;
        //         } 
        //     }
        //     for (int j = 0; j < n-1; j++) {
        //         if (i+j > n-2){
        //             boy = j+2;
        //         }
        //         System.out.print(boy+" ");
        //     }
        //     System.out.println("");
        // }
        // for (int i = 0; i < n-1; i++) {
        //     int boy = n;
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(boy+" ");
        //         if (i+j<n-2){
        //             boy--;
        //         }
        //     }s
        //     for (int j = 0; j < n-1; j++) {
        //         if(j>i){
        //             boy=j+2;
        //         }
        //         System.out.print(boy+" ");
                
        //     }
        //     System.out.println("");
        // }

        //striver soln
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n -1; j++) {
                int top = i;
                int left = j;
                int bottom = 2*n - 2 - i;
                int right = 2*n - 2 -j;
                System.out.print(n-Math.min(Math.min(top, left),Math.min(bottom, right))+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);

        // System.out.println("Enter size of binary pyramid.");
        // int n = mysc.nextInt();
        // pyramid_bin(n);

        // System.out.println("Enter size of numeric twin tower.");
        // int n = mysc.nextInt();
        // numeric_twin_towers(n);

        // System.out.println("Enter size of numeric stairs.");
        // int n = mysc.nextInt();
        // numeric_stairs(n);

        // System.out.println("Enter size of alphabetic stairs.");
        // int n = mysc.nextInt();
        // alphabetic_stairs(n);

        // System.out.println("Enter size of alphabetic pyramid.");
        // int n = mysc.nextInt();
        // alphabetic_pyramid(n);

        // System.out.println("Enter size of alphabetic triangle.");
        // int n = mysc.nextInt();
        // rev_alphabetic_triangle(n);

        System.out.println("Enter size of numeric square.");
        int n = mysc.nextInt();
        numeric_square(n);

        mysc.close();
    }
}
