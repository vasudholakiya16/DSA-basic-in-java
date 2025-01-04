package AssignmentQuestionSol.Function;

import java.util.Scanner;
// Write a program to print the sum of two numbers entered by user by defining your own method.
public class Print_the_sum_two_numbers {
    public static void sum(int a ,int b){
        int c = a+b;
        System.out.println("Sum of two number is:- "+c);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your First Number:- ");
        int a = sc.nextInt();
        System.out.print("Enter Your Second Number:- ");
        int b= sc.nextInt();

        sum(a,b);



    }
}
