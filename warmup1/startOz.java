package codingbat.solutions.warmup1;

public class startOz {
    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));
    }

    // Function done by Mariya
    public static String startOz(String str) {
        StringBuilder result = new StringBuilder();

        if (str.length() > 0 && str.charAt(0) == 'o') {
            result.append('o');
        }
        if (str.length() > 1 && str.charAt(1) == 'z') {
            result.append('z');
        }
        return result.toString();
    }
}
