package Functions;

import java.util.Arrays;

public class VariableArguments {
    static void  fun(int  ...v){
        System.out.println(Arrays.toString(v));

    }
    static void  mul(int a , int b ,int ...v){
        System.out.println("The value of a is :-" +a + " The value of b is :-" + b + "The value of array of v is :-"+ Arrays.toString(v));
    }
    public static void main(String[] args) {
        fun(7,8,7,8);
        mul(7,8,7,7,99,78);

    }
}
