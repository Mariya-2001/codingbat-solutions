package codingbat.solutions.warmup1;

public class or35 {
    public static void main(String[] args) {
        System.out.println(or35(3));
        System.out.println(or35(10));
        System.out.println(or35(8));
    }

    // Function done by Mariya
    public static boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }
}
