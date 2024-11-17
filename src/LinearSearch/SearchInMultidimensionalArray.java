package LinearSearch;

import java.util.Arrays;

public class SearchInMultidimensionalArray {


    public static int[] MultidimensionalArraySearch(int[][] arr, int target) {
        // Loop through each row
        for (int row = 0; row < arr.length; row++) {
            // Loop through each column of the current row
            for (int col = 0; col < arr[row].length; col++) {
                // Check if target is found
                if (arr[row][col] == target) {
                    return new int[]{row, col};  // Return the row and column index as an array
                }
            }
        }
        // Return [-1, -1] if target is not found
        return new int[]{-1, -1};
    }
    // find out the max value

    static int max (int[][] arr1 ){
//        int max = arr1[0][0]; Or
        int max = Integer.MIN_VALUE;

        for (int row = 0; row <arr1.length ; row++) {
            for (int col = 0; col <arr1[row].length ; col++) {
                if (arr1[row][col] > max){
                    max = arr1[row][col];
                }
            }
        }
return max;
    }

    // find out the min value
    static int min (int[][] arr1 ){
//        int max = arr1[0][0]; Or
        int min = Integer.MAX_VALUE;

        for (int row = 0; row <arr1.length ; row++) {
            for (int col = 0; col <arr1[row].length ; col++) {
                if (arr1[row][col] < min){
                    min = arr1[row][col];
                }
            }
        }
        return min;
    }
    // find min and max value to give a range

    public static int[] FindMaxAndMinValue(int[][] arr , int start , int end){
        // code for invalid range
        if (arr==null || start<0 || end>= arr.length ||start>end){
            throw new IllegalArgumentException("Invalid range");
        }
        // Initialize min and max to the extreme possible values
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Traverse through the 2D array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                // Update min and max as needed
                if (arr[row][col] < min) {
                    min = arr[row][col];
                }
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }

        // code for valid range

// Return the min and max values as an array
        return new int[]{min, max};
    }



    public static void main(String[] args) {
        // Example 2D array
        int[][] arr = {
                {24, 2, 3},
                {18, 12, 3, 9},
                {14, 7,34,-9}
        };

        int target = 3;  // Change this to test different values

        // Print the array
        System.out.println(Arrays.deepToString(arr));

        // Call the search method and print the result
        System.out.println(Arrays.toString(MultidimensionalArraySearch(arr, target)));

        System.out.println( "Max value is:- "+max(arr));
        System.out.println("Min value is:- "+ min(arr));

        System.out.println("Find out the Max and Min number in a given range " + Arrays.toString(FindMaxAndMinValue(arr, 0, 2)));


    }
}
