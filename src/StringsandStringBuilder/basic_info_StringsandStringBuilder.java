package StringsandStringBuilder;

import java.util.Arrays;

public class basic_info_StringsandStringBuilder {

    public static void main(String[] args) {
        String value = "Vasu Dholakiya";
        System.out.println(value);
        String[] name ={"meet","Mohan","Het"};
        System.out.println(Arrays.toString(name));

        String a= "Meet";
        String b = "Meet";
        System.out.println("our old a value is "+a);
        a="Vasu";
        System.out.println("Our new a value is "+ a);
    }
}
