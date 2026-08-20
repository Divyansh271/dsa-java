package sorting;
public class sorting {
    public static void sort_selection(int[] arr1) {
        int min, temp;
        for (int i = 0; i < arr1.length - 1; i++) {
            min = i;
            for (int j = i; j < arr1.length; j++) {
                if (arr1[j] < arr1[min]) {
                    min = j;
                }
            }
            temp = arr1[i];
            arr1[i] = arr1[min];
            arr1[min] = temp;
        }
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void sort_bubble(int[] arr1) {
        int temp;
        int didswap = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length - i - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                    didswap = 1;
                }
            }
            if (didswap == 0) {
                break;
            }
        }
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void sort_insertion(int[] arr1) {
        int temp;
        for (int i = 0; i < arr1.length - 1; i++) {
            int j = i + 1;
            while (arr1[j - 1] > arr1[j]) {
                temp = arr1[j];
                arr1[j] = arr1[j - 1];
                arr1[j - 1] = temp;
            }
        }
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void sort_merge(int[] arr1, int start, int end) {
        int mid = (end - start) / 2;
        sort_merge(arr1, start, mid);
        sort_merge(arr1, mid + 1, arr1.length - 1); 
    }

    public static void main(String[] args) {
        int[] arr1 = { 13, 46, 24, 52, 20, 9 };
        sort_selection(arr1);
        sort_bubble(arr1);
        sort_insertion(arr1);
    }
}
