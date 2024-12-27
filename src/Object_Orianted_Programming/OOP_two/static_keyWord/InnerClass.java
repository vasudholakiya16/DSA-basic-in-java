package Object_Orianted_Programming.OOP_two.static_keyWord;

public class InnerClass {
  static    class Test{
         String name;
         int age;

         public Test(String name, int age) {
             this.name = name;
             this.age = age;
         }
     }

    public static void main(String[] args) {
        Test a = new Test("Vasu",36);
        Test b = new Test("Het",13);
        System.out.println(a.name);
        System.out.println(b.name);

    }
}
