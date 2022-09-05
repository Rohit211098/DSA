package Recursion.ApnaCollege;

// check if given array is sorted in ascending order or not
public class Question6 {


    public static boolean solution(int[] array , int i ){

        // base condition
        if(i == array.length -1)
            return true;

        if(array[i] < array[i+1])
             return solution(array,i+1);
        else
            return false;


    }


}
