package Day13;

class Sort_Array_By_Parity_II {
    public static int[] sortArrayByParityII(int[] nums) {
        int i = 0, j = 1, n = nums.length;
        while (i < n && j < n) {
            if (nums[i] % 2 == 0) i += 2; // even index is correct
            else if (nums[j] % 2 == 1) j += 2; // odd index is correct
            else { // swap wrong placements
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i += 2;
                j += 2;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 7}; 
        nums = sortArrayByParityII(nums);

        System.out.print("Sorted Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
