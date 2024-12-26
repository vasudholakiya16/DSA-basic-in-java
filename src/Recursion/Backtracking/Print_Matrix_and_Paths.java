package Recursion.Backtracking;

import java.util.Arrays;

public class Print_Matrix_and_Paths {

    static void mazeAllDirection(String process, boolean[][] maze, int row, int column,int [] [] path
    ,int step) {
        // Base case: If we reach the bottom-right corner, print the path
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            path[row][column] = step;
            for (int[] arr:path ) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(process);
            System.out.println();
            return;
        }

        // Check if the current cell is valid or not
        if (!maze[row][column]) {
            return;
        }

        // Mark the current cell as visited
        maze[row][column] = false;
        path[row][column]= step;

        // Move Down
        if (row < maze.length - 1) {
            mazeAllDirection(process + 'D', maze, row + 1, column,path,step+1);
        }
        // Move Right
        if (column < maze[0].length - 1) {
            mazeAllDirection(process + 'R', maze, row, column + 1,path,step+1);
        }
        // Move Up
        if (row > 0) {
            mazeAllDirection(process + 'U', maze, row - 1, column,path,step+1);
        }
        // Move Left
        if (column > 0) {
            mazeAllDirection(process + 'L', maze, row, column - 1,path,step+1);
        }

        // Backtrack: Unmark the current cell as visited
        // this line is where the function will be over
//        // so before the function gets remove, also remove the changes
//        // that where made by this function:- this process is known as back tracking
        maze[row][column] = true;
        path[row][column]=0;
    }


    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        int[][] path = new int[board.length][board[0].length];
        mazeAllDirection("", board, 0, 0,path,1);

    }
}
