package LinearSearch;

public class basic_example_linearSearch {
    //Q-1 Search in the array return the index if item found otherwise item is not found
    static int linearSearch(int[] arr , int target){ // s-1 Create a function
        if (arr.length == 0) {
            return -1;
        }
        // run for loop
        for (int index = 0; index <arr.length ; index++) {
            // check the every element index if it is = target or not
            int element = arr[index];
            if (element== target){
                return index;
            }

        }
        // this line will execute if none of the return Statement above have executed hence the target not found
        return  -1;
    }


    //Q-2  Search in the target and  return the element  item found otherwise item is not found

    static  int linearSearch1(int[] arr1, int target1){
        if(arr1.length==0){
            return -1;
        }
        // return for loop
        for (int element : arr1) {
            // check the every element index if it is = target or not
            if (element == target1) {
                return element;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] nums = {1,6,7,-9,14,17,79,789};
        int  target  = -9;
        System.out.print("Print the Index of the element is :- ");
        int ans = linearSearch(nums,target);
        System.out.println(ans);

        int target1 = -9;
        System.out.print("Print the element is :- ");
        int ans1 = linearSearch1(nums,target1);
        System.out.println(ans1);


    }
}
