package Maths_for_Data_Structures_and_Algorithms;

import java.util.ArrayList;

public class Factors_of_a_number {

    static void factorsM1(int n){ // time complexity is O(n)
        for (int i = 1; i <=n ; i++) {
            if (n%i ==0){
                System.out.print(i + " ");
            }
        }
    }

    // time complexity is O(sqrt(n))
    static void factorsM2(int n ){
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if(n%i==0) {
                if (n/i==i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " " + n/i + " ");

                }
            }
        }
    }

    // both time and space will be O(sqrt(n))
    static void factorsM3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    // Factor is repeated (perfect square)
                    System.out.print(i + " ");
                } else {
                    // Add both factors
                    System.out.print(i + " ");
                    list.add(n / i);
                }
            }
        }
        // Print factors stored in reverse order
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }


    public static void main(String[] args) {
        System.out.println("Use 1st method:- ");
        factorsM1(40);

        System.out.println();
        System.out.println("Use 2nd method:- ");
        factorsM2(40);
        System.out.println();

        System.out.println("Use 3rd method:- ");
        factorsM3(40);





    }
}
