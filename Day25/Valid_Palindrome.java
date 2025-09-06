package Day25;

public class Valid_Palindrome {
    public static boolean isPalindrome(String s) {
        // Convert to lowercase and remove non-alphanumeric characters
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        // Two-pointer approach
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";

        System.out.println(s1 + " -> " + isPalindrome(s1)); 
        System.out.println(s2 + " -> " + isPalindrome(s2)); 
    }  
}
