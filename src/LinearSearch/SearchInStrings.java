package LinearSearch;

import java.util.Arrays;

public class SearchInStrings {
// Q-1 use simple for loop
    static  boolean search(String str,char target){ // in this case search is a function and str is a string and target is a char
        if (str.length() ==0 ){ // in this case length() is a function
            return false;     // in this case return is a keyword
        }
        for (int i = 0; i <str.length() ; i++) {
            if (target== str.charAt(i)){
                return true;
            }
        }
        return false;
    }
// use foreach loop
static  boolean search1(String str,char target){
    if (str.length() ==0 ){ // in this case length() is a function
        return false;

    }
    for (char ch: str.toCharArray()
         ) {
        if (ch == target)
         return true;
        
    }
    return false;
}

    public static void main(String[] args) {
        String name = "Vasu"; // string use double cords
        char target = 'u'; // use single cords
        System.out.println("Use Simple for loop:- "+search(name,target)); // use simple for loop to search the target in the string
        System.out.println("Our Char array is " + Arrays.toString(name.toCharArray()));
        System.out.println("Use Simple forEach loop:- "+search1(name,target));

    }

}
