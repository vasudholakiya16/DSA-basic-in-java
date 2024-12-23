package Recursion.Recursion_Subset_Subsequence_String_Questions.StrinQuestion.SubsetQuestion.UseIteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsequencesofastringwithduplicateelements {

    static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr); // Sort to handle duplicates

        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>()); // Start with an empty list

        int start = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;

            // If the current element is the same as the previous, adjust the start index
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }

            end = outerList.size() - 1; // Update end to the current size of outerList
            int listSize = outerList.size(); // Store the size before iterating

            for (int j = start; j < listSize; j++) {
                // Create a new subset based on existing subset
                List<Integer> internal = new ArrayList<>(outerList.get(j));
                internal.add(arr[i]); // Add the current element to the subset
                outerList.add(internal);
            }
        }

        return outerList;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subsetDuplicate(arr);

        for (List<Integer> list : ans) {
            System.out.println(list);
        }


    }
}
