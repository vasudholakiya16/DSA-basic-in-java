package Recursion.Recursion_Level_One_Questions;

public class Product_Of_Digits {
    public static int productOfNumber(int n ){
        if (n%10== n){
            return n;
        }
        return (n%10) * productOfNumber(n/10);
    }
    public static void main(String[] args) {

        int ans = productOfNumber(505);
        System.out.println("The Product of the Number:- " + ans);

    }
}
