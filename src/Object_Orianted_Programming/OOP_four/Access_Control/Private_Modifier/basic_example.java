package Object_Orianted_Programming.OOP_four.Access_Control.Private_Modifier;

class Example {
    private String secret = "This is private";

    private void displaySecret() {
        System.out.println(secret);
    }

    public void accessPrivate() {
        displaySecret(); // Accessing private method within the same class
    }
}

public class basic_example {
    public static void main(String[] args) {
        Example example = new Example();
        // example.displaySecret(); // Error: displaySecret() has private access
        example.accessPrivate(); // Valid: Indirect access through a public method
    }
}
