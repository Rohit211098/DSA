package Recursion.ApnaCollege;

// Print all binary  strings od size n without consecutive ones
public class Question12 {

    public static void solution(int n,int previous,String binary){

        if(n == 0){
            System.out.println(binary);
            return;
        }

        solution(n-1,0,binary+"0");

        if(previous == 0){
            solution(n-1,1,binary+"1");
        }

    }

}
