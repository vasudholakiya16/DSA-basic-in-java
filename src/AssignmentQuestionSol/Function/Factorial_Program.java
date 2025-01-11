package AssignmentQuestionSol.Function;

import java.util.Scanner;

public class Factorial_Program {


    public static void main(String[] args) {
        int i,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number:- ");
        int number = sc.nextInt();

        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);

    }
}
