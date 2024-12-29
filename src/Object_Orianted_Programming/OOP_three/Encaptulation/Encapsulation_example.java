package Object_Orianted_Programming.OOP_three.Encaptulation;


class Student {
    // Private variables (data hiding)
    private String name;
    private int age;

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) { // Validation logic
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

public class Encapsulation_example {
    public static void main(String[] args) {
        Student student = new Student();

        // Setting values using setter methods
        student.setName("Alice");
        student.setAge(20);

        // Getting values using getter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        // Invalid age example
        student.setAge(-5); // Prints: Age must be positive.
    }
}
