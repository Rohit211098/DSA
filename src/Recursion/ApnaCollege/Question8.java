package Recursion.ApnaCollege;

// program to find last occurrence of an element in an array using recursion
public class Question8 {

    public static int solution(int[] array, int i, int element){
        if(i == array.length)
            return -1;

        int isFound = solution(array,i+1,element);


        if(isFound == -1 && array[i] == element){
            return i;
        }

        return isFound;

    }
}
