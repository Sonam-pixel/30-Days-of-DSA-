package Day22;

public class Roman_to_Integer {
    public static void main(String[] args) {
        Roman_to_Integer obj = new Roman_to_Integer();
        
        // Example test cases
        System.out.println(obj.romanToInt("III"));    
        System.out.println(obj.romanToInt("IV"));    
        System.out.println(obj.romanToInt("IX"));     
        System.out.println(obj.romanToInt("LVIII"));  
        System.out.println(obj.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        int total = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = getValue(s.charAt(i));

            if (value < prev) {
                total -= value;
            } else {
                total += value;
            }

            prev = value;
        }
        return total;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
