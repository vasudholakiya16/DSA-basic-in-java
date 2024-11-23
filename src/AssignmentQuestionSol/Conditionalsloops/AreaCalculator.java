package AssignmentQuestionSol.Conditionalsloops;

import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the menu
        System.out.println("Choose the shape to calculate the area:");
        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Triangle");
        System.out.println("3. Area of Rectangle");
        System.out.println("4. Area of Isosceles Triangle");
        System.out.println("5. Area of Parallelogram");
        System.out.println("6. Area of Rhombus");
        System.out.println("7. Area of Equilateral Triangle");

        // Take user choice
        System.out.print("Enter the choice (1-7): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Area of Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double areaCircle = Math.PI * radius * radius;
                System.out.println("Area of the circle: " + areaCircle);
                break;

            case 2:
                // Area of Triangle
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                double areaTriangle = 0.5 * base * height;
                System.out.println("Area of the triangle: " + areaTriangle);
                break;

            case 3:
                // Area of Rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                double areaRectangle = length * width;
                System.out.println("Area of the rectangle: " + areaRectangle);
                break;

            case 4:
                // Area of Isosceles Triangle
                System.out.print("Enter the base of the isosceles triangle: ");
                double baseIsosceles = scanner.nextDouble();
                System.out.print("Enter the height of the isosceles triangle: ");
                double heightIsosceles = scanner.nextDouble();
                double areaIsoscelesTriangle = 0.5 * baseIsosceles * heightIsosceles;
                System.out.println("Area of the isosceles triangle: " + areaIsoscelesTriangle);
                break;

            case 5:
                // Area of Parallelogram
                System.out.print("Enter the base of the parallelogram: ");
                double baseParallelogram = scanner.nextDouble();
                System.out.print("Enter the height of the parallelogram: ");
                double heightParallelogram = scanner.nextDouble();
                double areaParallelogram = baseParallelogram * heightParallelogram;
                System.out.println("Area of the parallelogram: " + areaParallelogram);
                break;

            case 6:
                // Area of Rhombus
                System.out.print("Enter the first diagonal of the rhombus: ");
                double d1 = scanner.nextDouble();
                System.out.print("Enter the second diagonal of the rhombus: ");
                double d2 = scanner.nextDouble();
                double areaRhombus = 0.5 * d1 * d2;
                System.out.println("Area of the rhombus: " + areaRhombus);
                break;

            case 7:
                // Area of Equilateral Triangle
                System.out.print("Enter the side length of the equilateral triangle: ");
                double side = scanner.nextDouble();
                double areaEquilateralTriangle = (Math.sqrt(3) / 4) * side * side;
                System.out.println("Area of the equilateral triangle: " + areaEquilateralTriangle);
                break;

            default:
                System.out.println("Invalid choice. Please select a number between 1 and 7.");
                break;
        }

        scanner.close();
    }
}
