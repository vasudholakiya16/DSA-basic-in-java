package basicInfoArrayAndArrayList;

import java.util.Arrays;

public class passingTHeFunction { // array are mutable in java
    public static void main(String[] args) {
    int[] nums = {1,5,9,7};
        System.out.println(Arrays.toString(nums));

        change(nums);
        System.out.print("Updated array value is ");
        System.out.println(Arrays.toString(nums));
    }
    static void change (int[] arr){
        arr[0]= 98;
    }

}
