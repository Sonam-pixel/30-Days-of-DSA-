package Day14;

class Squares_of_Sorted_Array {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 0, right = n - 1, k = n - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[k--] = nums[left] * nums[left];
                left++;
            } else {
                res[k--] = nums[right] * nums[right];
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = sortedSquares(nums);

        // Print result
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
