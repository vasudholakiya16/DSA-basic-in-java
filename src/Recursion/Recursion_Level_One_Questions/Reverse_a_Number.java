package Recursion.Recursion_Level_One_Questions;

public class Reverse_a_Number {

    static int sum = 0;
    static void reverseM1(int n ){
        if (n==0){
            return;
        }
        int rem= n%10; // find the rem use this formula
        sum = sum *10 +rem; // calculate the sum
        reverseM1(n/10); // check the next num
    }

    static int reverseM2(int n ){
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
    public static void main(String[] args) {
        reverseM1(1234);
        System.out.println("Use Method-1 :- " + sum);
        System.out.println("Use Method-2 :- "+ reverseM2(1234));

    }

}
