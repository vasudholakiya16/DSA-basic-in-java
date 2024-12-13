package Recursion.Recursion_Level_One_Questions;

public class Passing_Number {

    static void fun(int n ){
        if (n ==0){
            return;
        }
        System.out.println(n);
//        fun(n--); // show me error

        fun(--n);


//        n-- V/S  --n both is n = n-1
       /*
         n-- at that condition we pass the value first and then subtract
         --n at that condition we subtract the value and then pass the value

        */
    }

    public static void main(String[] args) {
        fun(5);

    }
}
