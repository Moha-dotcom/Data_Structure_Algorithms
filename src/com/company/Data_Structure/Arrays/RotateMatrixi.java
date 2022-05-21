package com.company.Data_Structure.Arrays;

import java.util.Arrays;

public class RotateMatrixi {


    public static void main(String[] args) {


        int matrix [][] = new  int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));;


    }

    public static boolean rotateMatrix(int [][] matrix){

        if(matrix.length == 0 || matrix.length != matrix[0].length)
            return false;

        /*  top
            1, 2 , 3
    left    4, 5,  6 right
            7, 8,  9
               bottim



         */
        int n = matrix.length;

        for(int layer = 0; layer < n /2 ; layer++){
            int first = layer;
            int last = n - 1 - layer;
            for(int i = first; i< last; i++){
                int offset = i - first;
                int top =matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;

            }
        }



        return true;
    }


    public static void rotate(int[][] matrix) {

        int n = matrix.length;
        for (int i = 0; i < (n + 1) / 2; i ++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
                matrix[j][n - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}
