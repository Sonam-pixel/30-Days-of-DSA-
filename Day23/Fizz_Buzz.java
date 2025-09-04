package Day23;

import java.util.*;

public class Fizz_Buzz {
    public static void main(String[] args) {
        int n = 15; 
        List<String> result = Fizz_Buzz(n);

        for (String s : result) {
            System.out.println(s);
        }
    }

    public static List<String> Fizz_Buzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }
}
