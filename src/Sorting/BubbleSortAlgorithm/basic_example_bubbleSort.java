package Sorting.BubbleSortAlgorithm;

import java.util.Arrays;

public class basic_example_bubbleSort {
    static void bubbleSort(int[] arr) {
        boolean swap;
        // Run the steps n-1 times
        for (int i = 0; i < arr.length - 1; i++) {
            swap = false;
            // For each step, max item will come to the last respective index
            for (int j = 0; j < arr.length - i ; j++) {
                // Swap items if the current item is greater than the next one
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            // if you did not swap for a particular value of i, it mains the array is sorted hence stop the program

            if (!swap){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}



//