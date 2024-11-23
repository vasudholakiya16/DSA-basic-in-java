package AssignmentQuestionSol.Conditionalsloops;

import java.util.Scanner;

public class VolumeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the menu
        System.out.println("Choose the shape to calculate the volume:");
        System.out.println("1. Volume of Cone");
        System.out.println("2. Volume of Prism");
        System.out.println("3. Volume of Cylinder");
        System.out.println("4. Volume of Sphere");
        System.out.println("5. Volume of Pyramid");

        // Take user choice
        System.out.print("Enter the choice (1-5): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Volume of Cone
                System.out.print("Enter the radius of the cone: ");
                double radiusCone = scanner.nextDouble();
                System.out.print("Enter the height of the cone: ");
                double heightCone = scanner.nextDouble();
                double volumeCone = (1.0 / 3) * Math.PI * radiusCone * radiusCone * heightCone;
                System.out.println("Volume of the cone: " + volumeCone);
                break;

            case 2:
                // Volume of Prism
                System.out.print("Enter the base area of the prism: ");
                double baseAreaPrism = scanner.nextDouble();
                System.out.print("Enter the height of the prism: ");
                double heightPrism = scanner.nextDouble();
                double volumePrism = baseAreaPrism * heightPrism;
                System.out.println("Volume of the prism: " + volumePrism);
                break;

            case 3:
                // Volume of Cylinder
                System.out.print("Enter the radius of the cylinder: ");
                double radiusCylinder = scanner.nextDouble();
                System.out.print("Enter the height of the cylinder: ");
                double heightCylinder = scanner.nextDouble();
                double volumeCylinder = Math.PI * radiusCylinder * radiusCylinder * heightCylinder;
                System.out.println("Volume of the cylinder: " + volumeCylinder);
                break;

            case 4:
                // Volume of Sphere
                System.out.print("Enter the radius of the sphere: ");
                double radiusSphere = scanner.nextDouble();
                double volumeSphere = (4.0 / 3) * Math.PI * Math.pow(radiusSphere, 3);
                System.out.println("Volume of the sphere: " + volumeSphere);
                break;

            case 5:
                // Volume of Pyramid
                System.out.print("Enter the base area of the pyramid: ");
                double baseAreaPyramid = scanner.nextDouble();
                System.out.print("Enter the height of the pyramid: ");
                double heightPyramid = scanner.nextDouble();
                double volumePyramid = (1.0 / 3) * baseAreaPyramid * heightPyramid;
                System.out.println("Volume of the pyramid: " + volumePyramid);
                break;

            default:
                System.out.println("Invalid choice. Please select a number between 1 and 5.");
                break;
        }

        scanner.close();
    }
}
