package Functions;

import java.sql.Array;
import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        // array
        int[] arr= {1,2,3,4};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums){
        nums[0]=10; // if you change the object via this reference variable, same object will be change
        nums[1]=20;
        nums[2]=30;

    }
}
