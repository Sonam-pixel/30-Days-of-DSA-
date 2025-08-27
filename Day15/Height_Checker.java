package Day15;

import java.util.Arrays;

public class Height_Checker {
    public static int heightChecker(int[] heights) {
        int[] expected = heights.clone(); // make a copy
        Arrays.sort(expected); // sort the copy
        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        System.out.println("Mismatched count: " + heightChecker(heights));
    }
}
