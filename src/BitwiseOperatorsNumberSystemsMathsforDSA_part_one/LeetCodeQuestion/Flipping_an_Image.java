package BitwiseOperatorsNumberSystemsMathsforDSA_part_one.LeetCodeQuestion;

import java.util.Arrays;

public class Flipping_an_Image {

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            // Reverse and invert the array
            for (int i = 0; i < (row.length + 1) / 2; i++) {
                // Swap and invert the elements
                int temp = row[i] ^ 1;
                row[i] = row[row.length - 1 - i] ^ 1;
                row[row.length - 1 - i] = temp;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println("Our input is: " + Arrays.deepToString(image));
        System.out.println("Our output is: " + Arrays.deepToString(flipAndInvertImage(image)));
    }
}
