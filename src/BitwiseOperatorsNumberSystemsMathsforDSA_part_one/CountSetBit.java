package BitwiseOperatorsNumberSystemsMathsforDSA_part_one;

public class CountSetBit {

    public static int SetBitsM1(int n ){
        int count =0;
        while (n > 0){
            count++;
            n-= (n & -n);
        }
        return count;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n & (n - 1); // Removes the lowest set bit
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(Integer.toBinaryString(n));
        System.out.println("Use Method 1 :- "+ SetBitsM1(n));
        System.out.println("Use Method 2 :- " + countSetBits(n));

    }
}
