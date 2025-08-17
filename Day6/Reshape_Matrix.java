package Day6;

public class Reshape_Matrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;

        if (rows * cols != r * c) return mat;

        int[][] result = new int[r][c];

        for (int i = 0; i < rows * cols; i++) {
            result[i / c][i % c] = mat[i / cols][i % cols];
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;

        int[][] reshaped = matrixReshape(mat, r, c);

        System.out.println("Reshaped Matrix:");
        for (int[] row : reshaped) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
