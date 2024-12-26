package Recursion.Backtracking;

public class Code_for_N_Knights_Problem {

    static void knight(boolean[][]board,int row,int column ,int knights){
        if (knights==0){
            display(board);
            System.out.println();
            return;
        }
        if (row==board.length-1 && column== board.length){
            return;
        }
        if (column== board.length){
            knight(board,row+1,0,knights);
            return;
        }
        if (isSafe(board,row,column)){
            board[row][column] = true;
            knight(board,row,column+1,knights-1);
            board[row][column] = false;
        }
        knight(board,row,column+1,knights);

    }
    private static boolean isSafe(boolean[] [] board,int row,int column){

        if (isValid(board,row-2,column-1)){
            if (board[row-2][column-1]){
                return false;
            }
        }
        if (isValid(board,row-1,column-2)){
            if (board[row-1][column-2]){
                return false;
            }
        }
        if (isValid(board,row-2,column+1)){
            if (board[row-2][column+1]){
                return false;
            }
        }
        if (isValid(board,row-1,column+2)){
            if (board[row-1][column+2]){
                return false;
            }
        }
        return true;
    }
// do not repeat your self hence created this function
    static boolean isValid(boolean[][]board, int row,int column){
        if (row>=0 && row< board.length && column>=0 && column<board.length){
            return true;
        }
        return false;
    }
    // code for base condition
    private static void display(boolean[][] board){
        for(boolean[] row: board){
            for (boolean element:row){
                if (element){
                    System.out.print("K " );
                }else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n=5;
        boolean [][] board = new boolean[n][n];
        knight(board,0,0,4);
    }
}
