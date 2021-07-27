package arrayprob;

import java.util.Set;
import java.util.TreeSet;

public class FindZeroSumSubArray {


  //  private static int subArrayLength=0;

    public static boolean checkZeroSubArray(int[] arr) {

        Set<Integer> set = new TreeSet<>();
        set.add(0);
        int sum = 0;
        for (int i : arr) {
            sum += i;
        //    subArrayLength++;
            if (set.contains(sum)) {

                return true;
            }
            set.add(sum);

        }
        return false;
    }

    public static void main(String str[]) {
        int[] arr = {1, 4, -6, 3, -1, 4, 2, 7};
        StringBuilder builder = new StringBuilder(50);

        if (checkZeroSubArray(arr)) {
//            builder.append("[ ");
//            for(int i=0; i<subArrayLength; i++){
//                builder.append(arr[i]);
//                if(i!=subArrayLength-1){
//                    builder.append(", ");
//                }
//            }
//            builder.append("] ");

            System.out.println("zero Sum Sub array exist");
        } else
            System.out.println("Zero Sum Sub array doesnt exist");
        }
    }




