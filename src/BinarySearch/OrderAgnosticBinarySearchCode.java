package BinarySearch;

import java.util.Arrays;

public class OrderAgnosticBinarySearchCode {

    static int orderAgnosticBSearch(int[] arr, int target ){
        int start = 0;
        int end = arr.length -1 ;
        // find weather the array is sorted in ascending or descending
        boolean isAscending = arr[start]< arr[end]; // M-2 define ascending or not
         /* M-1 to define ascending or not
         if (arr[start]<arr[end]){
            isAscending = true;
        }else {
            isAscending = false;
        }
          */

        while (start<=end){
            // find the middle element
            //  int mid = (start+end)/2;// might be possible that (start+end) exceed the range of Integer in jav that reason we not use
            int mid = start + (end-start)/2;

            if (arr[mid] == target){
                return mid;
            }
            /*
            s+ (e-s)/2
            (2s + e-s)/2
            s+e/2 // same as  int mid = (start+end)/2; line
             */

            if (isAscending){

                if (target < arr[mid]){
                /*
                go to left side and in case of binary search
                our start value is same but out last value is
                mid-1
                 */
                    end = mid -1;

                } else  {

                /*
                go to Right side and in case of binary search
                our start element is mid-element + 1 and our end element is
                same
                 */
                    start = mid +1 ;
                }

            }else {
                if (target > arr[mid]){
                /*
                go to left side and in case of binary search
                our start value is same but out last value is
                mid-1
                 */
                    end = mid -1;

                } else  {

                /*
                go to Right side and in case of binary search
                our start element is mid-element + 1 and our end element is
                same
                 */
                    start = mid +1 ;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,47,89,99,105,147};
        int  target = 99;
        System.out.println(Arrays.toString(arr));

        int ans = orderAgnosticBSearch(arr,target);
        System.out.println(ans);

    }
}
