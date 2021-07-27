package arrayprob;

import java.util.Arrays;

public class InPlaceMergeTwoSort {
    public static void main(String a[]) {
        int[] A = {1, 4, 7, 2};
        int[] B = {3, 6, 5};

        findInplaceMergeTwoSort(A, B);
        System.out.println("A :" + Arrays.toString(A));
        System.out.println("B :" + Arrays.toString(B));
    }

    private static void findInplaceMergeTwoSort(int[] X, int[] Y) {
        int first;
        for (int i = 0; i < X.length; i++) {
            if(X[i]>Y[0]){
                int temp= X[i];
                X[i] = Y[0];
                Y[0] = temp;
            }
            first=Y[0];int k;
            for(k=1; k<Y.length&&Y[k]<first; k++){
                Y[k-1]=Y[k];

            }
            Y[k-1]=first;
        }


    }
}
