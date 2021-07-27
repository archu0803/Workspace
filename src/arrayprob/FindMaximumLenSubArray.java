package arrayprob;

import java.util.HashMap;
import java.util.Map;

public class FindMaximumLenSubArray {
    public static void main(String[] arr) {
        int[] A = {5, 6, -5, 5, 3, 5, 3, -2, 0};
        int sum = 8;
        findMaximumLengthSubArray(A, 8);
    }

    private static void findMaximumLengthSubArray(int[] a, int total) {
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int len = 0;//max length of the subarray
        int end_index = -1; //Store the ending index
        map.put(0, -1);
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            map.putIfAbsent(sum, i);

            if (map.containsKey(sum - total) && len < i - map.get(sum - total)) {
                len = i - map.get(sum - total);
                end_index = i;

            }
        }
        System.out.println("Found sum : [" + (end_index - len + 1) + "," + end_index + "]");

    }
}

