package BinarySearch.BinarySearchQuestion;

/*
Steps to solve the problem using Binary Search:
1. Initialize pointers:

start = 0 (beginning of the array)
end = arr.length - 1 (end of the array)


2. Binary Search Loop:

While start <= end, repeat the following steps:
Calculate the middle index mid = start + (end - start) / 2 to avoid potential overflow.
Compare the value at arr[mid] with the target number.

3. Check conditions:

If arr[mid] == target: Return mid, because the target is exactly equal to the element at the middle index, and this is its own ceiling.
If arr[mid] > target: The target could still be smaller than the element at mid, so move the end pointer to mid - 1. This narrows the search to the left half of the array.
If arr[mid] < target: The target is larger than the element at mid, so move the start pointer to mid + 1. This narrows the search to the right half of the array.
4. End of the loop:

If the loop ends, the start pointer will point to the smallest element greater than or equal to the target (or the position where this element should be inserted).
Return the index start, which represents the ceiling of the target in the array.

5. Check if the ceiling exists:

If the index start is less than the length of the array, return arr[start] as the ceiling of the target number.
Otherwise, the target has no ceiling, and print a message indicating that.

 */

public class CeilingOffTheNumber {


    // return the index of the smallest no>= target
    static int ceiling(int[] arr, int target) {

        // but what if the target is greater than the greatest number in the array

        if(target> arr[arr.length-1]){
            return -1;
        }
        int start = 0;                    // Initialize the start pointer
        int end = arr.length - 1;         // Initialize the end pointer

        while (start <= end) {            // Binary Search Loop
            int mid = start + (end - start) / 2; // Calculate mid index

            if (target < arr[mid]) {      // Target is smaller than mid element
                end = mid - 1;            // Search in the left half
            } else if (target > arr[mid]) {  // Target is larger than mid element
                start = mid + 1;          // Search in the right half
            } else {
                return mid;               // Target is equal to arr[mid], return mid
            }
        }
        // If no exact match, start will point to the index of the ceiling value
        return start;                      // Return the ceiling index
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18}; // Sorted array
        int target = 15;                     // Target number for which we need to find the ceiling

        // Find the ceiling index of the target
        int ceilingIndex = ceiling(arr, target);

        // Check if the ceiling exists within bounds of the array
        if (ceilingIndex < arr.length) {
            System.out.println("The ceiling of the number is: " + arr[ceilingIndex] + " at index " + ceilingIndex);
        } else {
            System.out.println("There is no ceiling for the target number.");
        }
    }
}

