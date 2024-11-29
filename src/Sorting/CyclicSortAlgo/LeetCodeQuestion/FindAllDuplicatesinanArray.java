package Sorting.CyclicSortAlgo.LeetCodeQuestion;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray {


public static void swap(int[]nums,int first,int second){
    int temp = nums[first];
    nums[first]=nums[second];
    nums[second]=temp;

}
    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);  // Swap to correct position
            } else {
                i++;  // Move to the next index only when the element is in the correct position
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != (index + 1)) {
                ans.add(nums[index]);  // Add the duplicate value
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]nums = {3,1,3,4,2,2};
        System.out.println(findDuplicates(nums));

    }
}
