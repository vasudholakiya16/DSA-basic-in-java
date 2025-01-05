package AssignmentQuestionSol.Function;

import java.util.Scanner;
// Define a method to find out if a number is prime or not.
public class Prime_number {
    public static void primeNumber(int num) {
        if (num <= 1) {
            System.out.println(num + " is not a Prime Number");
            return;
        }
        if (num == 2) {
            System.out.println(num + " is a Prime Number");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a Prime Number");
                return;
            }
        }
        System.out.println(num + " is a Prime Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        primeNumber(num);
    }
}
