package BinarySearch;

import java.util.Arrays;

public class Basic_Info_binarySearch {

    // return the index if not exits return -1
    static  int binarySearch(int [] arr,int target){
        int start = 0;
        int end = arr.length -1;
        while (start<=end){
            // find the middle element
          //  int mid = (start+end)/2;// might be possible that (start+end) exceed the range of Integer in jav that reason we not use
            int mid = start + (end-start)/2;
            /*
            s+ (e-s)/2
            (2s + e-s)/2
            s+e/2 // same as  int mid = (start+end)/2; line
             */

            if (target < arr[mid]){
                /*
                go to left side and in case of binary search
                our start value is same but out last value is
                mid-1
                 */
                end = mid -1;

            } else if (target > arr[mid]) {

                /*
                go to Right side and in case of binary search
                our start element is mid-element + 1 and our end element is
                same 
                 */
                start = mid +1 ;
            }else {
                /*
                our target element is our mid element
                 */
                return mid;
            }

        }
return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,47,89,99,105,147};
        int  target = 99;
        System.out.println(Arrays.toString(arr));
      int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
}
