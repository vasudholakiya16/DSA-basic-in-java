package AssignmentQuestionSol.Function;

// Define a program to find out whether a given number is even or odd.
public class Number_is_even_odd {

    public static void evenOdd(int num){
        if (num==0){
            return;
        }

        if (num %2 ==0){
            System.out.println("Number is even:- " + num);
        }else {
            System.out.println("Number is Odd:- "+num);
        }
    }

    public static boolean oddNum(int num){
        if (num==0){
            System.out.println("Place Enter a valid Number");
        }
        return (num&1)==1;
    }
    public static void main(String[] args) {

        int num = 23;
        evenOdd(num);
        System.out.println(oddNum(num));


    }
}
