package arrayprob;

import java.util.Arrays;

public class DutchThreewayPartition {

    public static void main(String ar[]) {
        int[] threeValue = {0, 1, 2, 2, 1, 0, 1, 2, 2, 0, 1, 1, 0, 2};
        threeWayPartition(threeValue, threeValue.length - 1);
        System.out.println("Three way partition" + Arrays.toString(threeValue));
    }

    private static void threeWayPartition(int[] a, int end) {
        int start = 0, middle = 0, pivot = 1;

        while (middle <= end) {
            if (a[middle] < pivot) {
                swap(a, start, middle);
                ++start;
                ++middle;
            } else if (a[middle] > pivot) {
                swap(a, middle, end);
                --end;
            } else {
                ++middle;
            }
        }

    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }
}
