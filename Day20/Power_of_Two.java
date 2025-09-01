package Day20;

public class Power_of_Two {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.isPowerOfTwo(1));   
        System.out.println(sol.isPowerOfTwo(2));  
        System.out.println(sol.isPowerOfTwo(16));  
        System.out.println(sol.isPowerOfTwo(18));  
        System.out.println(sol.isPowerOfTwo(0));   
        System.out.println(sol.isPowerOfTwo(-8));  
    }
}

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;        
        return (n & (n - 1)) == 0;     
    }
}

