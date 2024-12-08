package BitwiseOperatorsNumberSystemsMathsforDSA_part_one;

public class MagicNumber {

    public static void main(String[] args) {
        int n = 1;
        int ans = 0;
        int base = 5;

        while (n>0){
            int last = n & 1; // get the lase number
            n = n>>1; // left shift
            ans +=last*base; // print the answer value
            base = base*5; // set the bas value
        }

        System.out.println(ans);

    }
}
