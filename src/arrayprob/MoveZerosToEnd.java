package arrayprob;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String arr[]) {
        int[] a = {0, 5, 1, 8, 0, 3, 1};
        moveZerosToEnd(a);
        System.out.println("Sorted Linear Array : " + Arrays.toString(a));
    }

    private static void moveZerosToEndUsingQuicksortPivot(int[] a) {
        int j = 0; //using quick sort algorithm
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                swap(a, i, j);
                j++;
            }

        }
    }

    private static void moveZerosToEnd(int[] a) {
        int K = 0;
        for (int i :a) {
            if (i != 0) {
                a[K++]=i;
            }
        }
        for (int i = K; i < a.length; i++) {
            a[i]=0;
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
