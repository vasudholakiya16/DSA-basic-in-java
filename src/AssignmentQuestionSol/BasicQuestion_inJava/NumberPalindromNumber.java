package AssignmentQuestionSol.BasicQuestion_inJava;
// leetCode Question
public class NumberPalindromNumber {
    public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int originalNum = x;
        int reversedNum = 0;

        // Reverse the number
        while (x > 0) {
            int digit = x % 10;         // Get the last digit
            reversedNum = reversedNum * 10 + digit;  // Build the reversed number
            x = x / 10;                 // Remove the last digit
        }

        // Check if the original number and the reversed number are the same
        return originalNum == reversedNum;
    }
    public static void main(String[] args) {

    }
}
