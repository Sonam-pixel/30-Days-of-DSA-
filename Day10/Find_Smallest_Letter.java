package Day10;

public class Find_Smallest_Letter {
    static class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            int l = 0, r = letters.length - 1;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (letters[mid] <= target) l = mid + 1;
                else r = mid - 1;
            }
            return letters[l % letters.length];
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        char[] letters1 = {'c', 'f', 'j'};
        char target1 = 'a';
        System.out.println(sol.nextGreatestLetter(letters1, target1)); 

        char[] letters2 = {'c', 'f', 'j'};
        char target2 = 'c';
        System.out.println(sol.nextGreatestLetter(letters2, target2)); 

        char[] letters3 = {'x', 'x', 'y', 'y'};
        char target3 = 'z';
        System.out.println(sol.nextGreatestLetter(letters3, target3)); 
    }
}

