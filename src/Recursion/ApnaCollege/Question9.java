package Recursion.ApnaCollege;

// program to print x^n using recursion
public class Question9 {

    // time complexity O(n) linear
    public static int solution(int x, int n){
        if(n==0)
            return 1;
        return x * solution(x,n-1);
    }

    public static int solution2(int x,int n){

        if(n==0)
            return 1;

        int halfPower = solution2(x,n/2);

        int fullPower = halfPower * halfPower;

        if(n%2 != 0){
            fullPower = x * fullPower;
        }

        return fullPower;

    }

}
