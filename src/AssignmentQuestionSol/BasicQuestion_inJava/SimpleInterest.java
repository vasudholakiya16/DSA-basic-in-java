package AssignmentQuestionSol.BasicQuestion_inJava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Take input from the user for principal, time, and rate
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the time period (T) in years: ");
        double time = scanner.nextDouble();

        System.out.print("Enter the rate of interest (R) in percentage: ");
        double rate = scanner.nextDouble();

        // Calculate the Simple Interest
        double simpleInterest = (principal * time * rate) / 100;

        // Display the result
        System.out.println("The Simple Interest is: " + simpleInterest);

        // Close the scanner
        scanner.close();
    }
}
