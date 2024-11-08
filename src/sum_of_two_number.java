import java.util.Scanner;

public class sum_of_two_number {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 15;
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);


        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        int total = firstNumber + secondNumber;
        System.out.println("Sum of " + firstNumber + " and " + secondNumber + " is: " + total);
    }
}
