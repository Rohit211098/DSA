package Recursion.ApnaCollege;

// program to find first occurrence of an element in an array using recursion
public class Question7 {

    public static int solution(int[] array,int i,int element){



        if(array[i] == element)
            return i;
        else  if(i == array.length-1)
            return -1;
        else
            return solution(array,i+1,element);


    }
}
