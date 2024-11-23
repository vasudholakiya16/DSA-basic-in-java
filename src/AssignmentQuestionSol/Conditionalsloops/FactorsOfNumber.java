package AssignmentQuestionSol.Conditionalsloops;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer value:- ");
        int c = sc.nextInt();

        for (int i = 1; i <=c ; i++) {
            if (c%i == 0){
                System.out.println(i + " ");
            }
            
        }
    }
}
