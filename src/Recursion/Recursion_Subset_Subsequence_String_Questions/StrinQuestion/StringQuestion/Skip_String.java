package Recursion.Recursion_Subset_Subsequence_String_Questions.StrinQuestion.StringQuestion;

public class Skip_String {
    static String skipString(String unProcess){
        if (unProcess.isEmpty()){
            return "";
        }
        if (unProcess.startsWith("apple")){
            return skipString(unProcess.substring(5));
        }else {
            return unProcess.charAt(0) + skipString(unProcess.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(skipString("vasuapplemango"));
    }
}
