package Day27;

public class FindIndex {
    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        // Loop until last possible starting position
        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i; // Found
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";

        int index = strStr(haystack, needle);
        System.out.println("Index of first occurrence: " + index);
    }
}
