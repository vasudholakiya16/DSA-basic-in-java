package AssignmentQuestionSol.Function;

import java.util.Scanner;
// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

public class A_person_can_votes {


    public static void votes(int age){
        if (age>=18){
            System.out.println("You are eligible for vote.");
        }else {
            System.out.println("You are not eligible for vote.");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age:- ");
        int age= sc.nextInt();
        votes(age);

    }
}
