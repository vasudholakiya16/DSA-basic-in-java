package Recursion.Recursion_Level_One_Questions;

public class Print_One_to_N_number {
    public static void main(String[] args) {

        System.out.println("Use M-1");
        num(+ 5);
        System.out.println();
        System.out.println("Use M-2");
        num2(5);
        System.out.println();
        System.out.println("Use M-3");
        num1andnum2(5);


    }
    public static void num(int n ){
        if (n==0){
            return;
        }

        System.out.print(n + " ");
        num(n-1);

    }

    public static void num2(int n ){
        if (n==0){
            return;
        }
        num2(n-1);
        System.out.print(n + " ");
    }

    public static void num1andnum2(int n ){
        if (n==0){
            return;
        }
        System.out.print(n + " ");
        num1andnum2(n-1);
        System.out.print(n + " ");
    }
}
