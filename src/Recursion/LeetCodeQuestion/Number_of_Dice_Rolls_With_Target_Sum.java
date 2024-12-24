package Recursion.LeetCodeQuestion;

import java.util.ArrayList;

public class Number_of_Dice_Rolls_With_Target_Sum {

    static void printDiceCombinations(String process, int target) {
        if (target == 0) {
            System.out.println(process);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            printDiceCombinations(process + i, target - i);
        }
    }

    static ArrayList<String> getDiceCombinations(String process, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(getDiceCombinations(process + i, target - i));
        }
        return list;
    }

    static int diceCount(String process, int target) {
        if (target == 0) {
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= 6 && target >= i; i++) {
            count = count + diceCount(process + i, target - i);
        }
        return count;
    }

    static void diceFace(String process, int target, int face) {
        if (target == 0) {
            System.out.println(process);
            return;
        }
        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(process + i, target - i, face);
        }
    }

    static ArrayList<String> getDiceCombinationsFaces(String process, int target, int face) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= face && i <= target; i++) {
            list.addAll(getDiceCombinationsFaces(process + i, target - i, face));
        }
        return list;
    }

    public static void main(String[] args) {
        // Print combinations directly
        System.out.println("Dice Combinations:");
        printDiceCombinations("", 4);

        // Get list of combinations and display it
        System.out.println("\nList of Dice Combinations:");
        ArrayList<String> combinations = getDiceCombinations("", 4);
        System.out.println(combinations);

        // Count and display the total number of combinations
        System.out.println("\nCount of Combinations:");
        System.out.println("Count of Combination is " + diceCount("", 4));

        // Print combinations with custom dice faces
        System.out.println("\nDice Combinations with Custom Faces :");
        diceFace("", 5, 8);

        // Get list of combinations with custom dice faces and display it
        System.out.println("\nList of Dice Combinations with Custom Faces:");
        ArrayList<String> combinationsWithFaces = getDiceCombinationsFaces("", 4, 8);
        System.out.println(combinationsWithFaces);
    }
}
