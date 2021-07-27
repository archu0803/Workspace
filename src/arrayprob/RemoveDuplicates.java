package arrayprob;



import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
    public static void main(String arr[]) {
        int[] a = {0, 5, 1, 8, 0,1,1, 3, 1};
        removeDuplicate(a);

    }

    private static void removeDuplicate(int[] a) {
        Set<Integer>  noDup= new TreeSet<>();
        for(int data : a){
            noDup.add(data);
        }


        Integer[] arr1 = noDup.toArray(new Integer[noDup.size()]);
        System.out.println(Arrays.toString(arr1) + " Remove Duplicates");
    }
}
