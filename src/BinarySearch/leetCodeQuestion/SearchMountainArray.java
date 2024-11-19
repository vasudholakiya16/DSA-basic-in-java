package BinarySearch.leetCodeQuestion;
/*
1095. Find in Mountain Array
(This problem is an interactive problem.)

You may recall that an array arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

You cannot access the mountain array directly. You may only access the array using a MountainArray interface:

MountainArray.get(k) returns the element of the array at index k (0-indexed).
MountainArray.length() returns the length of the array.
Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.


Example 1:

    Input: mountainArr = [1,2,3,4,5,3,1], target = 3
    Output: 2
    Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
Example 2:

    Input: mountainArr = [0,1,2,4,2,1], target = 3
    Output: -1
    Explanation: 3 does not exist in the array, so we return -1.
 */
public class SearchMountainArray {
    int search(int[]arr,int target){
        int peak =peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBSearch(arr,target,0,peak);
        if (firstTry!= -1 ){
            return firstTry;
        }
            // try to search in second half

        return orderAgnosticBSearch(arr,target,peak+1,arr.length-1);



    }
    public int peakIndexInMountainArray(int[] arr) {

        int  start = 0;
        int end = arr.length -1;
        while (start<end){
            int mid = start +(end-start);
            if (arr[mid]>arr[mid+1]){
                // you are in desiring part of the array
                // this maybe our answer, but look at left
                // this is why end != mid-1
                end = mid;
            }else {
                // you are acceding part of array
                start = mid +1; // because we know that mid+1 element > mid element
            }
        }
// in the end, start == end and pointing to the largest number because of the 2 checks above
// start and end are always trying to find max element in the above two check
// hence, when they are pointing to just one element,that is max once
        // because that is what we check says
        //more: elaboration:- at every point of time our start and end element
        // they possibly of  answer till that time
        // if we are saying that only one item is remaining hence bcz
        // above line that is the best possible answer
        return start; // or return end also both are equal
    }

    static int orderAgnosticBSearch(int[] arr, int target,int start ,int end ){
//        int start = 0;
//        int end = arr.length -1 ;
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
}
