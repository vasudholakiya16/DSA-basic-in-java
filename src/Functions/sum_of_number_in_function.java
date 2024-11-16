package Functions;

import java.util.Scanner;

public class sum_of_number_in_function {

    // use function we calculate the sum of two numbers

    // use void
    static void sum(){
        Scanner SumInput = new Scanner(System.in);
        System.out.print("Enter the value of a :-");
        int  a = SumInput.nextInt();
        System.out.print("Enter the value of b :-");
        int  b = SumInput.nextInt();

        int c = a+b;

        System.out.println("The sum of num1" + a + " and num2"+b+" is :- " +c);

    }
// use int
    static int mul(){
        Scanner MulInput = new Scanner(System.in);
        System.out.print("Enter The value a:- ");
        int a = MulInput.nextInt();
        System.out.print("Enter The value b:- ");
        int b = MulInput.nextInt();

        return a*b;

    }

    // use String
    static String str(){
        String value = "Have a nice day";
        return value;

    }
    // pass the arguments
    static int sum7(int a ,int b){
       int   sum = a+b;
       return sum;
    }

    // print the string value
    static String MyMsg( String name) {
        String message = "Hii " + name;
        return  message;
    }

    public static void main(String[] args) {
        sum(); // use void
     int multi= mul(); // use int
        System.out.println(multi);
       String value  =str(); // use string
        System.out.println(value);

      int newSum =   sum7(7,5); // use to call parameters
        System.out.println(newSum);

        String personalMessage = MyMsg("Vasu Dholakiya"); // print the string value
        System.out.println(personalMessage);
    }


}
