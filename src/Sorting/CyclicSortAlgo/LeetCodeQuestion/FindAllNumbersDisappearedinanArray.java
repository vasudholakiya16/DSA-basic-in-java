package Sorting.CyclicSortAlgo.LeetCodeQuestion;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {

   static public List<Integer> findDisappearedNumbers(int[] nums) {
       int i=0;
       while (i< nums.length){
           int correct = nums[i]-1;
           if (nums[i]!=nums[correct]){
               swap(nums,i,correct);
           }else {
               i++;
           }
       }
// just find the missing number
       List<Integer> ans = new ArrayList<Integer>();
       for (int index = 0; index <nums.length ; index++) {
           // check our index is contained a correct index or not (index!=index+1)
           if (nums[index]!=index+1){
               ans.add(index +1);
           }
       }
       return ans;
    }

    public static void swap(int[] arr, int first, int second){
       int temp= arr[first];
       arr[first]=arr[second];
       arr[second]= temp;
    }

    public static void main(String[] args) {
       int []nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));

    }
}
