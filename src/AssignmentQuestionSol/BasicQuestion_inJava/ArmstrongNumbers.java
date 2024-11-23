package AssignmentQuestionSol.BasicQuestion_inJava;

import java.util.Scanner;

public class ArmstrongNumbers {
    // Method to check if a number is an Armstrong number
    public boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;

        // Find the number of digits
        int numDigits = (int) Math.log10(num) + 1;

        // Calculate sum of digits raised to the power of the number of digits
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == originalNum;
    }

    public static void main(String[] args) {
        // Create an instance of the Solution class
        ArmstrongNumbers solution = new ArmstrongNumbers();

        // Create a scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Take input for the two numbers
        System.out.print("Enter the first number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int end = scanner.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        // Loop through the range and check for Armstrong numbers
        for (int i = start; i <= end; i++) {
            if (solution.isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
    }

