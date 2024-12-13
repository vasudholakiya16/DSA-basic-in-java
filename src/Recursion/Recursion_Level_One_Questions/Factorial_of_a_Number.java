package Recursion.Recursion_Level_One_Questions;

public class Factorial_of_a_Number {
    static int fact(int n ){
        if (n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println("Factorial of a number is :- "+ ans);

    }
}
