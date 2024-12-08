package BitwiseOperatorsNumberSystemsMathsforDSA_part_one;

public class Find_Unique_number {
    /* Q- Give an array of number and that array every number appear twice only one number
    appearance  once find that number
     */
    public static int uniqueNum(int [] arr) {
        int unique = 0;
         for(int n :arr){
             unique ^= n;
         }

        return unique;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(uniqueNum(arr));
    }
}
