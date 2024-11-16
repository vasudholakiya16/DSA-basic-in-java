import java.util.Scanner;

public class Switch_statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
//         basic difference between == and equals() method
//         == is used to compare the reference of the object
//         equals() is used to compare the content of the object

        if (fruit.equals("mango")) {
            System.out.println("King of fruits");
        } else if (fruit.equals("apple")) {
            System.out.println("Sweet red fruit");
        } else if (fruit.equals("banana")) {
            System.out.println("Yellow fruit");
        } else {
            System.out.println("Please enter a valid fruit name");
        }

//         switch statement
        switch (fruit) {
            case "mango":
                System.out.println("King of fruits");
                break;
            case "apple":
                System.out.println("Sweet red fruit");
                break;
            case "banana":
                System.out.println("Yellow fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit name");
        }

        // Nested Switch cases
        try {
            // Read empID as an integer
            System.out.print("Enter Employee ID: ");
            int empID = input.nextInt();

            // Read Department as a string
            System.out.print("Enter Department: ");
            String department = input.next();

            // Switch for empID
            switch (empID) {
                case 1:
                    System.out.println("Vasu");
                    break;
                case 2:
                    System.out.println("Meet");
                    break;
                case 3:
                    System.out.println("Dev");
                    break;
                case 4:
                    System.out.println("Jax");
                    break;
                case 5:
                    System.out.println("EmpID: 5");
                    // Nested switch for department
                    switch (department) {
                        case "TI":
                            System.out.println("IT Department");
                            break;
                        case "Management":
                            System.out.println("Management Department");
                            break;
                        default:
                            System.out.println("Unknown Department");
                            break;
                    }
                    break;
                default:
                    System.out.println("Enter a valid Employee ID");
                    break;
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter the correct format.");
        } finally {
            input.close(); // Close the scanner
        }


    }
}
