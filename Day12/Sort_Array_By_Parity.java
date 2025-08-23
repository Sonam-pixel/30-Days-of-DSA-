package Day12;

class Sort_Array_By_Parity {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};

        Solution sol = new Solution();
        int[] result = sol.sortArrayByParity(nums);

        System.out.print("Sorted by Parity: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            // If left is even, move forward
            if (nums[left] % 2 == 0) {
                left++;
            }
            // If right is odd, move backward
            else if (nums[right] % 2 == 1) {
                right--;
            }
            // Otherwise, swap left (odd) and right (even)
            else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }
}
