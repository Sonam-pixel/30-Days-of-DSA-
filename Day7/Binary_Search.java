public class Binary_Search {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  

            if (nums[mid] == target) {
                return mid;  
            } else if (nums[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return -1;  
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int result = search(nums, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found!");
        }
    }
}
