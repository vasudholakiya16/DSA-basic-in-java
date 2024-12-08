package Maths_for_Data_Structures_and_Algorithms;

public class Sieve_of_Eratosthenes {


    // false in array it means our number is prime because
    static void sieve( int n ,  boolean [] primes){

        for (int i = 2; i*i <=n ; i++) {
            if (!primes[i]){
                for (int j = i*2; j <=n ; j+=i) {
                    primes[j]=true;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if (!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int n = 40;
        boolean[]primes = new boolean[n+1];
        System.out.println(primes[0]); // false
        sieve(n,primes);

    }
}
