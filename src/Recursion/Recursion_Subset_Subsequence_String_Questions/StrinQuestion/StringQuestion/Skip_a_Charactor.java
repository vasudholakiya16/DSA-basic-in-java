package Recursion.Recursion_Subset_Subsequence_String_Questions.StrinQuestion.StringQuestion;

public class Skip_a_Charactor {

    // Method 1: Skip character using process and unProcess
    static void skip(String process, String unProcess) {
        if (unProcess.isEmpty()) {
            System.out.println(process);
            return;
        }

        char ch = unProcess.charAt(0);

        if (ch == 'a') {
            skip(process, unProcess.substring(1));
        } else {
            skip(process + ch, unProcess.substring(1));
        }
    }

    // Method 2: Skip character and return the result
    static String skip(String unProcess) {
        if (unProcess.isEmpty()) {
            return "";
        }

        char ch = unProcess.charAt(0);

        if (ch == 'a') {
            return skip(unProcess.substring(1));
        } else {
            return ch + skip(unProcess.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println("Use Method :- 1");
        skip("", "vasuDholakiya");

        System.out.println("Use Method :- 2");
        System.out.println(skip("vasudholakiya")); // Print the result of the second method
    }
}
