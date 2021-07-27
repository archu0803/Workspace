package arrayprob;

import java.util.HashMap;
import java.util.Map;

public class FindBinaryMaxLenSubArray {

    public static void main(String arr[]) {
        int[] A = {0, 0, 1, 0, 1, 0, 0};
        findBinaryMaxLenSubArray(A);
    }

    private static void findBinaryMaxLenSubArray(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);//Sum, max index
        int sum = 0, len = 0;
        int end_index = -1;


        for (int i = 0; i < a.length; i++) {
            sum += (a[i] == 0) ? -1 : 1;
            if (map.containsKey(sum)) {//there exsists the key
                if(len<i-map.get(sum)) {
                    len = i - map.get(sum);
                    end_index = i;
                }
            } else {
                map.put(sum, i);
            }

        }
        System.out.println("Binary Sub Array Max:" + (end_index - len + 1) + "," + end_index);



    }
}
