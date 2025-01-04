package AssignmentQuestionSol.Function;

import java.util.Scanner;
// Define a method that returns the product of two numbers entered by user.
public class Calculate_Area_and_Circumference_of_Circle {

    public static  void areaAndCircumferenceOfCircle(float r){

        //formula to calculate area of circle
        double area = Math.PI * (r * r);
        System.out.printf("Area is: %.2f", area);

        //formula to calculate circumference of circle
        double circumference= Math.PI * 2*r;
        System.out.printf( "\nCircumference is: %.2f",circumference) ;

    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of radios:- ");
        float r =  sc.nextFloat();

        areaAndCircumferenceOfCircle(r);


    }
}
