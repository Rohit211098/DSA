package Recursion.ApnaCollege;

// calculate nth fibonacci series
public class Question5 {

    public static int solution(int num){

        if(num==0){
            return 0;

        }else if(num ==1){
            return 1;
        }

        return solution(num-1) + solution(num-2);
    }


}
