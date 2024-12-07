package Recursion;

public class fibonachiNumber_largeamountt_of_number {
    static int fiboFormula(int n ){
        // just for demo, use long instead
//        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));

        return (int) (Math.pow(((1+Math.sqrt(5))/2),n) /Math.sqrt(5));
        /*
        -Math.pow(((1-Math.sqrt(5))/2),n) remove this because it is less dominate terms
         */

    }
    static int fibo(int n) {
        // base condition
        if (n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            System.out.print(fiboFormula(i) + " ");
        }
    }
}
