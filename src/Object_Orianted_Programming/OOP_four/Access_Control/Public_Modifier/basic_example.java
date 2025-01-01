package Object_Orianted_Programming.OOP_four.Access_Control.Public_Modifier;


public class basic_example {
    public String message = "This is public";

    public void displayMessage() {
        System.out.println(message);
    }
}

class Main {
    public static void main(String[] args) {
        basic_example example = new basic_example();
        System.out.println(example.message); // Accessible
        example.displayMessage();           // Accessible
    }
}
