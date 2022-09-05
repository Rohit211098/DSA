package TwoDArray.ApnaCollege;

public class SpiralMatrix {

    public static void spiralPrint(int m, int n, int a[][])
    {
        int i, k = 0, l = 0;

        /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */

        while (k < m && l < n) {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;

            // Print the last column from the remaining
            // columns
            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;

            // Print the last row from the remaining rows */
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }

            // Print the first column from the remaining
            // columns */
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
    }

    public static void solution2(int[][] matrix){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow<=endRow && startCol<= endCol){

            //top
            for(int j=startCol ; j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //right
            for(int i=startRow+1; i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //left
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;

        }

        System.out.println();


    }

    public static void solution(int[][] matrix,int n,int m){

        int startColumn = 0;
        int endColumn = m-1;
        int startRow = 0;
        int endRow = n-1;


        while(startRow<=endRow && startColumn<=endColumn){


            for(int i=startColumn;i<=endColumn ;i++){
                System.out.print("-"+matrix[startRow][i]);
            }


            for(int i=startRow+1;i<=endRow ;i++){
                System.out.print("-"+matrix[i][endColumn]);
            }


            for(int i=endColumn-1;i>=startColumn ;i--){
                if(startColumn == endColumn)
                    break;
                System.out.print("-"+matrix[endRow][i]);
            }


            for(int i=endRow-1;i>=startRow+1 ;i--){
                System.out.print("-"+matrix[i][startColumn]);
            }


            startColumn++;
            startRow++;
            endColumn--;
            endRow--;




        }




    }


}
