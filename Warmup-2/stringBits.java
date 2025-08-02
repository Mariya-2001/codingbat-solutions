package codingbat.solutions.warmup2;

public class stringBits {
    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));
    }

    // Function done by Mariya
    public static String stringBits(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += 2) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
