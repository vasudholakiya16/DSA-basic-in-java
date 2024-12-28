package Object_Orianted_Programming.OOP_three.Inheritance.HybridInheritance;

// Base class
class Vehicle {
    void displayType() {
        System.out.println("This is a vehicle.");
    }
}

// Interface 1
interface Engine {
    void engineType();
}

// Interface 2
interface Wheels {
    void wheelType();
}

// Derived class 1
class Car extends Vehicle implements Engine, Wheels {
    @Override
    public void engineType() {
        System.out.println("Car has a petrol/diesel engine.");
    }

    @Override
    public void wheelType() {
        System.out.println("Car has 4 wheels.");
    }
}

// Derived class 2
class Bike extends Vehicle implements Engine, Wheels {
    @Override
    public void engineType() {
        System.out.println("Bike has a small petrol engine.");
    }

    @Override
    public void wheelType() {
        System.out.println("Bike has 2 wheels.");
    }
}

// Main class
public class HybridInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.displayType();
        car.engineType();
        car.wheelType();

        System.out.println();

        Bike bike = new Bike();
        bike.displayType();
        bike.engineType();
        bike.wheelType();
    }
}
