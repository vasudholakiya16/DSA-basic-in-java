import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        float num = input.nextFloat();
        System.out.println("Number is : " + num);

        // type casting

        int newNum = (int) (89.23f );
        System.out.println("New number is : " + newNum);

        // automatic type promotion in expressions

        int a = 257;
        byte b = (byte) (a);
        System.out.println("Byte is : " + b);  // 257 % 256 = 1 (byte range is -128 to 127) so 257 % 256 = 1

        // automatic type promotion in expressions

        // byte -> short -> int -> long -> float -> double
        // char -> int -> long -> float -> double

        int a1 = 50;
        long b1 = a1; // automatic type promotion
        float c = b1; // automatic type promotion
        System.out.println("Value of c: " + c); // 50.0

        byte b2= 50;
        byte b3 = 60;
        byte b4 = 70;
        int result = (b2 * b3) / b4; // b2 * b3 = 3000 / b4 = 42 (byte) 70 % 256 = 42 (byte range is -128 to 127) so 70 % 256 = 42
        System.out.println("Result is : " + result); // 42


        int number = 'S';
        System.out.println("Number is : " + number); // 83





    }
}
