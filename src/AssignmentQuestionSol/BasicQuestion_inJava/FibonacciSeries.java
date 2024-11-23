package AssignmentQuestionSol.BasicQuestion_inJava;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci numbers :- ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Fibonacci sequence up to " + n + " terms:");

        for (int i = 1; i <n; i++) {
            System.out.print(a + " ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
}
