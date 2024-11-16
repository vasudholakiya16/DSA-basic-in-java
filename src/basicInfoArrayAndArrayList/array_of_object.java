package basicInfoArrayAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class array_of_object {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[5];
        for (int i = 0; i < str.length ; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        // modify the string array

        str [1]= "Vasu";
        System.out.println("Modify array ");
        System.out.println(Arrays.toString(str));



    }
}
