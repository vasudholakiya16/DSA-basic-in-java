package Sorting.Quick_Sort_Using_Recursion;

import java.util.Arrays;

public class QuickSort {

    static void quickSort(int[] nums,int low ,int high ){
        if (low>=high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end-start)/2;
        int pivot= nums[mid];

        while (start<=end){

            // also a reason why if its already sorted it will not swap
            while (nums[start] < pivot ){
                start++;
            }
            while (nums[end]>pivot){
                end--;
            }
            if (start<=end){
                int temp= nums[start];
                nums[start]= nums[end];
                nums[end]= temp;
                start++;
                end--;
            }
        }
        // now my pivot at correct index after that sort two half
        // Recursion Call to sort them
        quickSort(nums,low,end);
        quickSort(nums,start,high);

    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
