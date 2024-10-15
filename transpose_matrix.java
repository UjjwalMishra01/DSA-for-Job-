package src;

import java.util.Arrays;

public class transpose_matrix {
    public static void main(String[] args) {
    int[][] matrix  = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(transpose(matrix)));
    }
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
     int[][] transpose = new int[m][m];
     for(int i=0; i<matrix.length-1; i++){
         for(int j=0; j<matrix[i].length-1; j++){
             transpose[j][i] = matrix[i][j];
         }
     }
     return transpose;
    }
}
