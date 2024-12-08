package BitwiseOperatorsNumberSystemsMathsforDSA_part_one;

public class DivideByTwoWithoutOperators {

    // Method to check if a number is divisible by 2 using bitwise operations
    public static boolean isDivisibleByTwo(int num) {
        return (num & 1) == 0; // A number is divisible by 2 if the last bit is 0
    }

    // Method to divide a number by 2 without using % or / operators
    public static int divideByTwo(int num) {
        return num >> 1; // Right shift by 1 is equivalent to dividing by 2
    }

    public static void main(String[] args) {

        int input = 5 ; // Input number

        if (isDivisibleByTwo(input)) {
            int result = divideByTwo(input);
            System.out.println("The result of dividing " + input + " by 2 is: " + result);
        } else {
            int remainder = input & 1; // Remainder when divided by 2
            System.out.println("The input number " + input + " is not divisible by 2.");
            System.out.println("The remainder is: " + remainder);
        }
    }
}
