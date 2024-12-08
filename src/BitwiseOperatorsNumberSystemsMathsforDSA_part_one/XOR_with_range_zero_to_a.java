package BitwiseOperatorsNumberSystemsMathsforDSA_part_one;

public class XOR_with_range_zero_to_a {

    public static int range_zero_to_a( int ans){
        if (ans%4==0){
            return ans;
        }
        if (ans%4 == 1){
            return 1;
        }
        if (ans%4==2){
            return ans+1;
        }
        if (ans%4==3){
            return 0;
        }

        return ans;
    }
    public static void main(String[] args) {
        int ans = 9;

        System.out.println(range_zero_to_a(ans));
    }
}
