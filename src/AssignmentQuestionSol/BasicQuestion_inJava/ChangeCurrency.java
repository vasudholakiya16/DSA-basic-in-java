package AssignmentQuestionSol.BasicQuestion_inJava;

import java.util.Scanner;

public class ChangeCurrency {
    public static void main(String[] args) {
        double exchangeRate = 80.0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in Rupees: ");
        double rupees = sc.nextDouble();
        double usd = rupees / exchangeRate;
        System.out.println(rupees + " Rupees is equal to " + usd + " USD.");
    }
}
