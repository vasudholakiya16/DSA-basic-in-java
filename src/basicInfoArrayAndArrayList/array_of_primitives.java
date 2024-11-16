package basicInfoArrayAndArrayList;

import java.util.Scanner;

public class array_of_primitives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array of primitives
        int [] arr = new int[5];
        arr[0] = 4;
        arr[1] = 5;
        arr[2] = 6;
        arr[3] = 7;
        arr[4]=8;
        System.out.println(arr[3]);

        // Input use in for loop

        for (int i=0;i< arr.length; i++){
            System.out.print("Enter The value of array is ");
            arr[i] = sc.nextInt();
        }
        for (int j : arr) { // hear j is represent element of the array
            System.out.print("Enter The value of array is ");
            System.out.print(j + " ");
        }

        // System.out.println(arr[5]); // index out of bound

        // Array of object



    }
}
