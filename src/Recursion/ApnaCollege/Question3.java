package Recursion.ApnaCollege;

// print number in increasing order
public class Question3 {

    public static void solution(int num){

        if(num >= 1){
            solution(num-1);
            System.out.println(num);
        }

    }
}
