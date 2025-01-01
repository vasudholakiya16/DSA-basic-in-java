package Object_Orianted_Programming.OOP_four.Access_Control.Protected_Modifier;

class Parent {
    protected String protectedMessage = "This is protected";

    protected void showProtectedMessage() {
        System.out.println(protectedMessage);
    }
}

class Child extends Parent {
    void accessParentProtected() {
        showProtectedMessage(); // Valid: Inherited protected method
    }
}

public class basic_example {
    public static void main(String[] args) {
        Child child = new Child();
        child.accessParentProtected(); // Access via child
        // child.showProtectedMessage(); // Valid if in the same package; Error if outside
    }
}
