package codingbat.solutions.warmup2;

public class stringSplosion {
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));
    }
    // Function done by Mariya
    public static String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(str.substring(0, i + 1));
        }
        return result.toString();
    }
}