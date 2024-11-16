package Functions;

public class swap_number {
    // use function we swap two numbers

    public static void swap(int a, int b) {
        // Print original values
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Temporary variable to help with the swap
        int temp = a;
        a = b;
        b = temp;

        // Print swapped values
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {

        // write down the code to swap two numbers without use functoin
        int a =10;
        int b=20;

        System.out.println(" value of a  is:-"+a + " value of b is:- "+b);
        int temp =a;
        a=b;
        b=temp;

        System.out.println("After perform Swap our a value is " +a+ " and our b value is "+b );
// with help to function swap the two number
        // Test the swap function
        int num1 = 5, num2 = 10;
        swap(num1, num2);  // Call the function to swap
    }
}
