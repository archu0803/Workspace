package arrayprob;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateElement {
    public static void main(String a[]){
        int[] arr={1,2,3,4,5,4};
        if(!findDuplicateElement(arr)){
         System.out.println(" No Duplicate ");
        }
    }

    private static boolean findDuplicateElement(int[] arr) {

        Map<Integer, Integer> duplicate = new HashMap<>();

        for(Integer i: arr){
            if(duplicate.containsKey(arr[i])) {
                duplicate.put(arr[i], duplicate.get(arr[i]) + 1);
            }else{
                duplicate.put(arr[i], 1);
            }
        }

        for( Integer findDuplicate: duplicate.keySet()) {
            if (duplicate.get(findDuplicate) == 2) {
                System.out.println("Duplicate :" + duplicate.get(findDuplicate));
                return true;
            }
        }
        return false;
    }
}
