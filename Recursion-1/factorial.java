package codingbat.solutions.Recursion1;

public class factorial{
    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(5));
    }
    //Function Done By Mariya
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1); //formula
        }
    }
}
