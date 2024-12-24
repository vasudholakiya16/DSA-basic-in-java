package Recursion.Recursion_Permutations;

public class Counting_The_Number {
    static int countNumberInPermutation(String process,String unProcess){
        if (unProcess.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = unProcess.charAt(0);
        for (int i = 0; i <=process.length() ; i++) {
            String first = process.substring(0,i);
            String second = process.substring(i,process.length());
            count = count + countNumberInPermutation( first + ch+second,unProcess.substring(1));
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countNumberInPermutation("","abc"));
    }
}
