package Recursion.ApnaCollege;

//Tiling Problem
//Given a "2xN" board / surface  and tiles of size "2x1", count the number of ways to tile the given board using the "2x1"
//tiles (A tile can either be placed horizontally or vertically.)
public class Question10 {

    public static int solution(int n){

        if(n==0|| n==1){
            return 1;
        }

        int vertically = solution(n-1);
        int horizontally = solution(n-2);

        return vertically + horizontally;

    }


}
