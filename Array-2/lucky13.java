package codingbat.solutions.Array2;
public class lucky13 {
    public static void main(String[] args) {
        System.out.println(lucky13(new int[]{0, 2, 4}));
        System.out.println(lucky13(new int[]{1, 2, 3}));
        System.out.println(lucky13(new int[]{1, 2, 4}));
    }

    // Function Done by Mariya
    public static boolean lucky13(int[] nums) {
        for (int num : nums) {
            if (num == 1 || num == 3) {
                return false;
            }
        }
        return true;
    }
}
