package BinarySearch.leetCodeQuestion;

public class RotationCount {

    static int  countRotationCountInArray(int[]arr){
        int pivot = findPivotWithoutDuplicatesArray(arr);
//        if (pivot== -1){
//            // array is not rotated
//            return 0;
//        }
        return pivot+1;
    };
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

    public static void main(String[] args) {

        int [] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotationCountInArray(arr));

    }
}
