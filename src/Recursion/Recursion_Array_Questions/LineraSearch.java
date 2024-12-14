package Recursion.Recursion_Array_Questions;

import java.util.ArrayList;

public class LineraSearch {

    static boolean linearSearch(int [] arr , int target,int index){
        if (index== arr.length){
            return false;
        }
        return arr[index] == target || linearSearch(arr,target,index+1);
    }
    static int findIndexInLinearSearch(int [] arr , int target , int index){
        if (index== arr.length){
            return -1;
        }
        if (arr[index]== target){
            return index;
        }else {
            return findIndexInLinearSearch(arr,target,index+1);
        }
    }

    static int findIndexOfLastInLinearSearch(int [] arr, int target, int index){
        if (index== -1){
            return -1;
        }
        if (arr[index]== target){
            return index;
        }else {
            return findIndexOfLastInLinearSearch(arr,target,index-1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }

    public static void main(String[] args) {
        int [] arr = {2,3,1,4,5};
        System.out.println(linearSearch(arr,4,0));
        System.out.println(findIndexInLinearSearch(arr,4,0));
        System.out.println(findIndexOfLastInLinearSearch(arr,4, arr.length-1));
        //        findAllIndex(arr, 4, 0);
//        System.out.println(list);

//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = findAllIndex(arr, 4, 0, list);
//        System.out.println(ans);
//        System.out.println(list);

        System.out.println(findAllIndex2(arr, 4, 0));
    }
}
