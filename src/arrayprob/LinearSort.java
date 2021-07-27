package arrayprob;

import java.util.Arrays;

public class LinearSort {
    public static void main(String arr[]){
        int[] a={0,0,1,1,0,1,1};
        linearSeperate(a);
    }

    private static void linearSeperate(int[] a) {
        int zeroCount=0;
        for(int zeros: a){
            if(zeros==0) {
                zeroCount++;
            }
        }
        int k=0;
        while(zeroCount-- !=0){
            a[k++]=0;
        }
        while(k<a.length){
            a[k++]=1;
        }


        System.out.println("Sorted Linear Array : "+Arrays.toString(a));

    }
}
