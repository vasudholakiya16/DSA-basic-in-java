package BinarySearch.leetCodeQuestion;

/*  ****************** Fb interview Question **********************
Given an array of integers nums sorted in non-decreasing order,
find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:

    Input: nums = [5,7,7,8,8,10], target = 8
    Output: [3,4]
    Example 2:

    Input: nums = [5,7,7,8,8,10], target = 6
    Output: [-1,-1]
    Example 3:

    Input: nums = [], target = 0
    Output: [-1,-1]
 */

public class FindFirstandLastPositionofElementinSortedArray {

    public int[] searchRange(int[] nums, int target) {
// check out answer is not found
        int [] ans = {1, -1};

        // check for first occurrence if target first

//        m-1
//        int start =search(nums,target,true);
//        int end = search(nums,target,false);

//        m-2
        ans[0]= search(nums,target,true); // log(n)
        if (ans[0]!= -1){
            ans[1]=search(nums,target,false);// log(n)
        }
        return ans;

    }


    // this function just returen the index value of what we are try to search of target
    int search (int []nums,int target, boolean findStartIndex){

        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while (start<=end){
            int mid = start + (end - start)/2;

            if (target > nums[mid]){
                end = mid -1;
            } else if (target<nums[mid]) {
                start = mid +1;
            }else {
                //potential answer is found
               ans = mid;
               if (findStartIndex){
                   end = mid -1 ;
               }else {
                   start = mid +1;
               }
            }
        }

return ans;

    }


}
