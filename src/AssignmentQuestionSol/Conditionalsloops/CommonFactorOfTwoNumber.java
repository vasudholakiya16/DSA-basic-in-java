package AssignmentQuestionSol.Conditionalsloops;

import java.util.Scanner;

public class CommonFactorOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Find the smaller of the two numbers
        int common = Math.min(num1, num2);
        int count =0;

        // Loop to find and print common factors
        System.out.print("Common factors are: ");
        for (int i = 1; i <= common; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                count++;
            }
        }
        System.out.println("Number of common factors: " + count);
    }
}
