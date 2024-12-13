package Recursion.Recursion_Level_One_Questions;

public class Sum_Of_Digits {

    static int sumOfDigits(int n ){
        if (n==0){
            return 0;
        }
        return (n%10) + sumOfDigits(n/10);
    }
    public static void main(String[] args) {
        int ans = sumOfDigits(1236);
        System.out.println("The sum is :- " + ans);
    }
}
