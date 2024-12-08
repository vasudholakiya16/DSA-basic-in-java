package BitwiseOperatorsNumberSystemsMathsforDSA_part_one;

public class XOR_with_range_a_to_b {
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
        // range XOR for a,b , b =xor(b) ^ xor(a-1)
        int a = 3;
        int b = 9;

        int ans = range_zero_to_a(b) ^ range_zero_to_a(a-1);
        System.out.println(ans);


        // only check, will give time limit exit for large numbers
        int ans2 =0;
        for (int i = a; i <=b ; i++) {
            ans2 ^=i;
        }
        System.out.println(ans2);

    }
}
