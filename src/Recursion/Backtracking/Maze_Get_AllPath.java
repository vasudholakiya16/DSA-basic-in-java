
package Recursion.Backtracking;

public class Maze_Get_AllPath {

    static void mazeAllDirection(String process, boolean[][] maze, int row, int column) {
        // Base case: If we reach the bottom-right corner, print the path
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            System.out.println(process);
            return;
        }

        // Check if the current cell is valid or not
        if (!maze[row][column]) {
            return;
        }

        // Mark the current cell as visited
        maze[row][column] = false;

        // Move Down
        if (row < maze.length - 1) {
            mazeAllDirection(process + 'D', maze, row + 1, column);
        }
        // Move Right
        if (column < maze[0].length - 1) {
            mazeAllDirection(process + 'R', maze, row, column + 1);
        }
        // Move Up
        if (row > 0) {
            mazeAllDirection(process + 'U', maze, row - 1, column);
        }
        // Move Left
        if (column > 0) {
            mazeAllDirection(process + 'L', maze, row, column - 1);
        }

        // Backtrack: Unmark the current cell as visited
        // this line is where the function will be over
//        // so before the function gets remove, also remove the changes
//        // that where made by this function:- this process is known as back tracking
        maze[row][column] = true;
    }

    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        mazeAllDirection("", board, 0, 0);
    }
}
