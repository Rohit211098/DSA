package Recursion.ApnaCollege;

// print numbers in decreasing order ex - 5,4,3,2,1
public class Question2 {

    public static void solution(int num){
        System.out.println(num);
        if(num > 1)
            solution(num-1);

    }

}
