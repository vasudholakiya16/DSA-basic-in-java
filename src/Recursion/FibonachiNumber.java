package Recursion;


public class FibonachiNumber {

    // Function to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static void printFibonacciSequence(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");  // Print each Fibonacci number
        }
        System.out.println();  // Newline after printing the sequence
    }

    public static void main(String[] args) {
        // Print the 8th Fibonacci number
        System.out.println(fibonacci(8));  // Output will be the 8th Fibonacci number (21)


        System.out.print("The the number of fibo is : ");
        printFibonacciSequence( 8);  // Prints the sequence from 0 to the 8th Fibonacci number
    }
}


//