package AssignmentQuestionSol.BasicQuestion_inJava;

import java.util.Scanner;

public class TakeStringAsIputAndPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String");
        String input = sc.nextLine();
        System.out.println("Your enter String is :- " + input);
    }
}
