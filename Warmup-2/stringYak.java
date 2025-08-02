package codingbat.solutions.warmup2;

public class stringYak {
    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123ya"));
    }
    // Function done by Mariya
    public static String stringYak(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 'k') {
                i += 2;
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
