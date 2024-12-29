package Object_Orianted_Programming.OOP_three.Abstraction;

// Abstract class
abstract class Shape {
    // Abstract method (no implementation)
    abstract void draw();

    // Concrete method (with implementation)
    public void displayShapeType() {
        System.out.println("This is a shape.");
    }
}

// Concrete class extending abstract class
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Abstraction_example {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw(); // Output: Drawing a circle.
        rectangle.draw(); // Output: Drawing a rectangle.
    }
}
