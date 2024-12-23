package Recursion.Recursion_Subset_Subsequence_String_Questions.StrinQuestion.SubsetQuestion;

import java.util.ArrayList;

public class PrintASCIIvalueofacharacter {

    static void printASCII(String process,String unProcess){
        if (unProcess.isEmpty()){
            System.out.println(process);
            return;
        }
        char ch = unProcess.charAt(0);
        printASCII(process+ch,unProcess.substring(1));
        printASCII(process,unProcess.substring(1));
        printASCII(process+ (ch+0), unProcess.substring(1));

    }

    static ArrayList<String>subSeqASCIIList(String process,String unProcess){
        if (unProcess.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }

        char ch= unProcess.charAt(0);
        ArrayList<String> first = subSeqASCIIList(process+ch,unProcess.substring(1));
        ArrayList<String> second = subSeqASCIIList(process,unProcess.substring(1));
        ArrayList<String> third = subSeqASCIIList(process+ (ch+0),unProcess.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }



    public static void main(String[] args) {
//        char ch = 'a';
//        System.out.println((char)(ch + 0));

        printASCII("","abc");
        ArrayList<String> result = subSeqASCIIList("", "abc");
        System.out.println(result);




    }
}
