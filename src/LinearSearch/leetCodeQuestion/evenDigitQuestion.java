package LinearSearch.leetCodeQuestion;
// leetCode :- 1295. Find Numbers with Even Number of Digits

// Given an array nums of integers, return how many of them contain an even number of digits.
    /*
    Example 1:
        Input: nums = [12,345,2,6,7896]
        Output: 2
        Explanation:
        12 contains 2 digits (even number of digits).
        345 contains 3 digits (odd number of digits).
        2 contains 1 digit (odd number of digits).
        6 contains 1 digit (odd number of digits).
        7896 contains 4 digits (even number of digits).
        Therefore, only 12 and 7896 contain an even number of digits.
Example 2:

        Input: nums = [555,901,482,1771]
        Output: 1
        Explanation:
        Only 1771 contains an even number of digits.
     */
public class evenDigitQuestion {

    static int findNumbers(int[] nums){
        int count = 0;
        for (int num: nums) {
            if (even(num)){
                count ++;
            }
        }
        

        return count;
    }
// function contain when the number contain even number of digit or not
    private static boolean even(int num) {
        int numberOfDigits = digits(num);
        if (numberOfDigits%2 ==0){
            return true; // number is even number
        }
        return false; // number is odd number

    }
    // count number of digit in a number
    static int digits(int num){

        if (num<0){
            num = num * -1;
        }
        if (num ==0){
            return 1;
        }
        int count = 0;
        while (num>0){
            count++;
            num =num/10; // num/= 10
        }
        return count;

    }

    // small format of digits class
    static int digits2 (int num){
        return (int)(Math.log10(num)+ 1 );
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));


    }

}
