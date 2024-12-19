package Recursion.Recursion_Subset_Subsequence_String_Questions.StrinQuestion.StringQuestion;
// without recursion
import java.util.Scanner;

public class SpaceCount {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize space counter
        int spaceCount = 0;

        // Loop through the string and count spaces
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Print the number of spaces
        System.out.println("Number of spaces: " + spaceCount);

        // Check if the space count is even or odd
        if (spaceCount % 2 == 0) {
            System.out.println("The number of spaces is even.");
        } else {
            System.out.println("The number of spaces is odd.");
        }

        // Close the scanner object
        scanner.close();
    }
}

