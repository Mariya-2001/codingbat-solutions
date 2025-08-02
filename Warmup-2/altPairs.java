package codingbat.solutions.warmup2;

public class altPairs {
    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
    }

    // Function done by Mariya
    public static String altPairs(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += 4) {
            result.append(str.charAt(i));
            if (i + 1 < str.length()) {
                result.append(str.charAt(i + 1));
            }
        }
        return result.toString();
    }
}