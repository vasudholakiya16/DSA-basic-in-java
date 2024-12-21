package Recursion.Recursion_Subset_Subsequence_String_Questions.StrinQuestion.SubsetQuestion;

import java.util.ArrayList;

public class Sub_Sequence {

    static void subseq(String process, String unProcess) {
        if (unProcess.isEmpty()) {
            System.out.println(process);
            return;
        }

        char ch = unProcess.charAt(0);
        subseq(process + ch, unProcess.substring(1));
        subseq(process, unProcess.substring(1));
    }

    static ArrayList<String> subSeq(String process, String unProcess) {
        if (unProcess.isEmpty()) {

               /*
            ArrayList<String> list = new ArrayList<String>();
            list.add(process);
            return list;

            all field is return answer in the base condition
             */

            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }

        char ch = unProcess.charAt(0);

         /*
        ArrayList<String> left = subSeq(process+ch,unProcess.substring(1)); ;
        ArrayList<String> right = subSeq(process,unProcess.substring(1)); ;
        all field is answer for bellow call


         */

        ArrayList<String> left = subSeq(process + ch, unProcess.substring(1));
        ArrayList<String> right = subSeq(process, unProcess.substring(1));

        left.addAll(right); // Combine results from both recursive calls
        return left;
    }

    public static void main(String[] args) {
        // Print subsequences directly
        System.out.println("Subsequences printed directly:");
        subseq("", "abc");

        // Separator for clarity
        System.out.println("*********");

        // Print subsequences returned as a list
        System.out.println("Subsequences returned as a list:");
        ArrayList<String> result = subSeq("", "abc");
        System.out.println(result);
    }
}
