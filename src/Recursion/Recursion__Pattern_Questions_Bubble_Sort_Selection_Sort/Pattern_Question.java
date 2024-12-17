package Recursion.Recursion__Pattern_Questions_Bubble_Sort_Selection_Sort;

public class Pattern_Question {
    static  void tringle(int r , int c){
        /*
        Q-1
         ****
         ***
         **
         *

         */
        if (r==0){
            return;
        }
        if (c<r){
            System.out.print("*");
            tringle(r , c+1);
        }else {
            System.out.println();
            tringle(r-1,0);
        }

    }

    static void tringle1(int r,int c){

        /*
        Q-2
         *
         **
         ***
         ****
         */
        if (r==0){
            return;
        }
        if (r>c){
            tringle1(r,c+1);
            System.out.print("*");
        }else {
            tringle1(r-1,0);
            System.out.println();
        }

    }
    public static void main(String[] args) {
        tringle(4,0);
        tringle1(4,0);

    }
}
