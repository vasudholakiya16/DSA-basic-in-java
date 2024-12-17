package Sorting.Merge_Sort_Using_Recursion;

import java.util.Arrays;

public class basic_example {

    static int[] margeSort(int [] arr){
        if (arr.length==1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left =margeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right= margeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return marge(left,right);
    }
    static int[] marge(int[]first,int[]second){
        int[] mix = new  int[first.length+ second.length];

        int i = 0;
        int j= 0 ;
        int pointer= 0;

        while (i< first.length && j< second.length){
            if (first[i]< second[j]){
                mix[pointer]= first[i];
                i++;
            }else {
                mix[pointer]=second[j];
                j++;
            }
            pointer++;
        }
// ii maybe possible that one of the arrays is not complete copy the remaining element
        /*
        bellow declare both loop at a time one is true
         */
        while (i< first.length){
            mix[pointer]= first[i];
            i++;
            pointer++;
        }

        while (j< second.length){
            mix[pointer]=second[j];
            j++;
            pointer++;
        }
            return mix;
    }

    public static void main(String[] args) {

        int [] arr = {8,3,4,12,5,6};
        arr = margeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
