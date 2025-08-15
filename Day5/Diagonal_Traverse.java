package Day5;

import java.util.Arrays;

public class Diagonal_Traverse {
    
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];
        
        int rows = mat.length;
        int cols = mat[0].length;
        int[] result = new int[rows * cols];
        
        int r = 0, c = 0, d = 1; // d = 1 means moving up-right, d = -1 means down-left
        for (int i = 0; i < result.length; i++) {
            result[i] = mat[r][c];
            
            // Moving up-right
            if (d == 1) {
                if (c == cols - 1) { r++; d = -1; }       
                else if (r == 0) { c++; d = -1; }        
                else { r--; c++; }                    
            }
            // Moving down-left
            else {
                if (r == rows - 1) { c++; d = 1; }      
                else if (c == 0) { r++; d = 1; }         
                else { r++; c--; }                        
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Diagonal_Traverse dt = new Diagonal_Traverse();
        
        int[][] mat = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };
        
        int[] result = dt.findDiagonalOrder(mat);
        
        System.out.println(Arrays.toString(result));
    }
}
