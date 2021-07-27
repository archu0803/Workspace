package arrayprob;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllSubZeroSum {

    public static void main(String ar[]) {
        int[] array = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        checkzerSubarraylist(array);
    }

    private static void checkzerSubarraylist(int[] arr) {
        Map<Integer, List<Integer>> check= new HashMap<>();
        int sum=0;
        insert(check,0,-1);// multimap, sum, index
        for(int i=0; i <arr.length; i++){
            sum+=arr[i];

            if(check.containsKey(sum)){
                for(Integer val: check.get(sum) ){
                    System.out.println("Subarray list"+(val+1)+" .."+i);
                }
            }
            insert(check, sum, i);
        }

    }

    private static void insert(Map<Integer, List<Integer>> check, int key, int value) {
        check.putIfAbsent(key, new ArrayList<>());
        check.get(key).add(value);

    }

}
