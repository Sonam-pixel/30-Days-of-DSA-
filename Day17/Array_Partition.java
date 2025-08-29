package Day17;

import java.util.Arrays;

public class Array_Partition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);  
        int sum = 0;
        
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i]; 
        }
        return sum;
    }

    public static void main(String[] args) {
        Array_Partition obj = new Array_Partition();
        int[] nums = {1, 4, 3, 2};
        int result = obj.arrayPairSum(nums);
        System.out.println("Maximum Sum of Min Pairs = " + result);
    }
}
