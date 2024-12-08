package Maths_for_Data_Structures_and_Algorithms;

public class PrinmeNumber_or_not {

    public static boolean isPrime(int n ){
        if (n<=1){
            return false;
        }
        int c = 2;
        while (c*c <=n){ // or c<=sqrt(n); if  square bot the side c*c<=n comes
            if (n%c == 0){
                return false;
            }
                c++;
        }
        return true;
    }

    public static void main(String[] args) {
        int n =20;
        for (int i = 1; i <=n ; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }
}
