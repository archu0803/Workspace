package datastructureproblem.sort;

public class SelectionSort {


    public static void main(String arr[] ){
     int A[] =new int[]{1,37,5,2,4};
     int min, temp;
     for(int i=0; i < A.length; i++){
         min =i;
         for(int j=i+1; j<A.length; j++){
             if(A[j]<A[min]){
                 min=j;
             }

         }
         temp =A[i];
         A[i] = A[min];
         A[min]=temp;
     }
        for(int i=0; i < A.length; i++) {
            System.out.println(" \n " + A[i]);
        }
    }
}
