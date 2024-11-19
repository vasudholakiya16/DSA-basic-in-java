package BinarySearch.BinarySearchQuestion;

/*
Detailed Algorithm

Step 1: Define Boundaries
    We start with two pointers: start and end.
    start is initialized to 0, pointing to the first element of the array.
    end is initialized to arr.length - 1, pointing to the last element of the array.

Step 2: Binary Search Loop
    Calculate the middle index mid using the formula:

    mid = start + (end - start) / 2;
    This prevents integer overflow compared to using mid = (start + end) / 2.

    Inside the while loop, we check the following conditions:

    If the target is smaller than the element at the middle (arr[mid]):

    This means we need to search the left half of the array. Hence, set end = mid - 1 to narrow the search range.
    If the target is larger than the element at the middle (arr[mid]):

    This means we need to search the right half of the array. Hence, set start = mid + 1.
    If the target is equal to the element at the middle (arr[mid]):

    We found an exact match, so return mid directly. This is the exact index of the target.

Step 3: Return the Floor
    If the while loop ends without finding an exact match (i.e., the target is not present in the array), the end pointer will point to the largest element that is smaller than or equal to the target. This is the floor of the target.
    Return end as the result, which gives the index of the floor.
 */

public class FloorNumberOfTheGivenNumber {

    // Function to find the floor of a number
    // return the index: greatest <= target
    static int FloorNumber(int[] arr, int target) {


        int start = 0; // Left boundary
        int end = arr.length - 1; // Right boundary

        // Binary search loop
        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate mid index

            if (arr[mid] == target) {
                return mid; // Exact match, return index
            } else if (arr[mid] < target) {
                start = mid + 1; // Search the right half
            } else {
                end = mid - 1; // Search the left half
            }
        }
        // If no exact match, return the floor
        return end; // The floor of the target will be at index `end`
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18}; // Sorted array
        int target = 15; // Target number for which we need to find the floor

        // Find the floor index of the target
        int floorIndex = FloorNumber(arr, target);

        // If the floor exists (i.e., it is a valid index)
        if (floorIndex >= 0 && floorIndex < arr.length) {
            System.out.println("The floor of the number is: " + arr[floorIndex] + " at index " + floorIndex);
        } else {
            System.out.println("There is no floor for the target number.");
        }
    }
}
