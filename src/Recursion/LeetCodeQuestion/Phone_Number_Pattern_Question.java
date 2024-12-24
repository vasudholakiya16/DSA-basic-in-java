package Recursion.LeetCodeQuestion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phone_Number_Pattern_Question {

    static void phonePattern(String process, String unProcess){
        if (unProcess.isEmpty()){
            System.out.println(process);
            return;
        }
     int digit =unProcess.charAt(0) - '0'; // convert '2' into 2

        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char) ('a'+i);
            phonePattern(process+ch,unProcess.substring(1));
        }
    }

    static ArrayList<String> phonePatternUseArrayList(String process,String unProcess){
        if (unProcess.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }
        int digit = unProcess.charAt(0) -'0'; // convert '0' to 0
        ArrayList<String> list = new ArrayList<>();

        for (int i =(digit-1)*3; i <digit*3 ; i++) {

            char ch = (char) ('a' +i);
            list.addAll(phonePatternUseArrayList(process+ch,unProcess.substring(1)));
        }
        return list;
    }

    // code for phone Number pattern count

    static int PhoneNumberPatternCount(String process,String unProcess){
        if (unProcess.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = unProcess.charAt(0) - '0'; // convert to '2' to 2
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char) ('a'+i);
            count = count + PhoneNumberPatternCount(process+ch,unProcess.substring(1));

        }
        return count;
    }

   static public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return res;
        }

        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        backtrack(digits, 0, new StringBuilder(), res, digitToLetters);

        return res;
    }

    private static void backtrack(String digits, int idx, StringBuilder comb, List<String> res, Map<Character, String> digitToLetters) {
        if (idx == digits.length()) {
            res.add(comb.toString());
            return;
        }

        String letters = digitToLetters.get(digits.charAt(idx));
        for (char letter : letters.toCharArray()) {
            comb.append(letter);
            backtrack(digits, idx + 1, comb, res, digitToLetters);
            comb.deleteCharAt(comb.length() - 1);
        }
    }

    public static void main(String[] args) {
        phonePattern("","12");
        System.out.println(phonePatternUseArrayList("","12"));
        System.out.println(PhoneNumberPatternCount("","12"));
        System.out.println(letterCombinations("23"));

    }
}
