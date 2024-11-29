package StringsandStringBuilder;

public class StringPerformance {
    public static void main(String[] args) {
        String sr = " vasu ";
        for (int i = 0; i <26 ; i++) {
            char ch =(char) ('A'+ i);
//            System.out.println(ch);
            sr = sr+ch; // sc+= ch
        }
        System.out.println(sr);
    }
}
