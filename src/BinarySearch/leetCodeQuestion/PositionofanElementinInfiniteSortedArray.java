package BinarySearch.leetCodeQuestion;


// Amazon interview question

public class PositionofanElementinInfiniteSortedArray {

    static int binarySearch(int[] arr, int target,int start,int end){

        while (start<=end){
            int mid = start + (end-start);

            if (target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start= mid+1;
            }
            else {
                return mid;
            }
        }
        return  -1;
    }

    static int InfiniteArray(int[]arr,int target){
        // find the range

        // start of the boxSize of 2

        int start = 0;
        int end= 1;
// condition to the target to lie in the range is (target should be les-then end)
        while (target>arr[end]){
            int newStart = end +1;
            // double the box value
            // end = previous End(old End) + sizeofBox * 2
//            end = end + (end - start +1) * 2, (arr.length - 1);
            end = Math.min(end + (end - start + 1) * 2, arr.length - 1);
            start = newStart;

        }
return binarySearch(arr,target,start,end);
    }

    public static void main(String[] args) {

        int[] arr = {
                3,5,7,9,10,90,100,130,140,160,170
        };
       int  target = 130;
        System.out.println("Position of an Element in Infinite SortedArray is index Number is :- "+ InfiniteArray(arr,target));



    }
}
