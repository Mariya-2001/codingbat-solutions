package codingbat.solutions.Recursion1;
public class countHi2{
    public static void main(String[] args) {
        System.out.println(countHi2("ahixhi"));
        System.out.println(countHi2("ahibhi"));
        System.out.println(countHi2("xhixhi"));
    }
    // Function done by Mariya
    public static int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.startsWith("hi")) {
            return 1 + countHi2(str.substring(2));
        } else if (str.length() > 2 && str.charAt(0) == 'x' && str.charAt(1) == 'i') {
            return countHi2(str.substring(2));
        } else {
            return countHi2(str.substring(1));
        }
    }
}
