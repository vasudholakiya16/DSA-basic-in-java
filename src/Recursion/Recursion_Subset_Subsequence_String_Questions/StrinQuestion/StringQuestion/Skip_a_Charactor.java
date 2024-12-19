package Recursion.Recursion_Subset_Subsequence_String_Questions.StrinQuestion.StringQuestion;

public class Skip_a_Charactor {

    static void skip(String process,String unProcess){
        if (unProcess.isEmpty()){
            System.out.println(process);
            return;
        }

        char ch = unProcess.charAt(0);

        if (ch=='a'){
            skip(process,unProcess.substring(1));
        }else {
            skip(process + ch,unProcess.substring(1));
        }

    }

    public static void main(String[] args) {
        skip("", "vasuDholakiya");

    }
}
