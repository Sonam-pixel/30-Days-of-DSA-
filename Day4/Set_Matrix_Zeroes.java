package Day4;

import java.util.*;

public class Set_Matrix_Zeroes {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<int[]> zeroPositions = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroPositions.add(new int[]{i, j});
                }
            }
        }

        for (int[] pos : zeroPositions) {
            int row = pos[0];
            int col = pos[1];

            for (int j = 0; j < n; j++) {
                matrix[row][j] = 0;
            }
            for (int i = 0; i < m; i++) {
                matrix[i][col] = 0;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        setZeroes(matrix);

        System.out.println("\nMatrix After Setting Zeroes:");
        printMatrix(matrix);
    }
}
