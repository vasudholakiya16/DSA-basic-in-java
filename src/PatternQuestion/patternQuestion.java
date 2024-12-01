package PatternQuestion;

public class patternQuestion {

    static void pattern1(int n){

        /*
         * * * *
         * * * *
         * * * *
         * * * *
         */
        for (int row = 1; row <=n ; row++) {
            for (int column = 1; column <=n ; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static  void  pattern2(int n ){
        /*
        *
        * *
        * * *
        * * * *
         */
        for (int row = 1; row <= n; row ++) {

            // for every row run the column 
            for (int column = 1; column <=row ; column++) {
                System.out.print("* ");
            }
            // when one row  is printed , we need to add new line
            System.out.println();
            
        }

    }
    static void pattern3(int n ){
        /*
         * * * *
         * * *
         * *
         *

         */
        for (int row = 1; row <=n ; row++) {
            for (int column = 1; column <=n-row+1 ; column++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern4(int n){
        /*
        1
        1 2
        1 2 3
        1 2 3 4
         */

        for (int row = 1; row <=n ; row++) {
            for (int column = 1; column <=row ; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        /*

         *
         * *
         * * *
         * * * *
         * * *
         * *
         *

         */
        for (int row = 0; row <2*n  ; row++) {
            int totelColsInRow = row > n? 2*n-row : row;
            for (int column = 0; column <totelColsInRow ; column++) {
                System.out.print("* ");
            }
            System.out.println();
            
        }

    }
    
    public  static void pattern28(int n){
        for (int row = 0; row <2*n ; row++) {
            int totalColsInRow = row > n ? 2* n - row : row;
            int onOfSpace = n -totalColsInRow;

            for (int s = 0; s <onOfSpace ; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col <totalColsInRow ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n ){
        for (int row = 0; row <=n ; row++) {

            for (int spaces = 0; spaces <n-row ; spaces++) {
                System.out.print("  ");
            }
            
            for (int column = row; column >=1 ; column--) {
                System.out.print(column + " ");
                
            }
            for (int column = 2 ; column <=row ; column++) {
                System.out.print(column+ " ");
                
            }
            System.out.println();

        }


    }

    static void pattern17(int n ){
        for (int row = 1; row <=2 * n ; row++) {
            int c = row > n ?  2 * n -row : row;


            for (int spaces = 0; spaces <n-c ; spaces++) {
                System.out.print("  ");
            }

            for (int column = c; column >=1 ; column--) {
                System.out.print(column + " ");

            }
            for (int column = 2 ; column <=c ; column++) {
                System.out.print(column+ " ");

            }
            System.out.println();

        }


    }

    static  void  pattern31(int n ){
        n = 2*n;
        for (int row = 0; row <n  ; row++) {
            for (int column = 0; column <n ; column++) {

                int ateveryIndex = Math.min(Math.min(row,column),Math.min(n-row, n-column));
                System.out.print(ateveryIndex + " ");
            }
            System.out.println();
            
        }
    }


    public static void main(String[] args) {
        System.out.println("Pattern 1 Answer");
        pattern2(4);
        System.out.println("Pattern 2 Answer");
        pattern1(4);
        System.out.println("Pattern 3 Answer");
        pattern3(4);
        System.out.println("Pattern 4 Answer");
        pattern4(4);
        System.out.println("Pattern 5 Answer");
        pattern5(4);
        System.out.println("Pattern 28 Answer");
        pattern28(4); 
        System.out.println("Pattern 30 Answer");
        pattern30(4);
        System.out.println("Pattern 17 Answer");
        pattern17(4);
        System.out.println("Pattern 31 Answer");
        pattern31(4);


    }
}
