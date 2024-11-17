package LinearSearch;

public class SearchInRange {

    // use simple for loop and find out the index of the element
    static int searchInRange(int [] arr, int target, int start, int end){
        if (arr.length==0){
            return -1;
        }
        for (int index = start; index <=end ; index++) {
            int element = arr[index];
            if (arr[index]== target){
                return index;
            }
            
        }
        return -1;
    }


    // use In-hence for loop and print the element

    static int searchInRange1(int[] arr1,int target1, int start, int end ){
        if(arr1.length==0){
            return -1;
        }
        // use for each loop
        for (int element :arr1) {
            if (element == target1) {
                return element;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {18,12,-5,17,-6};
        int target = -5;

        System.out.println("Find out the range of the given search at index is:-  " + searchInRange(arr,target,2,4) );

        System.out.println("Find the element we search is :- "+ searchInRange1(arr,target,2,4));
        System.out.println("Our target element is "+searchInRange1(arr,target,2,4) + " at Index is :"+ searchInRange(arr,target,2,4));
    }
}
