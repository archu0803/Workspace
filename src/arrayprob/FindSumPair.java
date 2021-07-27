package arrayprob;

import java.util.HashMap;

public class FindSumPair {
    public static void main(String[] a) {
        int[] arr = {8, 7, 2, 5, 3, 1, 3, 4};
        int sum = 7;
        findPair(arr, sum);
    }

    private static void findPair(int[] arr, int sum) {
        HashMap<Integer, Integer> checkMap = new HashMap<>();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (checkMap.containsKey(sum - arr[i])) {
                System.out.printf("\n The Pair are (%d,%d) ", arr[checkMap.get(sum - arr[i])], arr[i]);
                found = true;
            }
            checkMap.put(arr[i], i);

        }
        if (!found) {
            System.out.println("The Pair not found");
        }

    }
}
