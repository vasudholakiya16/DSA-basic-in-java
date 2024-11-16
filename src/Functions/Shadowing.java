package Functions;

public class Shadowing {
    // Instance variable (field)
    int num = 10;

    public void showShadowing() {
        // Local variable with the same name as the instance variable
        int num = 20;

        // Prints the local variable (shadows the instance variable)
        System.out.println("Local num: " + num);
    }

    public static void main(String[] args) {
        Shadowing obj = new Shadowing();
        obj.showShadowing();  // This will print "Local num: 20"
    }

}
