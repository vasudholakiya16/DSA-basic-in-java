package Sorting.InsertionSortAlgorithm;

import java.util.Arrays;

public class basic_code_InsertionSortAlgorithm {

    static void insertionsort(int []arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            // we return i<=arr.length-2 also in place of i<arr.length-1
            for (int j = i+1; j >0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }
    static void swap(int[]arr,int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
    public static void main(String[] args) {
        int[] arr = {-3,222,0,78,-885};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
