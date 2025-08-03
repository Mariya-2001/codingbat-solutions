package codingbat.solutions.Recursion1;
public class strCount {
    public static void main(String[] args) {
        System.out.println(strCount("catcowcat", "cat"));
        System.out.println(strCount("catcowcat", "cow"));
        System.out.println(strCount("catcowcat", "dog"));
    }
    // Function done by Mariya
    public static int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.startsWith(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        } else {
            return strCount(str.substring(1), sub);
        }
    }
}
