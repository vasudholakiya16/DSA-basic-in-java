package Recursion.Recursion__Pattern_Questions_Bubble_Sort_Selection_Sort;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort( int []arr,int r,int c){
        if (r==0){
            return;
        }
        if (r>c){
            if (arr[c]> arr[c+1]){
                // swap
                int temp =arr[c];
                arr[c]= arr[c+1];
                arr[c+1]= temp;
            }
            bubbleSort(arr,r,c+1);
        }else {
            bubbleSort(arr,r-1,0);
        }

    }
    public static void main(String[] args) {
        int [] arr = {4,16,7,19,1};
        bubbleSort(arr, arr.length-1 , 0);
        System.out.println(Arrays.toString(arr));

    }
}
