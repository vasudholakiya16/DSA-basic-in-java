package Functions;

import java.util.Scanner;

public class function_in_java {


  static void sum(){
      Scanner SumInput = new Scanner(System.in);
      System.out.print("Enter the value of a :-");
     int  a = SumInput.nextInt();
      System.out.print("Enter the value of b :-");
     int  b = SumInput.nextInt();

      int c = a+b;

      System.out.println("The sum of num1" + a + " and num2"+b+" is :- " +c);

    }
    public static void main(String[] args) {
        // Q-1 Tack an input of two number and print the sum of this number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The first Number:- ");
        int num1 = input.nextInt();

        System.out.print("Enter The Second Number:- ");
        int num2 = input.nextInt();

        int c = num1 + num2;

        System.out.println("first" + num1 +" and the second number" + num2+" Sum of this two number is:- "+c);


    }
}
