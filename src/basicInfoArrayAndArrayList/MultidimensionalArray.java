package basicInfoArrayAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Syntax:-
        dataType[][] arrayRefVar; (or)
        dataType [][]arrayRefVar; (or)
        dataType arrayRefVar[][]; (or)
        dataType []arrayRefVar[];
        */
        int [][] arr = new int[3][]; // add number of column is mandatory not a column
int [][] arr1 = {
        {1 ,2 ,3}, // oth index
        {4 ,5 ,6}, // 1st index
        {7 ,8 ,9 } // 2nd index
};
        for (int i = 0; i <arr1
                .length ; i++) {
            System.out.println(Arrays.toString(arr1));

        }

        int [][] arr2 = new int[3][3];
        System.out.println(arr2.length);

        // input
        for (int rwo = 0; rwo <arr2.length ; rwo++) {
//            for each column and in every row

            for (int col = 0; col <arr2[rwo].length ; col++) {

                arr2[rwo][col] = sc.nextInt();
                
            }

        }

        // Output
        System.out.println("Method 1 to print a same array");
        for (int rwo = 0; rwo <arr2.length ; rwo++) {
//            for each column and in every row

            for (int col = 0; col <arr2[rwo].length ; col++) {

                System.out.print(arr2[rwo][col] + " ");

            }
            System.out.println();

        }
// method 2 to print the array
        System.out.println("Method 2 to print a same array use enhance for loop");
        for (int[] ints : arr2) { //  enhance for loop
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        // method 3 to print the array
        System.out.println("Method 3 to print a same array");

        for (int rwo = 0; rwo <arr2.length ; rwo++) {
            System.out.println(Arrays.toString(arr2[rwo]));

        }
        // method 4 to print the array
        System.out.println("Method 4 to print a same array use enhance for loop");

        for (int[] ints : arr2) { // enhance for loop
            System.out.println(Arrays.toString(ints));

        }



    }

}
