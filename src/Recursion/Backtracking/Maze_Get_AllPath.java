package Recursion.Backtracking;

public class Maze_Get_AllPath {

    static void mazeAllDirection(String process,boolean [] [] maze,int row ,int column){
        if (row==maze.length-1 && column==maze[0].length-1){
            System.out.println(process);
            return;
        }
        if (!maze[row][column]){
            return;
        }
        if (row<maze.length-1){
            mazeAllDirection(process+'D',maze,row+1,column);
        }
        if (column<maze[0].length-1){
            mazeAllDirection(process+'R',maze,row,column+1);
        }
        if (row>0){
            mazeAllDirection(process+'U',maze,row-1,column);
        }
        if (column>0){
            mazeAllDirection(process+'L',maze,row,column-1);
        }
    }
    public static void main(String[] args) {
        boolean [][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        mazeAllDirection("",board,0,0);

    }
}
