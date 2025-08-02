package codingbat.solutions.warmup1;

public class frontBack {
    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
    }

    // Function done by Mariya
    public static String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        return lastChar + str.substring(1, str.length() - 1) + firstChar;
    }
}
