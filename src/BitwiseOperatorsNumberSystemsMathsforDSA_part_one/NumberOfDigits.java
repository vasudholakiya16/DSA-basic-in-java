package BitwiseOperatorsNumberSystemsMathsforDSA_part_one;

public class NumberOfDigits {
    public static void main(String[] args) {
        int n = 16 ; // number
        int b = 2; // base
        int ans = (int)(Math.log(n)/Math.log(b)) +1 ;
        System.out.println(ans);
    }
}
