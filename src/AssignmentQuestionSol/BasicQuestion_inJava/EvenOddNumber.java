package AssignmentQuestionSol.BasicQuestion_inJava;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number: - ");
        int num = Integer.parseInt(sc.next());
        if (num %2 ==0){
            System.out.println("The number is even " + num);
        }else {
            System.out.println("The number is odd"+ num);
        }
    }
}
