package Sorting.SelectionSort;

import java.util.Arrays;

public class Basic_info_selectionSort {

    static void selectionSort(int [] arr){
        for (int i = 0; i <arr.length ; i++) {
            // find the max item in remaining array and swap item with correct index
            int last = arr.length -i -1;
            int maxIndex= getMaxindex(arr,0,last);

            swap(arr,maxIndex,last);
            
        }


    }
    static int  getMaxindex(int[]arr,int start, int end ){
int max  = start;
        for (int i = start; i <=end ; i++) {
            if (arr[max]<arr[i]){
                max=i;
            }
        }
return max;
    }

    static void swap(int[]arr,int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
    public static void main(String[] args) {

        int[] arr = {-3,222,0,78,-885};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
