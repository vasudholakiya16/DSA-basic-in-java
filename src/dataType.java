// Define the Car class
class Car {
    // Fields of the Car class
    String model;
    int year;

    // Constructor to initialize Car object
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    void displayCarDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}

public class dataType {

//    Car myCar = new Car("Toyota", 2022); // creating an object of the Car class

    public static void main(String[] args) {

        // object
        // Create an object of the Car class
        Car myCar = new Car("Toyota", 2022);

        // Call the method to display car details
        myCar.displayCarDetails();

        // Primitive data types
        int number = 100;
        double price = 19.99;
        char letter = 'J';
        boolean isJavaEasy = true;
        long largeValue = 4746456L;

        // Reference data types
        String message = "Welcome to Java!";
        int[] numbers = {1, 2, 3, 4, 5};

        // Output
        System.out.println("Integer: " + number);
        System.out.println("Double: " + price);
        System.out.println("Char: " + letter);
        System.out.println("Boolean: " + isJavaEasy);
        System.out.println("String: " + message);
        System.out.println("Array: ");
        System.out.println("Long: " + largeValue);
        for (int num : numbers) {
            System.out.print(num + " "); 
        }
    }
}
