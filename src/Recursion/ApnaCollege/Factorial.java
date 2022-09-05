package Recursion.ApnaCollege;

public class Factorial {



    public static int factorial(int num){
        if(num > 1){
            return num * factorial(num-1);
        }

        return num;

    }
}
