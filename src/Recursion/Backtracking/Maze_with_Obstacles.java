package Recursion.Backtracking;

public class Maze_with_Obstacles {

    static  void mazePathWithObstacles(String process,boolean[][] maze,int row,int column){
        if (row==maze.length-1 && column==maze[0].length-1) {
            System.out.println(process);
            return;
        }
        if (!maze[row][column]){
            return;
        }
        if (row<maze.length-1){
            mazePathWithObstacles(process+'D',maze,row+1,column);
        }
        if (column<maze[0].length-1){
            mazePathWithObstacles(process+'R',maze,row,column+ 1);
        }
    }
    public static void main(String[] args) {
        boolean [][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        mazePathWithObstacles("",board,0,0);

    }
}
