package codingbat.solutions.Recursion1;
public class countAbc{
    public static void main(String[] args) {
        System.out.println(countAbc("abc"));
        System.out.println(countAbc("abcxxabc"));
        System.out.println(countAbc("abaxxaba"));
    }
    // Function done by Mariya
    public static int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        }
        if (str.startsWith("abc") || str.startsWith("aba")) {
            return 1 + countAbc(str.substring(1));
        } else {
            return countAbc(str.substring(1));
        }
    }
}
