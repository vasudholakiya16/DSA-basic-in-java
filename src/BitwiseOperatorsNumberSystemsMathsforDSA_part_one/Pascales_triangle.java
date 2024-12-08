package BitwiseOperatorsNumberSystemsMathsforDSA_part_one;

public class Pascales_triangle {

    // Method to calculate the sum of the nth row of Pascal's Triangle
    public static int PascalesTringleSum(int n) {
        return 1 << (n - 1); // left shift
    }

    // Method to print Pascal's Triangle up to n rows
    public static void printPascalsTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int number = 1; // First element is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // Calculate next number in the row
            }
            System.out.println(); // Move to the next row
        }
    }

    public static void main(String[] args) {

        int n = 5; // Number of rows in Pascal's Triangle

        System.out.println("Sum of the " + n + "th row: " + PascalesTringleSum(n));

        System.out.println("Pascal's Triangle up to " + n + " rows:");
        printPascalsTriangle(n);
    }
}