package BitwiseOperatorsNumberSystemsMathsforDSA_part_one;

public class PowerOfANumber {
    public static void main(String[] args) {
        int base= 2;
        int power= 6;
        int ans = 1;

        while (power>0){
            if ((power & 1 )==1){ // check last value
                ans *=base;
            }
            base *=base;
            power = power>> 1; // increase our power apply right shift
        }
        System.out.println(ans);
    }
}
