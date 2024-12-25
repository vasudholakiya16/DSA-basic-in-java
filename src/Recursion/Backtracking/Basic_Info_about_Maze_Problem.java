package Recursion.Backtracking;

import java.util.ArrayList;

public class Basic_Info_about_Maze_Problem {

    // Print the number of ways to solve the maze
    static int mazeProblem(int row, int column) {
        if (row == 1 || column == 1) {
            return 1;
        }
        int left = mazeProblem(row - 1, column);
        int right = mazeProblem(row, column - 1);
        return left + right;
    }

    // Print all complete paths
    static void mazePath(String process, int row, int column) {
        if (row == 1 && column == 1) {
            System.out.println(process);
            return;
        }
        if (row > 1) {
            mazePath(process + 'D', row - 1, column);
        }
        if (column > 1) {
            mazePath(process + 'R', row, column - 1);
        }
    }
    // add allPath in array List
    static ArrayList<String> mazePathList(String process,int row ,int column){
        if (row==1 && column==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row>1){
           list.addAll( mazePathList(process+'D',row-1,column));
        }
        if (column>1){
            list.addAll(mazePathList(process+'R',row,column-1));
        }
        return list;
    }

    // if we go diagonally
    static ArrayList<String> mazeDiagonal(String process,int row,int column){
        if (row==1 && column==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row>1 &&  column>1){
            list.addAll(mazeDiagonal(process+'D',row-1,column-1));
        }
        if (row>1){
            list.addAll(mazeDiagonal(process+'V',row-1,column));
        }
        if (column>1){
            list.addAll(mazeDiagonal(process+'H',row,column-1));
//            list.addAll(mazeDiagonal(process+'H',row,column-1));
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println("Number of ways: " + mazeProblem(3, 3));
        System.out.println("Paths:");
        mazePath("", 3, 3);
        System.out.print("Print the List Format:- ");
        ArrayList<String> ans = mazePathList("",3,3);
        System.out.println(ans);
        System.out.println("Print if we add to allow to Diagonal also:- ");
        ArrayList<String> ans1= mazeDiagonal("",3,3);
        System.out.println(ans1);
    }
}
