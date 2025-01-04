package AssignmentQuestionSol.Function;

import java.util.Scanner;
// Define a method that returns the product of two numbers entered by user.
public class Print_Product_of_two_number {

    public static void product(float a , float b){
        float c = a*b;
        System.out.print("Product of two number:- "+ c);
    }


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("First Number:- ");
        float a = sc.nextFloat();
        System.out.print("Second Number:- ");
        float b = sc.nextFloat();

        product(a,b);



    }
}
