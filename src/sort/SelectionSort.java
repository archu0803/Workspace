package sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String ar[]) {
        int[] selectionSort = {5,6,3,4,2,3,1};
        int[] sorted= selectionSorts(selectionSort);
        System.out.println("Sorted"+Arrays.toString(sorted));
    }

    private static int[] selectionSorts(int[] selectionSort) {
        for (int i=0;i<selectionSort.length;i++)
        {
            int min =selectionSort[i];
            int minIndex= i;
             for(int k=i+1; k<selectionSort.length-1; k++){
                 if(min <selectionSort[k]){
                     min = selectionSort[k];
                     minIndex=k;
                 }
             }
             int temp = selectionSort[i];
            selectionSort[i] =min;
            selectionSort[minIndex]=temp;
          //  System.out.println("Sorted min"+ selectionSort[i]+"minIndex"+selectionSort[minIndex]);
        }

        return selectionSort;
    }
}
