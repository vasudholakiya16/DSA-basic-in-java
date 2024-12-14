package Recursion.Recursion_Array_Questions;

import java.util.Arrays;

public class Find_Array_Sorted_or_Not {

    static boolean sorted(int[] arr, int index) {
        // Base condition
        if (index == arr.length - 1) {
            return true;
        }
        // Check if the current element is less than the next element
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 71, 89, 7}; // Example input array

        // Check if the array is sorted
        boolean isSorted = sorted(arr, 0);

        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
            // Sort the array and print the sorted version
            Arrays.sort(arr);
            System.out.println("Sorted array: " + Arrays.toString(arr));
        }
    }
}
