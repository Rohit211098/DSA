package Recursion.ApnaCollege;

// print sum of first n natural number
public class Question4 {

    public static int solution(int num){
        if(num > 1){
            return num + solution(num -1);
        }

        return num;

    }

}
