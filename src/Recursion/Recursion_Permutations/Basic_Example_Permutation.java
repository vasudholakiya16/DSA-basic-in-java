package Recursion.Recursion_Permutations;

import java.util.ArrayList;

public class Basic_Example_Permutation {

    static void permutation (String process,String unProcess){
        if (unProcess.isEmpty()){
            System.out.println(process);
            return;
        }
        char ch = unProcess.charAt(0);
        for (int i = 0; i <=process.length() ; i++) {

            String first = process.substring(0,i);
            String second = process.substring(i,process.length());
            permutation(first + ch + second , unProcess.substring(1) );
        }

    }

    static ArrayList<String> permutationUsArrayList(String process,String unProcess){
        if (unProcess.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
         }
        char ch = unProcess.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <=process.length() ; i++) {

            String first = process.substring(0,i);
            String second = process.substring(i, process.length());
            ans.addAll(permutationUsArrayList(first+ch+second, unProcess.substring(1)));

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Print the answer without use list :- ");
        permutation("","abc");
        System.out.println("Print The answer use in list :-");
        ArrayList<String> ans = permutationUsArrayList("","abc");
        System.out.println(ans);


    }
}
