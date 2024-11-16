package basicInfoArrayAndArrayList;

import java.util.Arrays;

public class maxItem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 36, 47, 98};
        System.out.println( "The max value is : " + max(arr));

        System.out.println(maxRange( arr,1,3)+ " Our max value" );
    }

    //    Imagin that arry is not empty
    static int max(int[] arr) {
        int max = arr[0];
        // int max = Integer.MIN_VALUE; // if array is empty that case only
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
}
    static int maxRange(int[] arr,int start ,int end) {
        int max = arr[start];
        // int max = Integer.MIN_VALUE; // if array is empty that case only
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

// Max Value in range


}
