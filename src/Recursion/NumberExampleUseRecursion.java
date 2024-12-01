package Recursion;

public class NumberExampleUseRecursion {
    static void print(int n){
        if (n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);

    }

    public static void main(String[] args) {
        // write a function that takes the number and print it
        // print first 5 number : 1 2 3 4 5
        print(1);

    }
}
