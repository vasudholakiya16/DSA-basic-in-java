package AssignmentQuestionSol.BasicQuestion_inJava;

import java.util.Scanner;

public class StringIsPalindrome {
    // Helper method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Is a palindrome
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:- ");
        String value = sc.nextLine();

        // remove extra space

        String removeExtra = value.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(removeExtra)) {
            System.out.println(value + " is a palindrome.");
        } else {
            System.out.println(value + " is not a palindrome.");
        }
    }
}
