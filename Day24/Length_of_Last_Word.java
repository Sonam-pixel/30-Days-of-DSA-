package Day24;

public class Length_of_Last_Word {
    public static int lengthOfLastWord(String s) {
        // remove spaces from start and end
        s = s.trim();
        // find last space
        int lastSpace = s.lastIndexOf(" ");
        // return length of last word
        return s.length() - lastSpace - 1;
    }

    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        System.out.println(lengthOfLastWord(s1)); 
        System.out.println(lengthOfLastWord(s2)); 
        System.out.println(lengthOfLastWord(s3));
    }
}
