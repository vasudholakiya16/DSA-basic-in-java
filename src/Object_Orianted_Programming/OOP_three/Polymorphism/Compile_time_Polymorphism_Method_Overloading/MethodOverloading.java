package Object_Orianted_Programming.OOP_three.Polymorphism.Compile_time_Polymorphism_Method_Overloading;

class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 integers: " + calc.add(10, 20));        // Calls method with 2 int parameters
        System.out.println("Sum of 3 integers: " + calc.add(10, 20, 30));    // Calls method with 3 int parameters
        System.out.println("Sum of 2 doubles: " + calc.add(10.5, 20.3));     // Calls method with 2 double parameters
    }
}
