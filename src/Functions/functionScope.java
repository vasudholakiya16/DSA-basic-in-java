package Functions;

import org.w3c.dom.ls.LSOutput;

public class functionScope {


// Access Modifiers and Scope
    private int privateVar = 10; // Accessible only within this class
    protected int protectedVar = 20; // Accessible within the same package and by subclasses
    public int publicVar = 30; // Accessible from anywhere
    public void anotherMethod() { // example of Method Scope
        // System.out.println(num); // Error: num is not accessible here
    }


    // example of Class Scope (Instance and Static Variables)
    int instanceVar = 10; // Instance variable (class scope)
    static int staticVar = 20; // Static variable (class scope)

    public void instanceMethod() {
        System.out.println(instanceVar); // Can access instance variable
    }



    public static void main(String[] args) {

        System.out.println("Block Scope (Local Variables)");
        int x = 5; // x is accessible here

        if (x > 0) {
            int y = 10; // y is only accessible inside this block
            System.out.println("y = " + y); // valid
        }
        // System.out.println("y = " + y); // Error: y is out of scope here
        System.out.println("Method Scope");
        int num = 42; // num is only accessible inside exampleMethod
        System.out.println(num);

        System.out.println("Class Scope (Instance and Static Variables)");
        // System.out.println(instanceVar); // Error: Cannot access instance variable from static method
        System.out.println(staticVar); // Can access static variable

        System.out.println(" Global Scope (Package Scope)");
        int packageVar = 100; // Accessible by other classes in the same package

        System.out.println("Nested Class Scope");

    }


    }




