package StringsandStringBuilder;

public class Comparison {
    public static void main(String[] args) {
        // example of string pool
        String a = "Vasu";
        String b="Vasu";

        System.out.println("If not use the new key word"+a ==b);

        String d = new String("Meet");
        String f= new String("Meet");
// creating this values outSide the pool but in heep
        System.out.println("If we use a new keyword then we show a output"+d==f); // == represent a compareter


        // when we check the only value the use equal method
        System.out.println("Use equals method our output is :- "+d.equals(f)); // equals also known as a method
        System.out.println("Print the charIndex value in string "+ d.charAt(3));
    }
}
