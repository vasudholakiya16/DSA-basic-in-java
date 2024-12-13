package Recursion.Recursion_Level_One_Questions;

public class Sum_Of_N_Number {
    public static int sum(int n ){
        if (n<=1){
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        int ans = sum(2);
        System.out.println("Sum is :- " + ans);
    }
}
