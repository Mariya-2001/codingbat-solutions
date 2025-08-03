package codingbat.solutions.Recursion1;
public class count7{
    public static void main(String[] args) {
        System.out.println(count7(717));
        System.out.println(count7(7));
        System.out.println(count7(123));
    }
    // Function done by Mariya
    public static int count7(int n) {
        if (n == 0) {
            return 0;
        }
        int count = (n % 10 == 7) ? 1 : 0;
        return count + count7(n / 10);
    }
}
