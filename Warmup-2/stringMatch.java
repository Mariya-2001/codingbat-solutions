package codingbat.solutions.warmup2;

public class stringMatch {
    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
    }
    // Function done by Mariya
    public static int stringMatch(String a, String b) {
        int count = 0;
        int length = Math.min(a.length(), b.length());
        for (int i = 0; i < length - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++; // Increment
            }
        }
        return count;
    }
}
