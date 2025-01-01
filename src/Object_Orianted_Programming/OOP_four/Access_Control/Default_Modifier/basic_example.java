package Object_Orianted_Programming.OOP_four.Access_Control.Default_Modifier;

class DefaultExample {
    String defaultMessage = "This is default";

    void displayDefaultMessage() {
        System.out.println(defaultMessage);
    }
}

public class basic_example {
    public static void main(String[] args) {
        DefaultExample example = new DefaultExample();
        example.displayDefaultMessage(); // Valid if in the same package
    }
}

