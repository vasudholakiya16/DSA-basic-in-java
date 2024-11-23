package AssignmentQuestionSol.Conditionalsloops;

import java.util.Scanner;

public class DigitProductSumDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Integer value:- ");
        int num = sc.nextInt();

        int sum = 0 ;
        int porduct =1;
        int temp = num;

        while (temp!= 0){
            int newnum= temp%10;// get the last digit
            sum+=newnum; // sum
            porduct*=newnum; // mul
            temp/=10;// remove last digit
        }
        int diff= porduct-sum;
        System.out.println("Differenc b/w product and sum is :-  "+ diff);
    }

}
