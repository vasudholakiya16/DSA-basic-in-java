package Recursion.Recursion_Subset_Subsequence_String_Questions.StrinQuestion.StringQuestion;

public class Skip_a_string_if_it_not_the_required_string {
    static String skipAStringIfItNotTheRequireString(String unProcess) {
        if (unProcess.isEmpty()) {
            return "";
        }

        if (unProcess.startsWith("app") && !unProcess.startsWith("apple")) {
            return skipAStringIfItNotTheRequireString(unProcess.substring(3));
        } else {
            return unProcess.charAt(0) + skipAStringIfItNotTheRequireString(unProcess.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(skipAStringIfItNotTheRequireString("vasuapplmango"));
    }
}
