package AssignmentQuestionSol.Function;

// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class print_max_min_input_three_number {

    static int max(int a,int b, int c){
        int maximum = a;

        if (b>maximum){
            maximum=b;
        }
        if (c>maximum){
            maximum=c;
        }
        return maximum;
    }
    static int min(int a, int b , int c ){
        int mini= a;
        if (b<mini){
            mini=b;
        }
        if (c<mini){
            mini=c;
        }
        return mini;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in) ;
        System.out.println("Add first Num:-");
        int a = in.nextInt() ;
        System.out.println("Add second Num:-");
        int b = in.nextInt() ;
        System.out.println("Add third Num:-");
        int c = in.nextInt() ;
        int maximum = max(a,b,c) ;
        int minimum = min(a,b,c) ;
        System.out.println("maximum = " +maximum) ;
        System.out.print("minimum = " +minimum) ;

    }
}
