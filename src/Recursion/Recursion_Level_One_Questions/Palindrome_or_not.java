package Recursion.Recursion_Level_One_Questions;

public class Palindrome_or_not {
    static int reverse(int n ){
        /*
         sometimes you might need some additional variables in the argument
         at that case mack another function
         */
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }

    public static int helper(int n ,int digits){
        if (n%10== n){ // our number is One-digit Number so return that number
            return n;
        }
        int rem= n%10;
        return rem * (int) (Math.pow(10,digits-1)) + helper(n/10, digits-1);
    }
    static boolean palindrome(int n ){
        return  n== reverse(n);
    }
    public static void main(String[] args) {
        System.out.println(palindrome(1413));

    }
}
