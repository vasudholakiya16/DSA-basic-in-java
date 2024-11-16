package Functions;

import java.util.Scanner;

public class Questions {
    // Check if a number is Armstrong
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }

        return sum == original;
    }

    // Check if a number is Prime
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Print all the 3-digit Armstrong numbers
        System.out.print("Armstrong numbers between 100 and 999: ");
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

        // You can uncomment below to test the Prime function
        // int n = in.nextInt();
        // boolean ans = isPrime(n);
        // System.out.println(ans);

        in.close();  // Close the scanner to avoid memory leak
    }
}
