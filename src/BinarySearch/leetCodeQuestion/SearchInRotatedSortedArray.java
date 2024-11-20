package BinarySearch.leetCodeQuestion;

/*
33. Search in Rotated Sorted Array
There is an integer array nums sorted in ascending order ,
(with distinct values).
Prior to being passed to your function,
nums is possibly rotated at an unknown pivot,
 index k (1 <= k < nums.length) such that the resulting array is [nums[k],
  nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target,
 return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

    Input: nums = [4,5,6,7,0,1,2], target = 0
    Output: 4
Example 2:

    Input: nums = [4,5,6,7,0,1,2], target = 3
    Output: -1
Example 3:

    Input: nums = [1], target = 0
    Output: -1

 */

public class SearchInRotatedSortedArray {


// in our findPivot function is not work in duplicate array 
// array
    static  int findPivotWithoutDuplicatesArray(int[]arr){

        int  start = 0;
        int end = arr.length -1;
        while (start<=end){
            int mid = start +(end-start)/2;
            // 3 case overhear

            // Case 1: mid is greater than the next element, pivot found at mid


            if (mid < end && arr[mid] > arr[mid + 1]) {
                 /*
//            once we write mid+1 this (is not exceeding or of the range)
//            in mains (let consider our mid is lest element of the array,
//            and (*** we check the mid+1 at that case our answer is index out of
//             bound*** ) to solve the problem we use imd<end value in case-1)
//             */
                return mid;
            }

            // Case 2: mid is less than the previous element, pivot found at mid - 1
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 3: If the left side is sorted, go to the unsorted part
            if (arr[mid] >= arr[start]) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }

        return -1; // No pivot found, array is not rotated
    }
    static  int findPivotWithDuplicatesArray(int[]arr){

        int  start = 0;
        int end = arr.length -1;
        while (start<=end){
            int mid = start +(end-start)/2;
            // 3 case overhear

            // Case 1: mid is greater than the next element, pivot found at mid


            if (mid < end && arr[mid] > arr[mid + 1]) {
                 /*
//            once we write mid+1 this (is not exceeding or of the range)
//            in mains (let consider our mid is lest element of the array,
//            and (*** we check the mid+1 at that case our answer is index out of
//             bound*** ) to solve the problem we use imd<end value in case-1)
//             */
                return mid;
            }

            // Case 2: mid is less than the previous element, pivot found at mid - 1
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 3: if element at middle,start,end are equal just skip the duplicates


            if (arr[mid]==arr[start] && arr[mid] == arr[end]){

                //  NOTE:-  what if this element at start and end ware pivot??

                // check our start element is pivot??
                if (arr[start]>arr[start+1]){
                    return start;
                }
                start ++;

                // check our end elemet is pivot??

                if (arr[end]< arr[end-1]){
                    return end-1;
                }

                end --;
            }
                // left side is sorted, so our pivot is should be a right
                else if (arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]> arr[end])) {
                    start = mid+1;
                }else {
                    end = mid -1;
                }

        }

        return -1; // No pivot found, array is not rotated
    }

    static int search(int[] nums, int target) {
        int pivot=findPivotWithoutDuplicatesArray(nums);

        // if you did not find a pivot, it mains the array is not rotated

        if (pivot == -1){
            // just do normal binary search, because our array is not rotated
return binarySearch(nums,target,0,nums.length-1);

        }
// if pivot is found ,you have found 2 asc sorted arrays they have divide have 3 cases
        //case - 1
        if (nums[pivot]== target){
            return pivot;
        }
//        case -2
        if (target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        //   case -3
        return binarySearch(nums,target, pivot+1, nums.length-1);

    }
    static  int binarySearch(int [] arr,int target, int start,int end){
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
        int [] arr ={4,5,6,7,0,1,2};
        System.out.println(findPivotWithoutDuplicatesArray(arr));
    }
}
