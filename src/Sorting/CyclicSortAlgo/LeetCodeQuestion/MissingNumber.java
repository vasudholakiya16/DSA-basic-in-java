package Sorting.CyclicSortAlgo.LeetCodeQuestion;

import java.util.Arrays;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int i =0;
        while (i<nums.length){
            int correct= nums[i];
            if (nums[i]<nums.length && nums[i]!=nums[correct] ){
                swap(nums,i,correct);
            }else {
                i++;
            }
        }
// case-1: search for first missing numbers

        for (int index = 0; index <nums.length ; index++) {
            if (nums[index]!=index){
                return index;
            }
        }
// case -2
return nums.length;
    }

    static void swap(int []nums,int first,int second){
        int temp = nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }

    public static void main(String[] args) {
        // Test case
        int[] nums = {3, 0, 1}; // Example array with missing number 2
        System.out.println("The missing number is: " + missingNumber(nums));

        // Another test case
        int[] nums2 = {0, 1}; // Example array with missing number 2
        System.out.println("The missing number is: " + missingNumber(nums2));

        // Edge case: only one element, missing number is 1
        int[] nums3 = {0};
        System.out.println("The missing number is: " + missingNumber(nums3));

        // Edge case: empty array, missing number is 0
        int[] nums4 = {};
        System.out.println("The missing number is: " + missingNumber(nums4));

    }
}
