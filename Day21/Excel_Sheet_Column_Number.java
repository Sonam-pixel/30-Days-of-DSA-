package Day21;

public class Excel_Sheet_Column_Number {
    // Function to convert Excel column title to number
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result = result * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        String column1 = "A";
        String column2 = "AB";
        String column3 = "ZY";
        System.out.println(column1 + " -> " + titleToNumber(column1)); 
        System.out.println(column2 + " -> " + titleToNumber(column2)); 
        System.out.println(column3 + " -> " + titleToNumber(column3)); 
    }
}
