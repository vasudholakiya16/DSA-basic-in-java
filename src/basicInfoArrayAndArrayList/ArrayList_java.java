package basicInfoArrayAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        Syntax:-
        ArrayList<Type> listName = new ArrayList<>();
        */

        ArrayList<Integer> list = new ArrayList<>(14);
        list.add(74); // add the value
        list.add(78);
        System.out.println("value of list is :"+ list);
        System.out.println( "The value is " + list.contains(45));
        System.out.println("The value is "+list.contains(78));
        list.set(0,99); // update the value
        System.out.println("The updated item is use set method " +  list);

        list.remove(1); // remove items
        System.out.println("The update item list after teh remove item " + list);


        // Input

        for (int i = 0;  i<5 ; i++) {
            list.add(sc.nextInt());
        }
        // get item at any Index
        for (int i = 0;  i<5 ; i++) {
            System.out.println(list.get(i)); // pass Index hear list[index] not work
        }
        System.out.println(list);

    }
}
