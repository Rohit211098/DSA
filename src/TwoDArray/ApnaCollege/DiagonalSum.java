package TwoDArray.ApnaCollege;

public class DiagonalSum {

    public static void solution(int[][] matrix){

        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        for(int i=0; i<matrix.length ; i++){
//            for(int j=0; j<matrix.length ; j++){
//
//                if(i==j){
//                    primaryDiagonal += matrix[i][j];
//                    break;
//                }
//
//            }
            primaryDiagonal += matrix[i][i];
            secondaryDiagonal += matrix[i][matrix.length-1-i];

        }

        System.out.println("Primary sum ="+primaryDiagonal);
        System.out.println("Secondary sum ="+secondaryDiagonal);
        System.out.println("sum ="+(secondaryDiagonal+primaryDiagonal));


    }

}
