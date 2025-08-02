package codingbat.solutions.warmup1;

public class lastDigit {
    public static void main(String[] args) {
        System.out.println(lastDigit(7, 17));
        System.out.println(lastDigit(6, 17));
        System.out.println(lastDigit(3, 113));
    }

    // Function done by Mariya
    public static boolean lastDigit(int a, int b) {
        return (a % 10) == (b % 10);
    }
}