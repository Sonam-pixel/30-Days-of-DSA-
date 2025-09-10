package Day29;

import java.util.HashSet;

public class Happy_Number {
    public static void main(String[] args) {
        int n = 19;  
        System.out.println(isHappy(n)); 
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> visited = new HashSet<>();

        while (n != 1 && !visited.contains(n)) {
            visited.add(n);

            n = getSumOfSquares(n);
        }

        return n == 1;
    }

    private static int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
