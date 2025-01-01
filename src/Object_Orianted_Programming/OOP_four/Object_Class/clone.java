package Object_Orianted_Programming.OOP_four.Object_Class;



class Person implements Cloneable {
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class clone {
    public static void main(String[] args) {
        try {
            Person p1 = new Person("Alice");
            Person p2 = (Person) p1.clone();
            System.out.println(p1.name); // Output: Alice
            System.out.println(p2.name); // Output: Alice
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
