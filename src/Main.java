import Arrays.ApnaCollege.PracticeQuestions.*;
import Recursion.ApnaCollege.Question2;
import Recursion.ApnaCollege.Question4;
import TwoDArray.ApnaCollege.DiagonalSum;
import TwoDArray.ApnaCollege.SpiralMatrix;
import Strings.ApnaCollege.*;
import BitManuplation.ApnaCollege.*;
import Recursion.ApnaCollege.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int[] data = null;

        Scanner sc = new Scanner(System.in);

//        System.out.println("enter size ");
//        int a = sc.nextInt();
//        System.out.println("enter elements");
//        data = new int[a];
//        takeArrayInput(data,a,sc);
//        System.out.println("enter target");
//        int target = sc.nextInt();

//        int[][] dataC = {   {1,2,3,4},
//                            {5,6,7,8},
//                            {9,10,11,12},
//                            {13,14,15,16}};
//        int[][] dataC = {   {0,1,2},
//                {3,4,5},
//                {6,7,8}};

//        int[][] dataC = {   { 1, 2, 3},
//                            { 5, 6, 7},
//                            { 9,10,11},
//                            {13,14,15},
//                            {17,18,19}
//        };

//        SpiralMatrix.solution(dataC,5,3);
//        System.out.println();
//        SpiralMatrix.spiralPrint(5,3,dataC);
//        System.out.println();
//        SpiralMatrix.solution2(dataC);

//        DiagonalSum.solution(dataC);



//        System.out.println("shortest path  = "+ShortestPath.solution("NS"));

        //OddEven.solution(1);

        //GetSetClearBit.getIBit(10,3);

        int num = 26;

        //System.out.println( "factorial of "+ num +" is "+Factorial.factorial(num));

//        System.out.println( "sum of "+ num +" is "+Question4.solution(num));
        //System.out.println( "fibonacci of "+ num +" is "+Question5.solution(num));
        int[] array = {1,2,3,4,4,5};

        System.out.println("element found in index "+ Question8.solution(array,0,4));

//




    }

    private static void takeArrayInput(int[] data, int n, Scanner sc){
        for (int i=0;i<n;i++){
            data[i] = sc.nextInt();
        }
    }


}
