package Recursion;

public class BinarySearch {

    static int search(int[]arr,int target,int s , int e){
        if (s>e){
            return -1;
        }
        int m = s+ (e-s)/2;
        if (arr[m]==target){
            return m;
        }
        if (arr[m]>target){
        return     search(arr, target, s, m-1);
        }
        return search(arr, target, m+1, e);
//        search(arr,target,s,e);
    }
    public static void main(String[] args) {
int[] arr = {11,47,89,78,14};
        System.out.println(search(arr,89,0,arr.length-1));

    }
}
