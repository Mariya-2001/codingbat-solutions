package codingbat.solutions.warmup1;

public class backAround {
    public static void main(String[] args) {

        System.out.println(backAround("cat"));
        System.out.println(backAround("Hello"));
        System.out.println(backAround("a"));
    }
// Function done by Mariya
    public static String backAround(String str) {

        char lastChar = str.charAt(str.length() - 1);

        return lastChar + str + lastChar;
    }
}

