package Object_Orianted_Programming.OOP_four.Object_Class.toStringMethod;


class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        System.out.println(person.toString()); // Output: Person{name='Alice'}
    }
}
