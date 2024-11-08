package src;

public class valid_matrix {
        public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
            int numRows = rowSum.length;
            int numCols = colSum.length;
            int[][] matrix = new int[numRows][numCols];

            for (int i = 0; i < numRows; ++i) {
                for (int j = 0; j < numCols; ++j) {
                    matrix[i][j] = Math.min(rowSum[i], colSum[j]);
                    rowSum[i] -= matrix[i][j];
                    colSum[j] -= matrix[i][j];
                }
            }

            return matrix;
        }
    }

