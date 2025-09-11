package Day30;

public class Single_Number {
    public static int singleNumber(int[] nums) {
        // Step 1: Initialize result = 0
        int result = 0;

        // Step 2: Traverse the array and XOR each number
        for (int num : nums) {
            result ^= num;
        }

        // Step 3: Return the unique number
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};  
        System.out.println("The single number is: " + singleNumber(nums));
    }
}
