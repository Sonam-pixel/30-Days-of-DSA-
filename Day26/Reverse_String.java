package Day26;

public class Reverse_String {
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        
        System.out.println("Before: " + new String(s));
        reverseString(s);
        System.out.println("After: " + new String(s));
    }
}
