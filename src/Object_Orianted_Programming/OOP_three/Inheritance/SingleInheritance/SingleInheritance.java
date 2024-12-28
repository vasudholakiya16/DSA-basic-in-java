package Object_Orianted_Programming.OOP_three.Inheritance.SingleInheritance;

// Parent class
class One {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}

class Two extends Object_Orianted_Programming.OOP_three.MultilevelInheritance.One {
    public void print_for() { System.out.println("for"); }
}

// Driver class
public class SingleInheritance {
    // Main function
    public static void main(String[] args)
    {
        Object_Orianted_Programming.OOP_three.MultilevelInheritance.Two g = new Object_Orianted_Programming.OOP_three.MultilevelInheritance.Two();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}