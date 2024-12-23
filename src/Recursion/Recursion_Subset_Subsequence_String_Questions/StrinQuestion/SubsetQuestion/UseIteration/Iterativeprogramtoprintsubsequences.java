package Recursion.Recursion_Subset_Subsequence_String_Questions.StrinQuestion.SubsetQuestion.UseIteration;

import java.util.ArrayList;
import java.util.List;
/*
                Create a copy of the ith list it means:- we create first one copy of the
                and after that copy is modify that
                for example
                arr=[1,2,3]
                in case of 1 we have two possible case
                case-1 accept:- [1]
                case-2 reject:-[]

                our final answer in 1 = [] [1]

                in cae of 2 we have two possibility
               case-1 accept:- [2] [1,2]
                        in case of accept we create a copy of [] [1]
                        after that update a value a copy and our update answer is

                        [2] [1,2]
               case-2 reject:- [] [1]

               our final answer in 2 = [2] [1,2] [] [1]

               in case of 3 we have two possibility
               case-1 accept:- in case of accept we create a copy of [2] [1,2] [] [1]
                        after that update a value a copy and our update answer is

                        [3] [1,3] [2,3] [1,2,3]

               our final answer in 3 = [2] [1,2] [] [1]  [3] [1,3] [2,3] [1,2,3]

                 */
public class Iterativeprogramtoprintsubsequences {

    static List<List<Integer>> subset(int [] arr){

        List<List<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<>()); // our initially list was empty that reason we add empty list
        for (int num :arr){
            int n = outerList.size(); // n represent the size of the list
            for (int i = 0; i <n ; i++) {
                // add the number in original list

                List<Integer> internal = new ArrayList<>(outerList.get(i)); // this is my internal list
                internal.add(num); // num represent a current number
                outerList.add(internal);
                
            }
        }
        return outerList;

    }

    public static void main(String[] args) {
        int [] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);

        for (List<Integer> list : ans){
            System.out.print(list);
        }


    }
}
