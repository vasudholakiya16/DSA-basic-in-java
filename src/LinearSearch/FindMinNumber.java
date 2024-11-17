package LinearSearch;

import java.util.Arrays;

public class FindMinNumber {


// assume arr.length!=0
    // return min value in the array
    static int findMinNumber(int [] arr){
    int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
    // return max array
    static int findMaxNumber(int[] arr1) {
        // Edge case: If the array is empty, return some default value (e.g., Integer.MIN_VALUE)
        if (arr1.length == 0) {
            return Integer.MIN_VALUE; // You can handle this case depending on the requirements
        }

        int ans = arr1[0]; // Initialize the max value to the first element
        for (int i = 1; i < arr1.length; i++) { // Start from the second element
            if (arr1[i] > ans) {
                ans = arr1[i]; // Update if a larger element is found
            }
        }
        return ans;
    }

    // Function to find the max and min numbers within a given range
    public static int[] findMaxMinInRange(int[] arr, int start, int end) {
        // Check for valid range
        if (arr == null || start < 0 || end >= arr.length || start > end) {
            throw new IllegalArgumentException("Invalid range");
        }

        // Initialize max and min to the first element in the range
        int max = arr[start];
        int min = arr[start];

        // Iterate through the array within the specified range
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Update max if a larger value is found
            }
            if (arr[i] < min) {
                min = arr[i];  // Update min if a smaller value is found
            }
        }

        return new int[] {max, min};  // Return the max and min values in an array
    }


    public static void main(String[] args) {
        int[] arr = {17,9,8,97,55,14,178};
        System.out.println("Our min member of array is : "+ findMinNumber(arr));
        System.out.println("Our Max member of array is : "+ findMaxNumber(arr));
        System.out.println("Find out the Max and Min number in a given range "+  Arrays.toString(findMaxMinInRange(arr, 0, 3)));


    }


}
