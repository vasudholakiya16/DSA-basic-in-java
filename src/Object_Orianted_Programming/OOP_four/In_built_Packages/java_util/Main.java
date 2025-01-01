package Object_Orianted_Programming.OOP_four.In_built_Packages.java_util;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Using ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add(name);
        names.add("John");

        System.out.println("Names list: " + names);
        scanner.close();
    }
}

