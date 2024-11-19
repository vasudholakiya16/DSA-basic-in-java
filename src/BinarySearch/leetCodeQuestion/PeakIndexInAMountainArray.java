package BinarySearch.leetCodeQuestion;
// 852. Peak Index in a Mountain Array  & 162. Find Peak Element

/*
You are given an integer mountain array arr of length n,
 where the values increase to a peak element and then decrease.
Return the index of the peak element.
Your task is to solve it in O(log(n)) time complexity.

Example 1:

    Input: arr = [0,1,0]
    Output: 1

Example 2:

    Input: arr = [0,2,1,0]
    Output: 1

Example 3:

    Input: arr = [0,10,5,2]
    Output: 1

 */
public class PeakIndexInAMountainArray {

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
}
