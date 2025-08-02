package codingbat.solutions.warmup1;

public class StringE{
    public static void main(String[] args) {
        System.out.println(StringE("Hello"));    // true
        System.out.println(StringE("Heelle"));   // true
        System.out.println(StringE("Heelele"));  // false
    }

    // Function done by Mariya
    public static boolean StringE(String str) {
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == 'e') {
                count++;
            }
        }

        return count >= 1 && count <= 3;
    }
}
