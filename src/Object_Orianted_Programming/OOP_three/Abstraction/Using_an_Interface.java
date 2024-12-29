package Object_Orianted_Programming.OOP_three.Abstraction;

// Interface
interface Animal {
    void sound(); // Abstract method
}

// Class implementing the interface
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
}

public class Using_an_Interface {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound(); // Output: Dog barks.
        cat.sound(); // Output: Cat meows.
    }
}
