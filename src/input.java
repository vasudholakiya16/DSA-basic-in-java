import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("Enter roll no: ");
        int rno= input.nextInt();
        System.out.print("Enter name: ");
        String name = input.next();
        System.out.println("Roll no: " + rno);
        System.out.println("Name: " + name);

        int a = (int) 2_360_000_000L;
        System.out.println(a); // -2147483648


        System.out.println("Enter marks: ");
        float marks = input.nextFloat();
        System.out.println("Marks: " + marks);

        System.out.println("Enter price: ");
        double price = input.nextDouble();
        System.out.println("Price: " + price);

        System.out.println("Enter grade: ");
        char grade = input.next().charAt(0);
        System.out.println("Grade: " + grade);

        System.out.println("Is Java fun? ");
        boolean isJavaFun = input.nextBoolean();
        System.out.println("Is Java fun: " + isJavaFun);

        System.out.println("Enter message: ");
        String message = input.nextLine();
        System.out.println("Message: " + message);

        input.close();






    }
}
