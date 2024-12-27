package Object_Orianted_Programming.OOP_two.static_keyWord;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
  static  long population;

  static void message(){
      System.out.println("Have a nice day bro...");
      //System.out.println(this.age); // gives me error because of static is not dependent to object
                /*
                In our example message is not dependent in Human class it means we have not print a
                 System.out.println(this.age); line
                 */

  }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population +=1;
        Human.message();
    }
}
