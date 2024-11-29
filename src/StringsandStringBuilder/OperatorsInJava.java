package StringsandStringBuilder;

import java.util.ArrayList;

public class OperatorsInJava {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println((char) ('a'+3));
        System.out.println("a"+1);// when integer is added with a string it is converted to Integer that will call toSeeing()
        System.out.println("Vasu" + new  ArrayList<>());
        System.out.println("Vasu" + new Integer(78));
//        System.out.println(new Integer(34) + new  ArrayList<>()); // error it say operator can't apply to integer and array list
        // in java operator is only define in primitives and require any one ot string that kind is work otherwise not

        System.out.println(new Integer(34)+"" + new  ArrayList<>());

    }
}
