package BinarySearch.MultidimensionalArrays;

import java.util.Arrays;

public class BasicCodeInMultidimensionalArraysIfOurArrayIsSorted {

    static int[] search(int [][] matrix,int target){
        // if maybe possible our matrix is 1-D
        int rows =matrix.length;
        int column = matrix[0].length; // be cautious our matrix is maybe empty

        if (rows==1 ){
            return simpleBinarySearch(matrix,0,0,column-1,target);
        }
        // run the loop tell 2 rows are remaining
        int rowStart = 0;
        int rowEnd = rows -1;
        int midColumn = column/2;
        while (rowStart<(rowEnd-1)){
            /* while this is true it mains we have more-then two rows,
            and we try to remove all extra rows
            check 3 cases
             */

            int mid = rowStart+(rowEnd-rowStart)/2;

//            case-1  our element is our target
 /*                  |0| |1| |2| |3|
                |0|{ |1|,|2|,|3|,|4|},
                |1|{ |5|,|6|,|7|,|8|},
                |2|{ |9|,|10|,|11|,|12|},
                |3|{|13|,|14|,|15|,|16|},

                (0+3)/2 = 1 index is our mid-column
               check in mid-column index (0+3)/2 = 1 index is our mid-element in mid-column
             */

            if (matrix[mid][midColumn] == target){
                return new int[]{mid,midColumn};
            }

//            case - 2  Ignore the above row it mains our start is come to bellow
            if (matrix[mid][midColumn]< target){
                rowStart = mid;
            }else {
                rowEnd = mid;
            }


        }

        // naw we have two rows

        /* check our mid-element is target or not
        check weather the target is in the column of two rows
         */
        if (matrix[rowStart][midColumn]== target){
            return new int[]{ rowStart,midColumn};
        }
        if (matrix[rowStart+1] [midColumn] == target){
            return new int[]{rowStart+1,midColumn};
        }
        /* otherwise search in 1st half  */
        if (target <= matrix[rowStart][midColumn-1]){
            return simpleBinarySearch(matrix,rowStart,0,midColumn-1,target);
        }
        /* otherwise search in 2nd half  */
        if (target>=matrix[rowStart][midColumn+1] && target<=matrix[rowStart][column-1]){
            return simpleBinarySearch(matrix,rowStart,midColumn+1,column-1,target);
        }
        /* otherwise search in 3rd half  */
        if (target<=matrix[rowStart+1][midColumn-1]){
            return  simpleBinarySearch(matrix,rowStart+1,0,midColumn-1,target);
        }
        /* otherwise search in 4th half  */
        else {
         return simpleBinarySearch(matrix,rowStart+1,midColumn+1,column-1,target);

        }

    }


    // search in the row provided between teh column provided
    static int[] simpleBinarySearch (int [][] matrix, int row,int columnStart,int columnEnd,int target){
        while (columnStart<=columnEnd){
            int mid = columnStart + (columnEnd- columnStart)/2;

            if (matrix[row][mid]== target){
                return new int[] {row,mid};
            }
            if (matrix[row][mid]<target){
                columnStart = mid+1;
            }else {
                columnEnd = mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {

        int [][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
        System.out.println(Arrays.toString(search(arr, 5)));

    }
}
