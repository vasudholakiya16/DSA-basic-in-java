package Object_Orianted_Programming.OOP_three.Polymorphism.Run_time_Polymorphism_Method_Overriding;

class Animal {
    void sound() {
        System.out.println("This is a generic animal sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        Animal myAnimal; // Reference of type Animal

        myAnimal = new Dog(); // Dog object
        myAnimal.sound();

        myAnimal = new Cat(); // Cat object
        myAnimal.sound();
    }
}
