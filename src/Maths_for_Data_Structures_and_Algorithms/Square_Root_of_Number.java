package Maths_for_Data_Structures_and_Algorithms;

public class Square_Root_of_Number {

    public static double sqrt(int num,int p ){
        int s=0;
        int e=num;
        double root = 0.0;
        while (s<=e){
            int mid = s+ (e-s)/2;
            if (mid*mid == num){
                root = mid;
                return root;
            }
            if (mid*mid > num){
                e = mid -1;
            }else {
                s = mid +1;
            }
        }
        double increment = 0.1;
        for (int i = 0; i <p ; i++) {
            while (root * root <=num){
                root+= increment;
            }
            root -= increment;
            increment /=10;
        }

        return root;

    }
    public static void main(String[] args) {
        int num=40;
        int p= 3;

        System.out.println(sqrt(num,p));
        System.out.printf("%.3f" , sqrt(num,p));

    }
}
