package AssignmentQuestionSol.Conditionalsloops;

import java.util.Scanner;

public class PerimeterCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the menu
        System.out.println("Choose the shape to calculate the perimeter:");
        System.out.println("1. Perimeter of Circle");
        System.out.println("2. Perimeter of Equilateral Triangle");
        System.out.println("3. Perimeter of Parallelogram");
        System.out.println("4. Perimeter of Rectangle");
        System.out.println("5. Perimeter of Square");
        System.out.println("6. Perimeter of Rhombus");

        // Take user choice
        System.out.print("Enter the choice (1-6): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Perimeter of Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double perimeterCircle = 2 * Math.PI * radius;
                System.out.println("Perimeter of the circle: " + perimeterCircle);
                break;

            case 2:
                // Perimeter of Equilateral Triangle
                System.out.print("Enter the side length of the equilateral triangle: ");
                double sideEquilateral = scanner.nextDouble();
                double perimeterEquilateralTriangle = 3 * sideEquilateral;
                System.out.println("Perimeter of the equilateral triangle: " + perimeterEquilateralTriangle);
                break;

            case 3:
                // Perimeter of Parallelogram
                System.out.print("Enter the base of the parallelogram: ");
                double baseParallelogram = scanner.nextDouble();
                System.out.print("Enter the side of the parallelogram: ");
                double sideParallelogram = scanner.nextDouble();
                double perimeterParallelogram = 2 * (baseParallelogram + sideParallelogram);
                System.out.println("Perimeter of the parallelogram: " + perimeterParallelogram);
                break;

            case 4:
                // Perimeter of Rectangle
                System.out.print("Enter the length of the rectangle: ");
                double lengthRectangle = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double widthRectangle = scanner.nextDouble();
                double perimeterRectangle = 2 * (lengthRectangle + widthRectangle);
                System.out.println("Perimeter of the rectangle: " + perimeterRectangle);
                break;

            case 5:
                // Perimeter of Square
                System.out.print("Enter the side length of the square: ");
                double sideSquare = scanner.nextDouble();
                double perimeterSquare = 4 * sideSquare;
                System.out.println("Perimeter of the square: " + perimeterSquare);
                break;

            case 6:
                // Perimeter of Rhombus
                System.out.print("Enter the side length of the rhombus: ");
                double sideRhombus = scanner.nextDouble();
                double perimeterRhombus = 4 * sideRhombus;
                System.out.println("Perimeter of the rhombus: " + perimeterRhombus);
                break;

            default:
                System.out.println("Invalid choice. Please select a number between 1 and 6.");
                break;
        }

        scanner.close();
    }
}

