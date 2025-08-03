package codingbat.solutions.Recursion1;

public class bunnyEars{
    public static void main(String[] args) {
        System.out.println(bunnyEars2(0));
        System.out.println(bunnyEars2(1));
        System.out.println(bunnyEars2(2));
    }
    // Function done by Mariya
    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        if (bunnies % 2 == 1) {
            return 2 + bunnyEars2(bunnies - 1); //odd
        } else {
            return 3 + bunnyEars2(bunnies - 1); //even
        }
    }
}
