package patterns;
import java.util.Scanner;

//these are all aestrisk patterns

public class pattern_1 {
    public static void pattern_rectangle(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pattern_triangle(int n) {
        // put j+1 instead of *, for the num triangle.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pattern_pyramid(int n) {
        // my way
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < 2 * n - 1; j++) {
        // if ((j < n) && ((i + j >= n - 1)) || ((j >= n) && (j - i <= n - 1))) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println("");
        // }

        // aliter 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (j < n - i - 1 || j > n + i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    public static void pattern_diamond(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < 1 + i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - 3 - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pattern_half_diamond(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pattern_square (int n){
        //my way
        // for (int i = 0; i < n; i++) {
        //     System.out.print("*");
        // }
        // System.out.println("");
        // for (int i = 0; i < n-2; i++) {
        //     System.out.print("*");
        //     for (int j = 0; j < n-2; j++) {
        //         System.out.print(" ");
        //     }
        //     System.out.println("*");
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.print("*");
        // }

        //aliter 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 || i == n-1 || j ==0 || j == n-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);

        // System.out.print("Enter the no. of rows of the rectangle: ");
        // int n = mysc.nextInt();
        // System.out.print("Enter the no. of columns of the rectangle: ");
        // int m = mysc.nextInt();
        // pattern_rectangle(n, m);

        // System.out.println("Enter length of triangle.");
        // int n = mysc.nextInt();
        // pattern_triangle(n);

        // System.out.println("Enter length of pyramid.");
        // int n = mysc.nextInt();
        // pattern_pyramid(n);

        // System.out.println("Enter size of diamond.");
        // int n = mysc.nextInt();
        // pattern_diamond(n);

        // System.out.println("Enter size of half diamond.");
        // int n = mysc.nextInt();
        // pattern_half_diamond(n);
        
        System.out.println("Enter side of square.");
        int n = mysc.nextInt();
        pattern_square(n);

        mysc.close();
    }
}