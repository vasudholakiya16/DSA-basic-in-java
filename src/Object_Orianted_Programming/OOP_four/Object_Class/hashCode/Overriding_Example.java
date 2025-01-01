package Object_Orianted_Programming.OOP_four.Object_Class.hashCode;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

public class Overriding_Example {
    public static void main(String[] args) {
        Person p = new Person("Alice");
        System.out.println(p.hashCode()); // Output: Hash code based on the name "Alice"
    }
}
