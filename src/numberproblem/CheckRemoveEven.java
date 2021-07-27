package numberproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckRemoveEven {



    public static void main(String[] ar) {
         int arr[]= {1,2,4,6,5};
        List<Integer> temp= new ArrayList<>();
        int index=0;
        for(int a: arr){
            if(a%2!=0){
                temp.add(a);
            }
        }
         Integer[] arr1 = temp.toArray(new Integer[temp.size()]);

        System.out.println(Arrays.toString(arr1) + " even numbers");

    }
}
