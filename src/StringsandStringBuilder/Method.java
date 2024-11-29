package StringsandStringBuilder;

import java.util.Arrays;

public class Method {
    public static void main(String[] args) {
        String name = "VasuDholakiya";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(name.getBytes()));
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name); // print original object because our string is immutable
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('h'));
        System.out.println("    Vasu    ".strip());
        String me= "Have a nice day bro";
        System.out.println(Arrays.toString(me.split(" ")));

    }
}
